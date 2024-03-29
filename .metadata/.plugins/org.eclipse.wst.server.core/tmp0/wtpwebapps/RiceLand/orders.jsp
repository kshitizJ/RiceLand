<%@page import="com.detail.Order"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.OrderDao"%>
<%@page import="com.db.DbConnect"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="com.detail.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
User user1 = (User) session.getAttribute("user");
if (user1 != null) {
%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./all_components/common.jsp"%>
<title>My Orders</title>
</head>
<body>
	<%@include file="./all_components/navbar.jsp"%>
	<section id="cartItems">
		<div class="container">
			<div class="row d-flex justify-content-center align-items-center">
				<div class="col-12">
					<h2 class="title">Orders</h2>
				</div>
				<%
					OrderDao orderdao = new OrderDao(DbConnect.getCon());
				List<Order> orders = orderdao.getOrder(user.getId());
				%>
				<div class="col-12">
					<table class="table">
						<thead class="thead-dark">
							<tr>
								<th scope="col">Product</th>
								<th scope="col">Price</th>
								<th scope="col">Quantity</th>
								<th scope="col">Subtotal</th>
								<th scope="col">Status</th>
							</tr>
						</thead>
						<tbody>
							<%
								Product product;
							ProductDao productdao = new ProductDao(DbConnect.getCon());
							for (Order order : orders) {
								product = new Product();
								product = productdao.getProduct(order.getPid());
							%>
							<tr>
								<td>
									<div class="cart-info d-flex align-items-center">
										<img style="border-radius: 5px;"
											src="./assets/images/rice/<%=product.getPath()%>">
										<div>
											<p><%=product.getName()%></p>
										</div>
									</div>
								</td>
								<td><i class="fas fa-rupee-sign"></i> <%=order.getPrc()%></td>
								<td>
									<p class="item-amount"><%=order.getQuant()%></p>
								</td>
								<td><i class="fas fa-rupee-sign"></i> <%=order.getStotal()%>/-</td>
								<td><%=order.getSts()%></td>
							</tr>
							<%
								}
							%>
						</tbody>
					</table>
				</div>
				<%
					int sum = 0;
				for (Order order : orders) {
					sum += order.getStotal();
				}
				%>
				<div class="col-12 d-flex justify-content-center">
					<div class="total-price">
						<table class="table table-bordered">
							<tr>
								<td>Total</td>
								<td><i class="fas fa-rupee-sign"></i> <%=sum%>/-</td>
							</tr>
						</table>
					</div>
				</div>
				<div class="col-12 text-center">
					<a onclick="printpdf()"><button class="btn">Generate
							Bill</button></a>
				</div>
			</div>
		</div>
	</section>
</body>
<script type="text/javascript">
	function printpdf() {
		myWindow = window.open("bill.jsp");
		myWindow.close; //optional, to close the new window as soon as it opens
		//this ensures user doesn't have to close the pop-up manually
	}
</script>

</html>
<%
	} else {
response.sendRedirect("login.jsp");
}
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
User user1 = (User) session.getAttribute("user");
if (user1 == null) {
	response.sendRedirect("login.jsp");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./all_components/common.jsp"%>
<title>Cart</title>
</head>
<body>
	<%@include file="./all_components/navbar.jsp"%>
	<section id="cartItems">
		<div class="container">
			<div class="row d-flex justify-content-center align-items-center">
				<div class="col-12">
					<h2 class="title">Cart</h2>
				</div>
				<div class="col-12">
					<table class="table">
						<thead class="thead-dark">
							<tr>
								<th scope="col">Product</th>
								<th scope="col">Quantity</th>
								<th scope="col">Subtotal</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>
									<div class="cart-info">
										<img style="border-radius: 5px;"
											src="./assets/images/rice/basmati (3).jpeg">
										<div>

											<p>Bamati Rice by Kohinoor</p>

											<small>Price: Rs.170/Kg</small> <br> <a href=""><b>Remove</b></a>
										</div>
									</div>
								</td>
								<td><i class="fas fa-chevron-up" data-id=${item.id}></i>
									<p class="item-amount">1</p> <i class="fas fa-chevron-down"
									data-id=${item.id}></i></td>
								<td>Rs.170</td>
							</tr>
							<tr>
								<td>
									<div class="cart-info">
										<img style="border-radius: 5px;"
											src="./assets/images/rice/brown%20(3).jpeg">
										<div>

											<p>Brown Rice</p>

											<small>Price: Rs.110/Kg</small> <br> <a href=""><b>Remove</b></a>
										</div>
									</div>
								</td>
								<td><i class="fas fa-chevron-up" data-id=${item.id}></i>
									<p class="item-amount">1</p> <i class="fas fa-chevron-down"
									data-id=${item.id}></i></td>
								<td>Rs.110</td>
							</tr>
							<tr>
								<td>
									<div class="cart-info">
										<img style="border-radius: 5px;"
											src="./assets/images/rice/black%20(2).jpg">
										<div>

											<p>Black Rice</p>

											<small>Price: Rs.325/Kg</small> <br> <a href=""><b>Remove</b></a>
										</div>
									</div>
								</td>
								<td><i class="fas fa-chevron-up" data-id=${item.id}></i>
									<p class="item-amount">1</p> <i class="fas fa-chevron-down"
									data-id=${item.id}></i></td>
								<td>Rs.325</td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="col-12 d-flex justify-content-center">
					<div class="total-price">
						<table class="table table-bordered">
							<tr>
								<td>Total</td>
								<td>RS.640</td>
							</tr>
						</table>
					</div>
				</div>
				<div class="col-12 text-center">
					<button type="submit" class="btn">Checkout</button>
				</div>
			</div>
		</div>
	</section>
	<!------ end of cart item details------>
	<%@include file="./all_components/footer.jsp"%>
</body>
</html>
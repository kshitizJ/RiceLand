<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.detail.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.db.DbConnect"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="com.detail.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
Admin admin1 = (Admin) session.getAttribute("admin");
if (admin1 != null) {
%>
<!DOCTYPE html>
<html>
<head>
<%@include file="common.jsp"%>
<title>Products</title>
</head>
<body>
	<%@include file="adminNav.jsp"%>
	<%
		ProductDao productdao = new ProductDao(DbConnect.getCon());
	List<Product> products = productdao.getProducts();
	SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
	%>
	<div class="container-fluid">
		<div class="row">
			<div class="col-12 my-4">
				<h1 class="text-center">Products</h1>
			</div>
			<div class="col-12">
				<%
					String msg = (String) session.getAttribute("msg");
				if ("Failed to delete a product, please try again...".equals(msg)) {
				%>
				<div class="alert alert-danger" role="alert">Failed to add the
					product, please try again...</div>
				<%
					session.removeAttribute("msg");
				} else if ("Product deleted successfully...".equals(msg)) {
				%>
				<div class="alert alert-success" role="alert">Successfully
					added the product...</div>
				<%
					session.removeAttribute("msg");
				} else if ("Successfully edited the product...".equals(msg)) {
				%>
				<div class="alert alert-success" role="alert">Successfully
					edited the product...</div>
				<%
					session.removeAttribute("msg");
				} else if ("Failed to edit the product, please try again...".equals(msg)) {
				%>
				<div class="alert alert-danger" role="alert">Failed to edit the product, please try again...</div>
				<%
					session.removeAttribute("msg");
				}
				%>
			</div>
			<div class="col-12 mb-3">
				<h4 class="text-right text-success">
					Total Products:
					<%=products.size()%>
				</h4>
			</div>
			<div class="col-12">
				<table class="table table-responsive table-bordered">
					<thead>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Price</th>
							<th>Star</th>
							<th>Description</th>
							<th>Category</th>
							<th>Status</th>
							<th>Date Added</th>
							<th>Edit</th>
							<th>Delete</th>
						</tr>
					</thead>
					<tbody>
						<%
							for (Product p : products) {
						%>
						<tr>
							<th><%=p.getPid()%></th>
							<th><%=p.getName()%></th>
							<th><%=p.getPrice()%> / kg</th>
							<th><%=p.getStar()%></th>
							<th><%=p.getDescription()%></th>
							<th><%=p.getCategory()%></th>
							<th><%=p.getStatus()%></th>
							<th><%=ft.format(p.getDate())%></th>
							<th><a class="btn btn-warning"
								href="editProduct.jsp?id=<%=p.getPid()%>">Edit</a></th>
							<th><a class="btn btn-danger"
								href="../DeleteProduct?id=<%=p.getPid()%>">Delete</a></th>
						</tr>
						<%
							}
						%>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>
<%
	} else {
response.sendRedirect("../login.jsp");
}
%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.db.DbConnect"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="com.detail.Product"%>
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
<title>Edit Product</title>
</head>
<body>
	<%@include file="adminNav.jsp"%>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
	ProductDao productdao = new ProductDao(DbConnect.getCon());
	Product product = productdao.getProduct(id);
	SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
	String date = ft.format(product.getDate());
	%>
	<div class="container">
		<div class="row">
			<div class="col-12 my-4">
				<h4 class="text-center">Edit Product</h4>
			</div>
			<div class="col-12 mb-3">
				<h4 class="text-center text-danger">
					Product Id:
					<%=product.getPid()%></h4>
			</div>
			<div class="col-12">
				<form class="row" action="../EditProductDetail" method="post">
					<input type="hidden" value="<%=id%>" name="id">
					<div class="col-md-6 mb-3">
						<label for="validationCustom01">Name</label> <input type="text"
							class="form-control" id="validationCustom01"
							placeholder="Product Name" name="name"
							value="<%=product.getName()%>" required>
					</div>
					<div class="col-md-6 mb-3">
						<label class="form-label" for="">Image</label>
						<div class="custom-file">
							<label class="custom-file-label" for="customFile">Choose
								file</label> <input type="file" class="custom-file-input form-control"
								id="customFile" value="<%=product.getPath()%>"
								disabled="disabled" required>
						</div>
					</div>
					<div class="col-md-6 mb-3">
						<label for="validationCustom01">Price</label> <input type="number"
							class="form-control" id="validationCustom01"
							placeholder="Product Price" min="0"
							value="<%=product.getPrice()%>" name="price" required>
					</div>
					<div class="col-md-6">
						<label class="form-label" for="star">Star</label> <select
							class="custom-select" id="star" disabled="disabled">
							<option value="<%=product.getStar()%>" selected><%=product.getStar()%></option>
						</select>
					</div>
					<div class="form-group col-md-6 mb-3">
						<label for="description">Description</label>
						<textarea class="form-control" id="description" name="description"
							rows="1" placeholder="Description" required><%=product.getDescription()%></textarea>
					</div>
					<div class="col-md-6 mb-3">
						<label for="category">Category</label> <select
							class="custom-select" id="category" name="category" required>
							<%
								if ("Featured".equals(product.getCategory())) {
							%>
							<option value="featured" selected>Featured</option>
							<%
								} else {
							%>
							<option value="featured">Featured</option>
							<%
								}
							if ("Latest".equals(product.getCategory())) {
							%>
							<option value="latest" selected>Latest</option>
							<%
								} else {
							%>
							<option value="latest">Latest</option>
							<%
								}
							%>
						</select>
					</div>
					<div class="col-md-6 mb-3">
						<label for="status">Status</label> <select class="custom-select"
							id="status" name="status" required>
							<%
								if ("pending".equals(product.getStatus())) {
							%>
							<option value="pending" selected>Out Of Stock</option>
							<%
								} else {
							%>
							<option value="pending">Out Of Stock</option>
							<%
								}
							if ("completed".equals(product.getStatus())) {
							%>
							<option value="completed" selected>In Stock</option>
							<%
								} else {
							%>
							<option value="completed">In Stock</option>
							<%
								}
							%>
						</select>
					</div>
					<div class="col-md-6 mb-3">
						<label for="validationCustom01">Date Created On</label> <input
							disabled="disabled" type="text" class="form-control"
							id="validationCustom01" value="<%=date%>" required>
					</div>
					<div class="col-12 mb-3 text-center">
						<button type="submit" class="btn btn-success">Submit</button>
					</div>
				</form>
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
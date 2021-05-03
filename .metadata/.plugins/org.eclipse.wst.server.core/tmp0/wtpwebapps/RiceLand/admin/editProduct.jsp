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
		Product product = (Product) request.getParameter("product");
	%>
	<div class="container">
		<div class="row">
			<div class="col-12 my-4">
				<h4 class="text-center">Edit Product</h4>
			</div>
			<div class="col-12 mb-3">
				<h4 class="text-center text-danger">Product Id:</h4>
			</div>
			<div class="col-12">
				<form class="row" action="" method="post">
					<div class="col-md-6 mb-3">
						<label for="validationCustom01">Name</label> <input type="text"
							class="form-control" id="validationCustom01"
							placeholder="Product Name" required>
					</div>
					<div class="col-md-6 mb-3">
						<label class="form-label" for="">Image</label>
						<div class="custom-file">
							<label class="custom-file-label" for="customFile">Choose
								file</label> <input type="file" class="custom-file-input form-control"
								id="customFile" required>
						</div>
					</div>
					<div class="col-md-6 mb-3">
						<label for="validationCustom01">Price</label> <input type="number"
							class="form-control" id="validationCustom01"
							placeholder="Product Price" min="0" required>
					</div>
					<div class="col-md-6">
						<label class="form-label" for="star">Star</label> <select
							class="custom-select" id="star" name="star" disabled="disabled">
							<option value="0" selected>0</option>
						</select>
					</div>
					<div class="form-group col-md-6 mb-3">
						<label for="review">Description</label>
						<textarea class="form-control" id="review" name="review" rows="1"
							placeholder="Description" required></textarea>
					</div>
					<div class="col-md-6 mb-3">
						<label for="validationCustom01">Category</label> <input
							type="text" class="form-control" id="validationCustom01"
							placeholder="Product Category" required>
					</div>
					<div class="col-md-6 mb-3">
						<label for="validationCustom01">Status</label> <input type="text"
							class="form-control" id="validationCustom01"
							placeholder="Product Status" required>
					</div>
					<div class="col-md-6 mb-3">
						<label for="validationCustom01">Date Created On</label> <input
							disabled="disabled" type="text" class="form-control"
							id="validationCustom01" value="<%=dateString%>" required>
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
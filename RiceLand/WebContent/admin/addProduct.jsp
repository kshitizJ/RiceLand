<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>

<%@page import="java.time.LocalDate"%>
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
<title>Add Product</title>
</head>
<body>
	<%@include file="adminNav.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-12 my-4">
				<h1 class="text-center">Add Product</h1>
			</div>
			<div class="col-12">
				<%
					String msg = (String) session.getAttribute("msg");
				if ("Failed to add the product, please try again...".equals(msg)) {
				%>
				<div class="alert alert-danger" role="alert">Failed to add the
					product, please try again...</div>
				<%
					session.removeAttribute("msg");
				} else if ("Successfully added the product...".equals(msg)) {
				%>
				<div class="alert alert-success" role="alert">Successfully
					added the product...</div>
				<%
					session.removeAttribute("msg");
				}
				%>
			</div>
			<div class="col-12">
				<%
					DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				Date date = new Date();
				String dateString = df.format(date);
				%>
				<form class="row" action="../ProductServlet" method="post">
					<div class="col-md-6 mb-3">
						<label for="validationCustom01">Name</label> <input type="text"
							class="form-control" id="validationCustom01"
							placeholder="Product Name" name="name" required>
					</div>
					<div class="col-md-6 mb-3">
						<label class="form-label" for="">Image</label>
						<div class="custom-file">
							<label class="custom-file-label" for="customFile">Choose
								file</label> <input type="file" class="custom-file-input form-control"
								id="customFile" name="img" required>
						</div>
					</div>
					<div class="col-md-6 mb-3">
						<label for="validationCustom01">Price</label> <input type="number"
							class="form-control" id="validationCustom01"
							placeholder="Product Price" min="0" name="price" required>
					</div>
					<div class="col-md-6 mb-3">
						<label class="form-label" for="star">Star</label> <select
							class="custom-select" id="star" name="star" disabled="disabled">
							<option value="0" selected>0</option>
						</select>
					</div>
					<div class="col-md-6 mb-3">
						<label for="review">Description</label>
						<textarea class="form-control" id="review" name="description"
							rows="1" placeholder="Description" required></textarea>
					</div>
					<div class="col-md-6 mb-3">
						<label for="category">Category</label> <select
							class="custom-select" id="category" name="category" required>
							<option selected>Choose..</option>
							<option value="featured">Featured</option>
							<option value="latest">Latest</option>
						</select>
					</div>
					<div class="col-md-6 mb-3">
						<label for="status">Status</label> <select class="custom-select"
							id="status" name="status" required>
							<option selected>Choose..</option>
							<option value="pending">Out Of Stock</option>
							<option value="completed">In Stock</option>
						</select>
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
<script>
	// Add the following code if you want the name of the file appear on select
	$(".custom-file-input").on(
			"change",
			function() {
				var fileName = $(this).val().split("\\").pop();
				$(this).siblings(".custom-file-label").addClass("selected")
						.html(fileName);
			});
</script>
</html>
<%
	} else {
response.sendRedirect("../login.jsp");
}
%>
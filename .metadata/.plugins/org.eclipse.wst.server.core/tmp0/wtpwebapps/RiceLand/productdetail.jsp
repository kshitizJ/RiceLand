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
<%@include file="./all_components/common.jsp"%>
<title>Product Details</title>
</head>
<body>
	<%@include file="./all_components/navbar.jsp"%>
	<!------- single product details ------->
	<section id="productDetail">
		<div class="container">
			<div class="row d-flex justify-content-center align-items-center">
				<div class="col-md-6 col-12">
					<img class="img-fluid" src="./assets/images/rice/basmati.jpeg">
				</div>
				<div class="col-md-5 col-12 text-center">
					<p class="breadcrumb">
						<a href="./index.jsp">Home</a>/<a href="./products.jsp">Products</a>/Details
					</p>
					<h1>Basmati Rice</h1>
					<h4>Rs.170/kg</h4>
					<div class="rating">
						<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star-o"></i>
					</div>
					<a href="" class="btn">Add to cart</a>
					<h3>
						<i class="fa fa-indent"></i> Product Details
					</h3>
					<br>
					<p>
						Give your tastebud a flavour of basmati rice by Kohinoor.<br>It
						is non-sticky and posses 100% purity and have aromatic fragrance
					</p>
				</div>
				<div class="col-12 cment">
					<h2 class="text-center cment-title">Comments</h2>
					<div class="comments">
						<div class="comment" id="0">
							<h5>
								<b>Gagan Chaturvedi</b> <i class="fa fa-star"></i> <i
									class="fa fa-star"></i> <i class="fa fa-star"></i> <i
									class="fa fa-star"></i>
							</h5>
							<p>Amazing quality. Buying it quite regularly. Cost effective
								too.</p>
							<hr>
						</div>
						<div class="comment" id="1">
							<h5>
								<b>Sandesh Bhagat</b> <i class="fa fa-star"></i> <i
									class="fa fa-star"></i> <i class="fa fa-star"></i> <i
									class="fa fa-star"></i> <i class="fa fa-star"></i>
							</h5>
							<p>This one has longest grain I have seen after cooking. I
								have tried many, now I have settled to this one.</p>
							<hr>
						</div>
						<div class="comment" id="3">
							<h5>
								<b>Rohan Nanda</b> <i class="fa fa-star"></i> <i
									class="fa fa-star"></i> <i class="fa fa-star"></i>
							</h5>
							<p>All the products were good and impressive. Keep it up and
								I am satisfied with this purchase.</p>
							<hr>
						</div>
					</div>
					<form action="">
						<input type="hidden" value="<%=user.getId()%>" name="uid">
						<input type="hidden" value="<%=request.getParameter("p_id")%>"
							name="pid">
						<div class="form-group">
							<label for="review">Your Comment</label>
							<textarea class="form-control" id="review" name="review" rows="3"></textarea>
						</div>
						<div class="input-group mb-3 col-md-3 col-10">
							<div class="input-group-prepend">
								<label class="input-group-text" for="star">Star</label>
							</div>
							<select class="custom-select" id="star" name="star">
								<option value="1" selected>5</option>
								<option value="2">4</option>
								<option value="3">3</option>
								<option value="3">2</option>
								<option value="3">1</option>
							</select>
						</div>
						<div class="col-md-4 col-12">
							<button type="submit" class="btn btn-primary">Comment</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<%@include file="./all_components/footer.jsp"%>
</body>
</html>
<%@page import="com.dao.UserDao"%>
<%@page import="com.detail.Product"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="com.db.DbConnect"%>
<%@page import="com.detail.Review"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.ReviewDao"%>
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
<title>Product Details</title>
</head>
<body>
	<%@include file="./all_components/navbar.jsp"%>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
	ProductDao productdao = new ProductDao(DbConnect.getCon());
	Product product = productdao.getProduct(id);
	UserDao userdao = new UserDao(DbConnect.getCon());
	ReviewDao reviewdao = new ReviewDao(DbConnect.getCon());
	List<Review> reviews = reviewdao.getReview(id);
	%>
	<!------- single product details ------->
	<section id="productDetail">
		<div class="container">
			<div class="row d-flex justify-content-center align-items-center">
				<div class="col-md-6 col-12">
					<img class="img-fluid"
						src="./assets/images/rice/<%=product.getPath()%>">
				</div>
				<div class="col-md-5 col-12 text-center">
					<p class="breadcrumb">
						<a href="./index.jsp">Home</a>/<a href="./products.jsp">Products</a>/Details
					</p>
					<h1><%=product.getName()%></h1>
					<h4>
						Rs.<%=product.getPrice()%>/kg
					</h4>
					<div class="rating">
						<%
							for (int strs = 0; strs < product.getStar(); strs++) {
						%>
						<i class="fa fa-star"></i>
						<%
							}
						%>
					</div>
					<a href="" class="btn">Add to cart</a>
					<h3>
						<i class="fa fa-indent"></i> Product Details
					</h3>
					<br>
					<p>
						<%=product.getDescription()%>
					</p>
				</div>
				<div class="col-12 cment">
					<h2 class="text-center cment-title">Comments</h2>
					<div class="comments">
						<%
							for (Review r : reviews) {
						%>
						<div class="comment" id="<%=r.getR_id()%>">
							<%
								String name = userdao.getUserName(r.getU_id());
							%>
							<h5>
								<b><%=name%></b>
								<%
									for (int str = 0; str < r.getStars(); str++) {
								%>
								<i class="fa fa-star"></i>
								<%
									}
								%>
							</h5>
							<p><%=r.getReview()%></p>
							<hr>
						</div>
						<%
							}
						%>
					</div>
					<form action="ReviewSevrlet" method="post">
						<input type="hidden" value="<%=user.getId()%>" name="uid">
						<input type="hidden" value="<%=id%>" name="pid">
						<div class="form-group">
							<label for="review">Your Comment</label>
							<textarea class="form-control" id="review" name="review" rows="3"></textarea>
						</div>
						<div class="input-group mb-3 col-md-3 col-10">
							<div class="input-group-prepend">
								<label class="input-group-text" for="rating">Rating</label>
							</div>
							<select class="custom-select" id="rating" name="rating">
								<option value="5" selected>5</option>
								<option value="4">4</option>
								<option value="3">3</option>
								<option value="2">2</option>
								<option value="1">1</option>
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
<%
	} else {
response.sendRedirect("login.jsp");
}
%>
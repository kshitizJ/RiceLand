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
<title>Products</title>
</head>
<body>
	<%@include file="./all_components/navbar.jsp"%>
	<section id="FeatureProduct">
		<div class="container">
			<div class="row d-flex justify-content-center align-items-center">
				<div class="col-md-6 col-12">
					<h2 class="title">Featured products</h2>
				</div>
				<div class="col-md-6 col-12 form-group">
					<select class="form-control" id="exampleFormControlSelect1">
						<option>Default Sorting</option>
						<option>Sort by price</option>
						<option>Sort by rating</option>
					</select>
				</div>
			</div>
			<div class="row d-flex justify-content-center align-items-center">
				<div class="col-lg-4 col-mg-6 col-12 text-center">
					<img class="img-fluid" src="./assets/images/rice/basmati.jpeg"
						style="width: 375px; height: 350px; border-radius: 5px;"> <a
						class="stretched-link" href="productdetail.jsp">
						<h4>Basmati Rice</h4>
					</a>
					<div class="rating">
						<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star-o"></i>
					</div>
					<p>Rs.170/Kg</p>
				</div>
				<div class="col-lg-4 col-mg-6 col-12 text-center">
					<img class="img-fluid" src="./assets/images/rice/brown.jpeg"
						style="width: 375px; height: 350px; border-radius: 5px;"> <a
						class="stretched-link" href="productdetail.jsp">
						<h4>Brown Rice</h4>
					</a>
					<div class="rating">
						<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i>
					</div>
					<p>Rs.110/Kg</p>
				</div>
				<div class="col-lg-4 col-mg-6 col-12 text-center">
					<img class="img-fluid" src="./assets/images/rice/matta.jpeg"
						style="width: 375px; height: 350px; border-radius: 5px;"> <a
						class="stretched-link" href="productdetail.jsp">
						<h4>Matta Rice</h4>
					</a>
					<div class="rating">
						<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star-o"></i>
					</div>
					<p>Rs.450/Kg</p>
				</div>
				<div class="col-lg-4 col-mg-6 col-12 text-center">
					<img class="img-fluid" src="./assets/images/rice/red.jpeg"
						style="width: 375px; height: 350px; border-radius: 5px;"> <a
						class="stretched-link" href="productdetail.jsp">
						<h4>Red Rice</h4>
					</a>
					<div class="rating">
						<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i> <i class="fa fa-star-half-o"></i> <i
							class="fa fa-star-o"></i>
					</div>
					<p>Rs.580/Kg</p>
				</div>
				<div class="col-lg-4 col-mg-6 col-12 text-center">
					<img class="img-fluid" src="./assets/images/rice/jasmine.jpeg"
						style="width: 375px; height: 350px; border-radius: 5px;"> <a
						class="stretched-link" href="productdetail.jsp">
						<h4>Jasmine Rice</h4>
					</a>
					<div class="rating">
						<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i> <i class="fa fa-star-half-o"></i> <i
							class="fa fa-star-o"></i>
					</div>
					<p>Rs.350/Kg</p>
				</div>
				<div class="col-lg-4 col-mg-6 col-12 text-center">
					<img class="img-fluid" src="./assets/images/rice/parboiled.jpeg"
						style="width: 375px; height: 350px; border-radius: 5px;"> <a
						class="stretched-link" href="productdetail.jsp">
						<h4>Parboiled Rice</h4>
					</a>
					<div class="rating">
						<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star-o"></i>
					</div>
					<p>Rs.113/Kg</p>

				</div>
				<div class="col-lg-4 col-mg-6 col-12 text-center">
					<img class="img-fluid" src="./assets/images/rice/arborio.jpeg"
						style="width: 375px; height: 350px; border-radius: 5px;"> <a
						class="stretched-link" href="productdetail.jsp">
						<h4>Arborio Rice</h4>
					</a>
					<div class="rating">
						<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i>
					</div>
					<p>Rs.580/Kg</p>
				</div>
			</div>
		</div>
	</section>
	<!-------------- end of featured products -------------->
	<!-- Latest Product -->
	<section id="LatestProduct">
		<div class="container">
			<h2 class="title">Latest products</h2>
			<div class="row d-flex justify-content-center align-items-center">
				<div class="col-lg-4 text-center">
					<img class="img-fluid"
						style="width: 300px; height: 250px; border-radius: 5px;"
						src="./assets/images/rice/wild%20rice.jpg"> <a
						class="stretched-link" href="productdetail.jsp"></a>
					<h4>Wild Rice</h4>
					</a>
					<div class="rating">
						<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star-o"></i>
					</div>
					<p>Rs.200/Kg</p>
				</div>
				<div class="col-lg-4 text-center">
					<img class="img-fluid"
						style="width: 300px; height: 250px; border-radius: 5px;"
						src="./assets/images/rice/valencia%201.jpg"> <a
						class="stretched-link" href="productdetail.jsp">
						<h4>Valencia Rice</h4>
					</a>
					<div class="rating">
						<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i>
					</div>
					<p>Rs.300/Kg</p>
				</div>
				<div class="col-lg-4 text-center">
					<img class="img-fluid"
						style="width: 300px; height: 250px; border-radius: 5px;"
						src="./assets/images/rice/black.jpg"><a
						class="stretched-link" href="productdetail.jsp">
						<h4>Black Rice</h4>
					</a>
					<div class="rating">
						<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star-o"></i>
					</div>
					<p>Rs.325/Kg</p>
				</div>
			</div>
		</div>
	</section>
	<!-- End of Latest Product -->
	<%@include file="./all_components/footer.jsp"%>s

</body>
<script src="./assets/js/smooth-scroll.js"></script>

<script>
	var scroll = new SmoothScroll('a[href*="#"]');
</script>
</html>
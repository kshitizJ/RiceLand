<%@page import="com.db.DbConnect"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="com.detail.Product"%>
<%@page import="java.util.List"%>
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
	<%
		ProductDao productdao = new ProductDao(DbConnect.getCon());
	List<Product> products = productdao.getProductsByCategory("featured");
	%>
	<section id="FeatureProduct">
		<div class="container">
			<div class="row d-flex justify-content-center align-items-center">
				<div class="col-12">
					<h2 class="title">Featured products</h2>
				</div>
				<%
					for (Product product : products) {
				%>
				<div class="col-lg-4 col-mg-6 col-12 text-center">
					<div id="">
						<img class="img-fluid"
							src="./assets/images/rice/<%=product.getPath()%>"
							style="width: 375px; height: 350px; border-radius: 5px;"> <a
							class="stretched-link" style="text-decoration: none;"
							href="productdetail.jsp?id=<%=product.getPid()%>"></a>
						<h4>
							<%=product.getName()%>
						</h4>
						<div class="rating">
							<%
								for (int str = 0; str < product.getStar(); str++) {
							%>
							<i class="fa fa-star"></i>
							<%
								}
							%>
						</div>
						<p>
							<i class="fas fa-rupee-sign"></i>
							<%=product.getPrice()%>/Kg
						</p>
					</div>
				</div>
				<%
					}
				%>
			</div>
		</div>
	</section>
	<!-------------- end of featured products -------------->

	<%
		products = productdao.getProductsByCategory("latest");
	%>
	<!-- Latest Product -->
	<section id="LatestProduct">
		<div class="container">
			<h2 class="title">Latest products</h2>
			<div class="row d-flex justify-content-center align-items-center">
				<%
					for (Product product : products) {
				%>
				<div class="col-lg-4 text-center">
					<img class="img-fluid"
						style="width: 300px; height: 250px; border-radius: 5px;"
						src="./assets/images/rice/<%=product.getPath()%>"> <a
						class="stretched-link"
						href="productdetail.jsp?id=<%=product.getPid()%>"></a>
					<h4><%=product.getName()%></h4>
					<div class="rating">
						<%
							for (int str = 0; str < product.getStar(); str++) {
						%>
						<i class="fa fa-star"></i>
						<%
							}
						%>
					</div>
					<p>
						<i class="fas fa-rupee-sign"></i>
						<%=product.getStar()%>/Kg
					</p>
				</div>
				<%
					}
				%>
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
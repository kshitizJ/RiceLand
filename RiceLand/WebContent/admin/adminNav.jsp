<%@page import="com.detail.Admin"%>
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
Admin admin = (Admin) session.getAttribute("admin");
if (admin != null) {
%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<a class="navbar-brand" href="admin.jsp"><img
		src="../assets/images/logo/logo.svg" width="125px"></a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarNav" aria-controls="navbarNav"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNav">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="">Users</a></li>
			<li class="nav-item"><a class="nav-link" href="showProduct.jsp">Products</a></li>
			<li class="nav-item"><a class="nav-link" href="addProduct.jsp">Add
					Product</a></li>
		</ul>
		<div class="d-flex ml-auto">
			<a class="nav-link btn btn-success mx-2" href=""><%=admin.getFname() + " " + admin.getLname()%></a>
			<a class="nav-link btn btn-danger" href="../LogoutServlet">Logout</a>
		</div>
	</div>
</nav>
<%
	} else {
response.sendRedirect("../login.jsp");
}
%>
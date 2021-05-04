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
<title>Admin</title>
</head>
<body>
	<%@include file="adminNav.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-12 my-4">
				<h1 class="text-center text-success">
					<b>Hello <%=admin.getFname() + " " + admin.getLname()%></b>
				</h1>
			</div>
			<div class="col-12">
				<h3 class="text-center text-success">Welcome To Admin Panel</h3>
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

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
<title>Users</title>
</head>
<body>
	<%@include file="adminNav.jsp"%>
</body>
</html>
<%
	} else {
response.sendRedirect("../login.jsp");
}
%>
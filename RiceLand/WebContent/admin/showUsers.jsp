<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.detail.User"%>
<%@page import="java.util.List"%>
<%@page import="com.db.DbConnect"%>
<%@page import="com.dao.UserDao"%>
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
	<%
		UserDao userdao = new UserDao(DbConnect.getCon());
	List<User> users = userdao.getUsers();
	SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
	%>
	<div class="container-fluid">
		<div class="row">
			<div class="col-12 my-4">
				<h1 class="text-center">Users</h1>
			</div>
			<div class="col-12">
				<%
					String msg = (String) session.getAttribute("msg");
				if ("Failed to delete a user, please try again...".equals(msg)) {
				%>
				<div class="alert alert-danger" role="alert">Failed to add the
					product, please try again...</div>
				<%
					session.removeAttribute("msg");
				} else if ("User deleted successfully...".equals(msg)) {
				%>
				<div class="alert alert-success" role="alert">Successfully
					added the product...</div>
				<%
					session.removeAttribute("msg");
				}
				%>
			</div>
			<div class="col-12 mb-3">
				<h4 class="text-right text-success">
					Total users:
					<%=users.size()%>
				</h4>
			</div>
			<div class="col-12">
				<table class="table table-responsive table-bordered">
					<thead>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Email</th>
							<th>Number</th>
							<th>Address</th>
							<th>State</th>
							<th>City</th>
							<th>Zip</th>
							<th>Date Added</th>
							<th>Orders</th>
							<th>Delete</th>
						</tr>
					</thead>
					<tbody>
						<%
							for (User user : users) {
						%>
						<tr>
							<th><%=user.getId()%></th>
							<th><%=user.getFname() + " " + user.getLname()%></th>
							<th><%=user.getEmail()%></th>
							<th><%=user.getNumber()%></th>
							<th><%=user.getAddress()%></th>
							<th><%=user.getState()%></th>
							<th><%=user.getCity()%></th>
							<th><%=user.getZip()%></th>
							<th><%=ft.format(user.getDate())%></th>
							<th><a class="btn btn-success"
								href="showOrders.jsp?id=<%=user.getId()%>">Orders</a></th>
							<th><a class="btn btn-danger"
								href="../DeleteUser?id=<%=user.getId()%>">Delete</a></th>
						</tr>
						<%
							}
						%>
					</tbody>
				</table>
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
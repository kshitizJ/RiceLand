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
<title>Profile</title>
</head>
<body>
	<%@include file="./all_components/navbar.jsp"%>
	<section id="profile">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<h2 class="title">Profile</h2>
				</div>
				<div class="col-12">
					<%
						String success = (String) session.getAttribute("success");
					if ("Your details have been changed successfully...".equals(success)) {
					%>
					<div class="alert alert-success" role="alert">Your details
						have been changed successfully...</div>
					<%
						session.removeAttribute("success");
					}
					%>
				</div>
				<div class="col-12">
					<form action="UserEditServlet" method="post">
						<div class="form-row">
							<div class="col-md-6 mb-3">
								<label for="validationCustom01">First name</label> <input
									type="text" class="form-control" value="<%=user.getFname()%>"
									name="fname" placeholder="First name">
							</div>
							<div class="col-md-6 mb-3">
								<label for="validationCustom02">Last name</label> <input
									type="text" value="<%=user.getLname()%>" name="lname"
									class="form-control" placeholder="Last name">
							</div>
							<div class="col-md-6 mb-3">
								<label for="validationCustomUsername">Email</label>
								<div class="input-group mb-2">
									<div class="input-group-prepend">
										<div class="input-group-text">@</div>
									</div>
									<input type="text" class="form-control"
										value="<%=user.getEmail()%>" name="email"
										id="inlineFormInputGroup" placeholder="Email ID">
								</div>
							</div>
							<div class="col-md-6 mb-3">
								<label for="number">Number</label> <input type="text"
									value="<%=user.getNumber()%>" name="number"
									class="form-control" placeholder="Number">
							</div>
							<div class="col-md-6 mb-3">
								<label for="inputAddress2">Address</label> <input type="text"
									class="form-control" id="inputAddress"
									value="<%=user.getAddress()%>" name="address"
									placeholder="Apartment, studio, or floor">
							</div>
							<div class="col-md-6 mb-3">
								<label for="validationCustom04">State</label> <input type="text"
									class="form-control" id="validationCustom04"
									value="<%=user.getState()%>" name="state" placeholder="State">
							</div>
							<div class="col-md-6 mb-3">
								<label for="validationCustom03">City</label> <input type="text"
									class="form-control" value="<%=user.getCity()%>" name="city"
									id="validationCustom03" placeholder="City">
							</div>
							<div class="col-md-6 mb-3">
								<label for="validationCustom05">Zip</label> <input type="text"
									class="form-control" value="<%=user.getZip()%>" name="zip"
									id="validationCustom05" placeholder="Zip">
							</div>
							<div class="offset-md-4"></div>
							<div class="col-md-4 col-12 mb-3"
								style="position: relative; top: 20px;">
								<button type="submit" class="btn btn-primary">Save</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<%@include file="./all_components/footer.jsp"%>

</body>
<script src="./assets/js/smooth-scroll.js"></script>

<script>
	var scroll = new SmoothScroll('a[href*="#"]');
</script>
</html>
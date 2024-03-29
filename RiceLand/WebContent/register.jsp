<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./all_components/common.jsp"%>
<title>Register</title>
<style>
#check {
	font-size: 80%;
	color: #dc3545;
}
</style>
</head>
<body>
	<%@include file="./all_components/navbar.jsp"%>
	<header class="register-page">
		<div
			class="container d-flex justify-content-center align-items-center">
			<div class="row">
				<div class="col-lg-6 col-12">
					<img src="./assets/images/rice/mainn-rice.jpg" width=100%>
				</div>
				<div
					class="col-lg-6 col-12 d-flex justify-content-center align-items-center">
					<form onsubmit="return validation()" class="needs-validation"
						novalidate method="post" action="UserServlet">
						<div class="form-row">
							<div class="form-group col-md-6 mb-3">
								<label for="fname">First name</label> <input type="text"
									class="form-control" id="fname" name="fname"
									placeholder="First Name" required>
								<div class="valid-feedback">Looks good!</div>
							</div>
							<div class="form-group col-md-6 mb-3">
								<label for="lname">Last name</label> <input type="text"
									class="form-control" id="lname" name="lname"
									placeholder="Last Name" required>
								<div class="valid-feedback">Looks good!</div>
							</div>
							<div class="form-group col-md-6">
								<label for="email">Email</label>
								<div class="input-group">
									<div class="input-group-prepend">
										<span class="input-group-text" id="inputGroupPrepend">@</span>
									</div>
									<input type="text" class="form-control" id="email"
										placeholder="Email ID" name="email"
										aria-describedby="inputGroupPrepend" required>
									<div class="invalid-feedback">Please enter your email
										address.</div>
								</div>
							</div>
							<div class="form-group col-md-6">
								<label for="pass">Password</label> <input type="password"
									class="form-control" id="pass" name="pass"
									placeholder="Password" required>
								<div class="invalid-feedback">Please enter password.</div>
							</div>
							<div class="form-group col-md-6">
								<label for="number">Mobile Number</label> <input type="text"
									class="form-control" id="number" name="number"
									placeholder="Mobile Number" required>
								<div class="invalid-feedback">Please enter mobile number.</div>
							</div>
							<div class="form-group col-md-6">
								<label for="cpass">Confirm Password</label> <input
									type="password" class="form-control" id="cpass"
									placeholder="Confirm Password" required>
								<div id="check"></div>
							</div>
						</div>
						<div class="form-group">
							<label for="address">Address</label> <input type="text"
								class="form-control" id="address" name="address"
								placeholder="Apartment, studio, or floor" required>
							<div class="invalid-feedback">Please enter your address.</div>
						</div>
						<div class="form-row">
							<div class="form-group col-md-5">
								<label for="state">State</label> <input type="text"
									class="form-control" id="state" name="state"
									placeholder="State" required>
								<div class="invalid-feedback">Please provide a valid
									state.</div>
							</div>
							<div class="form-group col-md-4">
								<label for="city">City</label> <input type="text"
									class="form-control" id="city" name="city" placeholder="City"
									required>
								<div class="invalid-feedback">Please provide a valid city.
								</div>
							</div>
							<div class="form-group col-md-3">
								<label for="zip">Zip</label> <input type="text"
									class="form-control" id="zip" name="zip" placeholder="Zip"
									required>
								<div class="invalid-feedback">Please provide a valid zip.
								</div>
							</div>
							<div class="form-group">
								<div class="form-check">
									<input class="form-check-input" type="checkbox" value=""
										id="tandc" required> <label class="form-check-label"
										for="tandc"> Agree to terms and conditions </label>
									<div class="invalid-feedback">You must agree before
										submitting.</div>
								</div>
							</div>
						</div>
						<p>
							Already have an account? <a href="login.jsp">Log In.</a>
						</p>
						<button type="submit" class="col-12 btn btn-primary">Sign
							In</button>
					</form>
				</div>
			</div>
		</div>
	</header>
	<%@include file="./all_components/footer.jsp"%>
</body>
<script>
	function validation() {
		var pass = document.getElementById("pass").value;
		var cpass = document.getElementById("cpass").value;
		if (cpass == "") {
			document.getElementById("check").innerHTML = "Please confirm your password.";
			return false;
		} else {
			document.getElementById("check").innerHTML = "";
		}
		if (cpass != pass) {
			document.getElementById("check").innerHTML = "Both passwords should match.";
			return false;
		} else {
			document.getElementById("check").innerHTML = "";
		}
		return true;
	}
</script>
<script>
	// Example starter JavaScript for disabling form submissions if there are invalid fields
	(function() {
		'use strict';
		window.addEventListener('load', function() {
			// Fetch all the forms we want to apply custom Bootstrap validation styles to
			var forms = document.getElementsByClassName('needs-validation');
			// Loop over them and prevent submission
			var validation = Array.prototype.filter.call(forms, function(form) {
				form.addEventListener('submit', function(event) {
					if (form.checkValidity() === false) {
						event.preventDefault();
						event.stopPropagation();
					}
					form.classList.add('was-validated');
				}, false);
			});
		}, false);
	})();
</script>
<script src="./assets/js/smooth-scroll.js"></script>

<script>
	var scroll = new SmoothScroll('a[href*="#"]');
</script>
</html>
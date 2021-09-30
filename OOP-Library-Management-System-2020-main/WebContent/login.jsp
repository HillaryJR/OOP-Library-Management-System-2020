<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<link rel = "stylesheet" href ="UM.css" >
		<script src = "UM.js"></script>
		<title>Login Page</title>
	</head>
	<body>
		<img src="img/Library.jpg" style="width:100%" height="755">
		<center>
			<div class="logCont">
				<center>
					<div class="logForm">
						<label id="wel">Welcome To Colombus Library</label><br/><br/>
						<label id="hLog">LOGIN</label><br/><br/>
						<form method="post" action="log" name="myForm" >
							<label id="unLab">User Name</label>
								<input type="text" id="unInp" title="Enter your UserName" name="username" required><br/><br/>
									
								<label id="unLab">Password</label>
								<input type="password" id="pwdInp" title="Enter your Password" name="password" required><br/><br/>
								
								<button type="submit" id="logBtn">Login</button><br/><br/>
						</form>
					</div>
					<hr/ style="margin-right:250px; margin-top:10px;"><div style="margin-top:-20px;">OR</div><hr/ style="margin-left:250px; margin-top:-8px;">
					<br/><br/>
					<div style="margin-top:-22px;">
						<a href="forgotPassword.jsp"id="fPwd">Forgot your password</a>
						<a href="registration.jsp" id="nReg">Not Registered</a>
					</div>	
				</center>
			</div>
		</center>		
	</body>
</html>

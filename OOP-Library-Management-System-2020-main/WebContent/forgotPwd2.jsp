<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel = "stylesheet" href ="UM.css" >
		<script src = "UM.js"></script>	
		<title>Forgot Password</title>
	</head>
	<body>
		<img src="img\Library.jpg" style="width:100%" height="755">
		<center>
			<div class="fpCont2">
				<label id="fpHead2">Forgot Password</label><br/><br/>
				<form method="post" action="pwdChange" name="passwForm">
					<label id="nPassLbl">New Password</label>
					<input type="password" id="nPass" title="Enter your New Password" name="nPass" required><br/>
					<input type="checkbox" onclick="myFunction2()" id="inForg"><label>Show Password</label><br/><br/><br/>
										
					<label id="nPassLbl">Confirm Password</label>
					<input type="password" id="cnPass" title="Confirm your New Password" name="cnPass" required><br/>
					<input type="checkbox" onclick="myFunction3()" id="inForg"><label>Show Password</label><br/><br/>
									
					<button type="submit" id="nxtBtn2" onclick="passwordMatch()">Confirm Password</button><br/><br/>
				</form>
			</div>
		</center>
	</body>
</html>
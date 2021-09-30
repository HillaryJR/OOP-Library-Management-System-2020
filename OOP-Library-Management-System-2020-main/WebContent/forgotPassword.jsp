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
				<div class="fpCont">
					<label id="fpHead">Forgot Password</label><br/><br/>
					<p id="fPara">We can help you to reset your Password.<br/>First,enter your Mobile Number & follow the instructions below.</p>
					<form method="post" action="chkEmail" name="fpForm" >
									
						<label id="fpEmail">Email</label>
						<input type="text" id="emailIn" title="Enter your email" name="femail" required><br/><br/>
									
						<button type="submit" id="nxtBtn">Next</button><br/><br/>
					</form>
				</div>
			</center>
	</body>
</html>
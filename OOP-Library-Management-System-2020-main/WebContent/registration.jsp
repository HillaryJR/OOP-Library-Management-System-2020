<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel = "stylesheet" href ="UM.css" >
		<script src = "UM.js"></script>
		<title>Registration Page</title>
	</head>
	<body>
		<img src="img\regLib.jpg" style="width:100%" height="860px">
		<center>
			<div class="persDet">
				<label id="regPage">Registrastion Form</label><br/><br/><br/>
				
				<form  method = "post" action ="insertCust" name="register">
					<label id="regLbl">First Name</label><br/>
					<input type="text" title="Enter your First Name" id="in1" name="fname" required><br/><br/>
					
					<label id="regLbl">Last Name</label><br/>
					<input type="text" title="Enter your Last Name" id="in1" name="lname"><br/><br/>
					
					<label id="regLbl1">Mobile Number</label><br/>
					<input type="text" title="Enter your Mobile Number" id="in1" name="mobile" required><br/><br/>
					
					<label id="regLbl2">E-mail Address</label><br/>
					<input type="text" title="Enter your Email Address" id="in1" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"  required><br/><br/>
					
					<label id="regLbl3">Home Address</label><br/>
					<textarea title="Enter your Home Address" rows="3" id="in1" name="address"></textarea><br/><br/><br/>
					
					<label id="regLbl">User Name</label><br/>
					<input type="text" title="Enter a Unique User Name"  id="in1" name="username" required><br/><br/>
					
					<label id="regLbl4">Password</label><br/>
					<input type="password" title="Enter your Password" id="in2" name="passw" required><br/>
					<input type="checkbox" onclick="myFunction()"><label>Show Password</label><br/><br/>
					
					<label id="regLbl5">Confirm Password</label><br/>
					<input type="password" title="Enter your First Name" id="in3" name="cpassw" required><br/>
					<input type="checkbox" onclick="myFunction1()"><label>Show Password</label><br/><br/>
					
					<input type="checkbox" required><label>Accept Privacy & Policy Terms</label><br/><br/>
					
					
					<button type="submit" id="subBtn" onclick="validateRegisterForm()">Submit</button>
				</form>
			</div>
		</center>	
	</body>
</html>
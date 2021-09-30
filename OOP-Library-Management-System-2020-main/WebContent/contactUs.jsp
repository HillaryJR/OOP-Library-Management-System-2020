<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<link rel = "stylesheet" href ="UM.css">
		<title>Contact Us</title>
	</head>
	<%@include file="/header.jsp" %>
	<body>
		<div class="p2">
			<label id="sm">Our Social Media links</label>
			<ul>
				<a href="facebook.com" id="smLi"><li>Facebook <img src="img\fb.png" style="width:28px" height="22px"></li></a>
				<a href="instagram.com" id="smLi"><li>Instagram <img src="img\insta.png" style="width:22px" height="22px"></li></a>
				<a href="youtube.com" id="smLi"><li>Youtube <img src="img\youtube.webp" style="width:22px" height="22px"></li></a>
				<a href="twitter.com" id="smLi"><li>Twitter<img src="img\tweet.png" style="width:22px" height="22px"></li></a>
			</ul>
			<img src="img\contact.jpg" id="imgCont">
		</div>
		<div class="contactCont">
			<center>
				<label id="conUs">Contact Us</label><br/><br/>
			</center>
			<label id="cal">Call a Librarian</label>
			<p id="calDes">
				Help desk for library services,Quick answers,finding materials,<br/>
				eBooks and researches
			</p>
			<label id="calNo">: 071-1111222</label><br/>
			<label id="cal">Call Customer Service</label>
			<p id="calDes">For your account renewals,fines and monthly renewals</p>
			<label id="calNo">076-2222255</label><br/>
			<a href="gmail.com"><label id="conEmail">Email us</label></a><br/><br/>
			<label id="cal">Address</label>
			<p id="calDes">
				Colombus Library<br/>
				PO Box 123, Peradeniya Road,<br/>
				Kandy
			</p>
			<label id="cal">Library Open Days</label>
			<p id="calDes">
				Monday-Thursday : 10am to 7pm<br/>
				Friday-Saturday : 10am to 4pm<br/>
				Closed on Sunday and Public Holidays<br/>
			</p><br/><br/>
		</div>
	</body>
	<%@include file="/footer.jsp" %>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>EmptyCart</title>
		<link rel = "stylesheet" type = "text/css" href = "css/cart.css" />
	</head>
	
	<header>
		<%@include file="/Header1.jsp" %>
	</header>
	
	<body>
		<br><br><br><br><br><br>
		
		<center>
		<div>
			<h2 style="color:dimgrey; font-family :Comic Sans MS, cursive, sans-serif">Your Cart is Empty</h2>
		</div>		
			<img alt="emptycart" src="img/empty-cart-vecto.png">
		</center>
		<br><br><br><br><br><br>
	</body>	
	
	<footer>
		<%@include file="/Footer1.jsp" %>
	</footer>

</html>
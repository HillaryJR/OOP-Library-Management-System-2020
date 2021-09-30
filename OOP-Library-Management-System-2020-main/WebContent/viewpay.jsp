<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title></title>
		<link rel = "stylesheet" href ="css/cart.css" >
	</head>
	
	<header>
		<%@include file="/Header1.jsp" %>
	</header>
	
	<body>
		
		<br><br><br><br><br><br>
		
		<table class="AdminTable" align="center" cellpadding="5" cellspacing="5" border="2">
			<tr>
				<td>Payment Name</td>
				<td>Option</td>
			</tr>
		
			<c:forEach var="payment" items="${paymentDetail}">
				<c:set var="payName" value="${payment.payName}"/>		
				<tr>	
					<td>${payment.payName}</td>
					<td><a href="successpay.jsp"><button class="btn-sc">Select</button></a></td>
				</tr>
			</c:forEach>
		</table>
		<br><br><br>
	</body>
	
	<footer>
		<%@include file="/Footer1.jsp" %>
	</footer>

</html>
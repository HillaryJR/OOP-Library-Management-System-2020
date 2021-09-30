<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel = "stylesheet" href ="css/cart.css" >
		<title>View Payment Details</title>
	</head>
	<body>
		<%@include file="/header.jsp" %>
		<center >
			<div >
				<a href ="Payment.jsp"><button class="btn-sc"> Create Payment </button></a>
			</div>
		</center>
		
		<br><br><br>
		
		
		<table class="AdminTable" align="center" cellpadding="5" cellspacing="5" border="2">
			<tr>
				<td>Payment Name</td>
				<td>Update Option</td>
				<td>Delete Option</td>
			</tr>
		
			<c:forEach var="payment" items="${paymentDetail}">
				<c:set var="payName" value="${payment.payName}"/>		
				<tr>	
					<td>${payment.payName}</td>
					<td><a href="PaymentDetailsUpdateServlet?PN=${payment.payName}"><button>Update</button></a></td>
					<td><a href ="PaymentDeleteServlet?PN=${payment.payName}"><button class="btn-danger">Delete</button></a></td>
				</tr>
				
			</c:forEach>
			
		</table>
		
		<%@include file="/footer.jsp" %>
	</body>
</html>
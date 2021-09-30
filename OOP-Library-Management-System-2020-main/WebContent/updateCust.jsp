<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<link rel = "stylesheet" href ="UM.css" >
	<title>Edit User Details</title>
	</head>
	<%@include file="/header.jsp" %>
	<body>
		<div class="editCont">
			<center>
				<c:forEach var="cust" items="${custDetail}">
		
						<c:set var="fname" value="${cust.fname}"/>
						<c:set var="lname" value="${cust.lname}"/>
						<c:set var="mobile" value="${cust.mobile}"/>
						<c:set var="email" value="${cust.email}"/>
						<c:set var="address" value="${cust.address}"/>
		
				<br/><label id="editH">Edit Personel Details</label><br/><br/>
			
				<form action="updateCust" method="post" >
					<table class="etable">
					
						<tr>
							<td>First Name</td>
							<td><input type="text" name="fname" id="edIn" value="${cust.fname}" required></td>
						</tr>
						<tr>
							<td>Last Name</td>
							<td><input type="text" name="lname" id="edIn" value="${cust.lname}"></td>
						</tr>
						<tr>
							<td>Mobile Number</td>
							<td><input type="text" name="mobile" id="edIn" value="${cust.mobile}" required></td>
						</tr>
						<tr>
							<td>Email</td>
							<td><input type="text" name="email" id="edIn" value="${cust.email}" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required></td>
						</tr>
						<tr>
							<td>Address</td>
							<td><input type="text" name="address" id="edIn" value="${cust.address}"></td>
						</tr>		
					</table>
				
					</c:forEach>
					<br><br>
					<input type="submit" name="submit" id="btnEd" value="Update My Data">
				</form>
			</center>	
		</div>	
	</body>
	<%@include file="/footer.jsp" %>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    	<%@include file="/header.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel = "stylesheet" href ="UM.css" >
		<meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<title>User Profile</title>
	</head>

	<body>	
			<img src="img/zzzz.jpg" style="width:100%" height="820">
				<div class="imgCont">
					<br/>
					<center><h1 id="up">User Profile</h1></center>
					<hr/ id="hr">
				
					<c:forEach var="cust" items="${custDetail}">
		
						<c:set var="fname" value="${cust.fname}"/>
						<c:set var="lname" value="${cust.lname}"/>
						<c:set var="mobile" value="${cust.mobile}"/>
						<c:set var="email" value="${cust.email}"/>
						<c:set var="address" value="${cust.address}"/>
						<c:set var="filename" value="${cust.filename}"/>
				
					<img src="img/${cust.filename}" id="UPimg" width="120" height="120"/><br/><br/><br/>
					<a href="uploadPic"><button name="proPic" id="dAccBtn">Update Profile Picture</button></a><br/><br/>
					<a href="deletePic"><button name="proPic2" id="dAccBtn2">Delete Profile Picture</button></a><br/><br/><br/><br/><br/>
				</div>	
				<div class="vl"></div>
				<div class="upCont">
						
						<label>First Name </label>      <label id="upIn1">: ${cust.fname}</label><br/><br/>
						<label>Last Name </label>       <label id="upIn2">: ${cust.lname}</label><br/><br/>
						<label>Mobile number </label>   <label id="upIn3">: ${cust.mobile}</label><br/><br/>
						<label>E-mail </label>          <label id="upIn4">: ${cust.email}</label><br/><br/>
						<label>Address </label>         <label id="upIn5">: ${cust.address}</label><br/><br/>
					
				</c:forEach>
					
					<a href="updateCu">
						<input type="button" name="update" id="eDeta" value="Edit Details">
					</a>
					<a href="paymentRetrieveServlet?">
						<input type="button" name="pay" id="vpay" value="View Payment Details">
					</a>
					<a href="deleteAcc.jsp">
						<button name="deAcc" id="dAccBtn3">Delete Account</button>
					</a>
				</div>	
	</body>
	<footer>
		
		<%@include file="/footer.jsp" %>
	</footer>
</html>
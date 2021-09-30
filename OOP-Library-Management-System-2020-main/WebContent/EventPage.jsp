<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<%@include file="/Header1.jsp" %>
<!DOCTYPE html>
<html>
<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<link rel = "stylesheet" type = "text/css" href = "my.css" />
</head>
<body>

<div class="eventsMain">
			<h1>Events Organised By The Columbus Library</h1>
		</div>
	<!--<table>
	<c:forEach var="event" items="${eventpage}">
	<td>Event ID: ${event.id}</td>
	<td>Event agelimit : ${event.agelimit}</td>
	<td>Event NAme : ${event.eventname}</td>
	<td>Event Desription : ${event.eventdes}</td><br>
	</c:forEach><br>
	</table>  -->
	
	<c:forEach var="event" items="${eventpage}">
		<div class="eventsDes">
			<form>
			
				<img src="img/${event.filename}" style="width:20%" height=300 id="pic">
				
				<h1>${event.eventname}</h1>
				<h2m>${event.agelimit}</h2m><br>
				<h2m1>On ${event.date} </h2m1><br>
				<h2m1>At ${event.time}</h2m1><br>
				<h3m>${event.eventdes}</h3m><br><br><br><br>
			
			<hr class="newx">
			</form><br>
		</div>
	</c:forEach><br>
</body>
<%@include file="/Footer1.jsp" %>
</html>
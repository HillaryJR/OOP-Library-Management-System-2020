<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <%@include file="/Header1.jsp" %>
<!DOCTYPE html>
<html>
<head>
		<meta charset="ISO-8859-1">
		<title>Magazines</title>
		<meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<link rel = "stylesheet" type = "text/css" href = "my.css" />
</head>
<body>
		<div class="search-container">
    			<!-- <form action="bsearch" method="post"> -->
      				<input type="text" placeholder="Search by Title or Author.." id="myInput" onkeyup="myFunction()" name="search">
      					<a href="magazine"><input type="image" src="img/searchIcon.png" class="search"></a> 
      				<!--	<input type="submit" name="submit" value="Login">
      				<button type="submit"><i class="fa fa-search"></i></button> -->
    			<!-- </form> -->
    	</div>
    	
    	<div class="cat1des">
			<h1>Magazines</h1>
				<h2n>Magazines are typically published weekly or monthly.Magazine covers a  wide variety of fields in a single topic. 
				     Most magazines are business related fashion related politics as well as sports.
				     We the Columbus Library provide some wide range of magazines to enhance your reading habbits.Pic your favourite and order it now.<br><br>
					 <pv style="color:red">Flip The Image To See The Details.</pv></h2n>
    	
    	<c:forEach var="period" items="${magazine}">
    	<div class="flip-card">
  			<div class="flip-card-inner">
    			<div class="flip-card-front">
     				 <img src="img/${period.filename}" alt="Avatar" style="width:300px;height:300px;">
    			</div>
   			   	 	<div class="flip-card-back">
   			   	 		<div id="write">
	      				
						<tr>
						<td><b>Magazine Name</b> : ${period.name}</td><br>
						</tr>
						<b>Publications</b> : ${period.publication}<br>
						<b>Edition</b> : ${period.edition}<br>
						<b>Pre-order fee</b> : Rs.${period.price}<br><br>
					
						</div>
	    			</div>
  				</div>
  				<button type="submit" class="C1IS1" onclick="reg()">Order</button>
		</div>
		</c:forEach><br>
    	
	<!-- <c:forEach var="search" items="${category1}">
	<td>Event ID: ${search.id}</td>
	<td>Event agelimit : ${search.categoryNum}</td>
	<td>Event NAme : ${search.name}</td>
	<td>Event Desription : ${search.author}</td>
	<td>Event Desription : ${search.edition}</td>
	<td>Event Desription : ${search.price}</td>
	<td>Event Desription : ${search.year}</td><br>
	</c:forEach><br>-->
	
</body>
<%@include file="/Footer1.jsp" %>
</html>
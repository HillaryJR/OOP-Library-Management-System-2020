<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <%@include file="/Header1.jsp" %>
<!DOCTYPE html>
<html>
<head>
		<meta charset="ISO-8859-1">
		<title>Category1</title>
		<meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<link rel = "stylesheet" type = "text/css" href = "my.css" />
		<link rel = "stylesheet" type = "text/css" href = "css/cart.css" />
		<script src = "JS/cart.js" async></script>
</head>
<body>
		<div class="search-container">
    			<!-- <form action="bsearch" method="post"> -->
      				<input type="text" placeholder="Search by Title or Author.." id="myInput" onkeyup="myFunction()" name="search">
      					<a href="category3"><input type="image" src="img/searchIcon.png" class="search"></a> 
      				<!--	<input type="submit" name="submit" value="Login">
      				<button type="submit"><i class="fa fa-search"></i></button> -->
    			<!-- </form> -->
    	</div>
    	
    	<div class="cat1des">
			<h1>Business Management</h1>
				<h2n>Successful management for small business owners is about identifying the right things to do, building a team, and then pulling them together to 
					 accomplish those things.  When done well, the whole enterprise and your life appear to be running smoothly and effortlessly.This collection of small 
					 business management books will help you to focus, leverage and manage all of the tasks, teams and personalities that are a part of your business and 
					 your life.We have included the publication date and the Twitter handles of each author, too.<br><br>
					<pv style="color:red">Flip The Image To See The Details.</pv></h2n>
    	
    	<c:forEach var="search" items="${category3}">
    	<div class="flip-card">
  			<div class="flip-card-inner">
    			<div class="flip-card-front">
     				 <img src="img/${search.filename}" alt="Avatar" style="width:300px;height:300px;">
    			</div>
   			   	 	<div class="flip-card-back">
   			   	 		<div id="write">
	      				
						<tr>
						<div class = "book-title">
								<b><td>Book Name :</b>	${search.name}</td><br>
						</div>
						</tr>
						<b>Author : </b> ${search.author}<br>
						<b>Edition : </b>${search.edition}<br>
						<b>Year : </b> ${search.year}<br>
						<div class = "book-price">
							<b>Pre-Order fee :</b> Rs${search.price}<br><br>
						</div>
						</div>
	    			</div>
  				</div>
  				<a href="cartInsertServlet?BookName=${search.name}&Price=${search.price}">
  					<button type="submit" class="C1IS1" onclick="reg()">Order</button>
  				</a>
		</div>
		</c:forEach><br>
		</div>
    	
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
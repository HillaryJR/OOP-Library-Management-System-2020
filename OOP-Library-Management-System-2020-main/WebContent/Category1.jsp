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
		
</head>
<body>
		<div class="search-container">
    			<!-- <form action="bsearch" method="post"> -->
      				<input type="text" placeholder="Search by Title or Author.." id="myInput" onkeyup="myFunction()" name="search">
      					<a href="category1"><input type="image" src="img/searchIcon.png" class="search"></a>
      				<!--	<input type="submit" name="submit" value="Login">
      				<button type="submit"><i class="fa fa-search"></i></button> -->
    			<!-- </form> -->
    	</div>
    	
    	<div class="cat1des">
			<h1>Information Technology</h1>
				<h2n>Our selection of Computer Books and Technology Books will provided guides for the novice ,tips and assistance for the student designer, 
					 or describe the story of a computer genius for technological inspiration.Discover the world of technology and computer science all for a low price.<br>
					 These books gives us a Foundation in Computers & Software That's Easy to Understand Computers Made Easy is designed to take your overall computer skills 
					 from a beginner to the next level. Get a top level understanding without a complex education. This easy to use guide will help you navigate your way to 
					 becoming proficient with computers, operating systems, hardware and software.<br><br>
					 <pv style="color:red">Flip The Image To See The Details.</pv></h2n>
    	
    	<c:forEach var="search" items="${category1}">
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
						<b>Year : </b>${search.year}<br>
						<div class = "book-price">
							<b>Pre-Order fee :</b> Rs${search.price}<br><br>
						</div>
						</div>
	    			</div>
  				</div>
  				<a href="cartInsertServlet?BookName=${search.name}&Price=${search.price}">
  					<button type="submit" class="C1IS1" >Order</button>
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
	
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>	
	
	
	
</body>
<%@include file="/Footer1.jsp" %>
</html>
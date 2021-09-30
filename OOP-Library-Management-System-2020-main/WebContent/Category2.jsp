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
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script>
		$(document).ready(function(){
  		$("#myInput").on("keyup", function() {
   		 var value = $(this).val().toLowerCase();
   		 $("#myList li").filter(function() {
     	 $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
   			 });
 		 });
	});
</script>
</head>
<body>
		<div class="search-container">
    			<!-- <form action="bsearch" method="post"> -->
      				<input type="text" placeholder="Search by Title or Author.." id="myInput" onkeyup="myFunction()" name="search">
      					<a href="category2"><input type="image" src="img/searchIcon.png" class="search"></a>
      				<!--	<input type="submit" name="submit" value="Login">
      				<button type="submit"><i class="fa fa-search"></i></button> -->
    			<!-- </form> -->
    	</div>
    	
    	<div class="cat1des">
			<h1>Engineering-Architecture</h1>
				<h2n>Are you studying engineering? Then you have come to the right place! Our free eBooks in this category will help you prepare for your exams thanks to 
					 sub-categories in electrical, mechanical, civil or environmental engineering. What are you waiting for?<br><br>
					 Books are a valuable source of information for any profession even more so for architects. With innumerable books available to download legally, 
					 there is no excuse for not reading architecture books.Whether you are an architect, a current or future architecture student or just someone with a 
					 passion for architecture, here are a few books (in no particular order) that will be a welcome addition to your library.<br><br>
					 <pv style="color:red">Flip The Image To See The Details.</pv></h2n>
    	
	    	<c:forEach var="search" items="${category2}">
	    	<div id="myList">
	    	<div class="flip-card" >
	  			<div class="flip-card-inner">
	    			<div class="flip-card-front" >
	     				 <img src="img/${search.filename}" alt="Avatar" style="width:300px;height:300px;" >
	    			</div>
	   			   	 	<div class="flip-card-back" >
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
	  					<button type="submit" class="C1IS1" onclick="reg()">Order</button>
	  				</a>
			</div>
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
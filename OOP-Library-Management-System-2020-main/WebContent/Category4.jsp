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
      					 <a href="category4"><input type="image" src="img/searchIcon.png" class="search"></a>
      				<!--	<input type="submit" name="submit" value="Login">
      				<button type="submit"><i class="fa fa-search"></i></button> -->
    			<!-- </form> -->
    	</div>
    	
    	<div class="cat1des">
			<h1>Hotel Management</h1>
				<h2n>Many hotel and hospitality practices are timeless, and many brands today are built on the ideas constructed in the past. So it is important to take the 
					 time to read the most useful books the industry has to offer.<br>For hoteliers looking for general pointers across the board, there is no better place to 
					 start. Offering advice based on proven experience, Venison takes holistic approach from the opening of a hotel to the day-to-day operations.<br><br>
					  <pv style="color:red">Flip The Image To See The Details.</pv></h2n>
    	
    	<c:forEach var="search" items="${category4}">
    	<div class="flip-card" >
  			<div class="flip-card-inner" >
    			<div class="flip-card-front" id="myUL">
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
		</c:forEach><br><br><br><br>
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
	
	<script>
function myFunction() {
    var input, filter, ul, li, a, i, txtValue;
    input = document.getElementById("myInput");
    filter = input.value.toUpperCase();
    ul = document.getElementById("myUL");
    li = ul.getElementsByTagName("li");
    for (i = 0; i < li.length; i++) {
        a = li[i].getElementsByTagName("a")[0];
        txtValue = a.textContent || a.innerText;
        if (txtValue.toUpperCase().indexOf(filter) > -1) {
            li[i].style.display = "";
        } else {
            li[i].style.display = "none";
        }
    }
}
</script>
	
</body>
<%@include file="/Footer1.jsp" %>
</html>
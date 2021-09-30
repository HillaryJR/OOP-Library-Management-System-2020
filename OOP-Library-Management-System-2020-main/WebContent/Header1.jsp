<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
	<head>
		<title> The Columbus Library</title>
			<meta charset="utf-8">
	        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
	        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	        <link rel = "stylesheet" href ="my.css">
			
	</head>

	<body>
	 	<div class="headerBack">
           	<div class="headerLogo">
            	<img src="img/BCP.jpg">
                <p>The Columbus Library</p>
            </div>
           <c:forEach var="cust" items="${custDetail}">
             <c:set var="filename" value="${cust.filename}"/>
           
    		<div class="userImage">
            	<a href="retreive"><img src="img/${cust.filename}" style="width:80px" height="80px"></a>
            </div>
           </c:forEach>
           
    		<div class="buttonSection">
                <a href="logout.jsp"><button class="btn">Log Out</button></a>
            </div>
            
    		<div class="headerBottom">
              <ul>
                 <li><a href="CartRetrieveServlet?" aria-hidden="true">Cart</a></li>
                	<li><a href="about" aria-hidden="true">About Our library</a></li>
                	  <li><a  href="#" aria-hidden="true">News</a></li>
                	    <li><a  href="display" aria-hidden="true">Events</a></li>
                 		  <li class="dropdownP"><a href="#">Periodicals</a>
                 		    <div class="dropdown-periodicals">
						      <a href="newspaper">News-Papers</a>
						      <a href="magazine">Magazines</a>
						    </div>
                 		  </li>
	                		<li class="dropdownC"><a href="#">Categories</a>
	                     	  <div class="dropdown-category">
							      <a href="category1">Information Technology</a>
							      <a href="category2">Engineering-Architecture</a>
							      <a href="category3">Business Management</a>
							      <a href="category4">Hotel Management</a>
							  </div>
	                 		</li>
                 				<li><a href="home">Home</a></li>
			  </ul>
            </div>
      	</div>
	</body>
</html>
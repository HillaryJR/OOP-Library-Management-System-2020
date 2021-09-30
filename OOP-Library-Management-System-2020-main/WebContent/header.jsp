<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<title>Header</title>
	</head>
	<body>
		<div class="headerBack">
	           	<div class="headerLogo">
	            	<img src="img/BCP.jpg">
	                <p>The Columbus Library</p>
	            </div>
	       <c:forEach var="cust" items="${custDetail}">
	       	<c:set var="filename"  value="${cust.filename}"/>
	      			   
	    		<div class="userImage">
	            	<a href="retreive"><img src="img/${cust.filename}" style="width:80px" height="80px"></a>
	            </div>
	       </c:forEach>
	       
	    		<div class="buttonSection">
	                <a href="logout.jsp"><button class="btn">Log Out</button></a>
	            </div>
	            	
	    		<div class="headerBottom">
	              <ul>
	                 <li><a href="#" aria-hidden="true">Cart</a></li>
	                	 <li><a  href="about" aria-hidden="true">About Our library</a></li>
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
	      	
	      	<style>
	      		.headerBack{
	      			position:static;
				    width:100%;
				    height:270px;
				    background-color: #194757;
				    color: white;
				    display:inline-block;
				}
				
				.headerLogo{
				  	width: 70%;
				    height:auto;
				    float:inherit;
				    display: inline-block;
				}
				.headerLogo img{
				    width:30%;
				    height:auto;
				    margin-left:0%;
				    display: inline-block;
				}
				.headerLogo p{
				    font-weight: bold;
				    font-size: 200%;
				    font-family: Comic Sans MS;
				    margin-left: 22%;
				    margin-top: -6.4%;
				    color: white;    
				}
				
				.userImage {
					margin-left: 87%;
					margin-top: -3%;
				}
				.userImage img{
					margin-top: -40%;
					cursor: pointer;
					border-radius:40px;
				}
				
				.buttonSection i{
				    width:10%;
				    height: auto;
				    border-radius: 3px;
					padding: 5px;
					color: black;
					border: none;
					background-color: white;  
				}
				.btn {
					font-weight: bold;
					border-radius: 3px;
					padding:8px;
					color: #194757;
					border: none;
					background-color: white;
					cursor: pointer;
					font-size:14px;
					margin-left: 87.4%;
					margin-top: 1%;
					font-family: Times New Roman ;
				}
				.btn:hover{
				    background-color: #b6cad1;
				}
				
				.headerBottom ul {
				    list-style-type: none;
				    margin-top: 4.7%;
				    padding: 0;
				    overflow: hidden;
				    background-color: #194757;
				    border: 1.5px solid white;
				}
				.headerBottom li {
				    float: right;
				    width: 12%;
				    height: 7%;
				    /*border: 1.5px solid white;*/
				}
				.headerBottom li a {
				    font-size: 120%;
				    font-weight: bold;
				    display: block;
				    color: white;
				    text-align: center;
				    padding: 14px 16px;
				    text-decoration: none;
				}
				.headerBottom li a:hover:not(.active) {
				    background-color: #b6cad1;
				}
				.active {
				    background-color: #b6cad1;
				}
				
				.dropdown-category {
				  display: none;
				  position: absolute;
				  background-color: #768282;
				  min-width: 190px;
				  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
				  z-index: 1;
				}
				.dropdown-category a {
				  padding: 30px 26px;
				}
				.dropdown-category a:hover {background-color:  #b6cad1;}
				
				.dropdownC:hover .dropdown-category {
				  display: block;
				}
				
				.dropdown-periodicals {
				  display: none;
				  position: absolute;
				  background-color: #768282;
				  min-width: 190px;
				  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
				  z-index: 1;
				}
				.dropdown-periodicals a {
				  padding: 30px 26px;
				}
				.dropdown-periodicals a:hover {background-color:  #b6cad1;}
				
				.dropdownP:hover .dropdown-periodicals {
				  display: block;
				}
	      	</style>
	</body>
</html>
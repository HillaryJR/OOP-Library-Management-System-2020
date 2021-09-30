<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/Header1.jsp" %>

<html>
	<head>
		<title>Home-Page</title>
		<meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<link rel = "stylesheet" type = "text/css" href = "my.css" />
		<script src="Home.js"></script>
		
	</head>
	
	<body>
		<div class="slideshow-container">
			<div class="mySlides fade">
  				 <!--<div class="numbertext">1 / 5</div>  --> 
  					<img src="img/l12.jpg" style="width:100%" height=650>
  				<div class="slide1">
  					<div id="wel"><i>Welcome To</i></div><br> <div id="TCL">The Columbus Library</div> 
  				</div>
			</div>

			<div class="mySlides fade">
 				<!--<div class="numbertext">2 / 5</div>   -->
  					<img src="img/l15.jpeg" style="width:100%" height=650>
	  		<div class="content1">
	  			<div class="slide2">
	  					<div id="omv">Our Mission & Vision</div><br>
	  					<div id="des1">Our mission is to nurture and foster community connections by providing the space and resources for patrons to be educated, entertained, and enriched.<br><br>
						 		   Our vision is to be at the heart of our community. The go-to place to meet, learn, and do.</div><br>
					</div> 
	  			</div>
			</div> 

			<div class="mySlides fade">
  				<!--  <div class="numbertext">3 / 5</div> -->
  					<img src="img/l16.png" style="width:100%" height="650">
  				<div class="content2">
  					<div class="slide3">Our, The Columbus Library is committed to providing everyone unimpeded access to our resources, programs, and services.<br>
  										 We are actively working to increase our website accessibility and usability.<br>
  										 Our priority is to server our customers without any delay.</div>
  				</div>						 
			</div> 
			
			<div class="mySlides fade">
  				 <!-- <div class="numbertext">4 / 5</div> -->
  					<img src="img/l17.jpg" style="width:100%" height="650">
  				<div class="content3">	
  					<div class="slide4">We Have Over 35 Staff and<br><br>
  										Over 200 Online Customers<b>
  					</div>
  				</div>
			</div>
			
			<div class="mySlides fade">
  				 <!-- <div class="numbertext">5 / 5</div> -->
  					<img src="img/l18.jpg" style="width:100%" height="650">
  				<div class="content4">
  					<div class="slide5">We have over 200 different books,<br><br>According to 4 different categories.</div>
				</div>
			</div>
		</div><br>

		<div style="text-align:center">
  			<span class="dot"></span> 
  			<span class="dot"></span> 
  			<span class="dot"></span> 
  			<span class="dot"></span>
  			<span class="dot"></span> 
		</div>
			<script>
		var slideIndex = 0;
		showSlides();

		function showSlides() {
		  var i;
		  var slides = document.getElementsByClassName("mySlides");
		  var dots = document.getElementsByClassName("dot");
		  for (i = 0; i < slides.length; i++) {
		    slides[i].style.display = "none";  
		  }
		  slideIndex++;
		  if (slideIndex > slides.length) {slideIndex = 1}    
		  for (i = 0; i < dots.length; i++) {
		    dots[i].className = dots[i].className.replace(" active", "");
		  }
		  slides[slideIndex-1].style.display = "block";  
		  dots[slideIndex-1].className += " active";
		  setTimeout(showSlides, 5000); // Change image every 2 seconds
		}
		</script>
				
		<div class="secondP">
			<div id="bs">Best-Sellers</div>
			<div id="tyts">This months top sellers</div><br>
		</div><br><br>
		
		<div class="bestS">
			<div class="bs1">
				<img src="img/h2.png" class="bss1" style="width:40%" height=400>
					<div class="box1">
						<div class="bookname1">
							<a href="category4"><h4><div id="bookname1">Ultimate Guide</div>Author : Robert Vince<br>Year : 2018<br>Price : Rs.1500.00</h4></a>
						</div>
					</div>
			</div>
			
			<div class="bs1">
				<img src="img/b2.jpg" class="bss2" style="width:40%" height=400>
					<div class="box2">
						<div class="bookname2">
							<a href="category1"><h4><div id="bookname1">Practical<br>Programming</div>Author : k.Tony<br>Year : 2019<br>Price : Rs.1500.00</h4></a>
						</div>	
					</div>
			</div>
			
			<div class="bs1">
				<img src="img/b3.jpg" class="bss3" style="width:40%" height=400>
					<div class="box3">
					    <div class="bookname3">
							<a href="category2"><h4><div id="bookname1">Oxford<br>Mathematics</div>Author : S.J.Pery<br>Year : 2017<br>Price : Rs.2000.00</h4></a>
						</div>	
					</div>
			</div>	
			
			<div class="bs1">
				<img src="img/h3.jpg" class="bss4" style="width:40%" height=400>
					<div class="box4">
					    <div class="bookname4">
							<a href="category2"><h4><div id="bookname1">The Iconic<br>House</div>Author : T.Hudson<br>Year : 2019<br>Price : Rs.1800.00</h4></a>
						</div>	
					</div>
			</div>
			
			<div class="bs1">
				<img src="img/book5.jpg" class="bss5" style="width:40%" height=400>
					<div class="box5">
					   	<div class="bookname5">
							<a href="category3"><h4><div id="bookname1">Business<br>Accounting</div>Author : F.Wood<br>Year : 2018<br>Price : Rs.1500.00</h4></a>
						</div>
					</div>
			</div>
			
			
			
		</div>
		
		
	</body><br><br>
		<%@include file="/Footer1.jsp" %>

</html>

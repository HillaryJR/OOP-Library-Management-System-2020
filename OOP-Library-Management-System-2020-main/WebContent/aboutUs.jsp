<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<link rel = "stylesheet" href ="UM.css">
		<title>About Us</title>
	</head>
	<%@include file="/header.jsp" %>
	<body>
		<div class = "content">
			
				<div class = "side">
				
					<a href = "about"><button name = "about" class = "sidebutton" style="background-color:#1f63e0;">About Colombus Library</button><br /></a>
					<a href = "vm"><button name = "vm" class = "sidebutton">Vision And Mission</button><br /></a>
					<a href = "gall"><button name = "gallery" class = "sidebutton">Our Gallery</button><br /></a>
				</div>
				
				<div class = "otherSide">
					<h1>About Colombus Library</h1>
					<hr>
					<h3>Who we are</h3>
					<p id = "para">
						Colombus Library is the heart of the University. 
						Our huge range of resources and guidance from our expert library staff will set you on the path to success. 
						With extended hours, bookable computers and a broad selection of study spaces, 
						each Colombus Library campus offers the ideal place to focus on your studies.
					</p>
					
					<h3>Plans, projects and guidelines</h3>
					<p id = "para">
						The library is far more than just a place full of books-although we do have millions of print and digital resources for you to explore! 
						Our diverse staff are skilled in the areas of digital literacy, research support, innovation and much more. 
						No matter which campus you're on, you can find expert guidance and advice at our service desk or through our Library Chat service.
					</p>
					
					<h3>How to access</h3>
					<p id = "para">
						Colombus Library provides services, facilities and support to students, staff and members of the community. 
						You are automatically a member of the library if you attend or work for Colombus, but if you live in the community, 
						are part of our alumni or are a reciprocal borrower from another university, 
						check out our membership page to learn how you can get access to Colombus Library resources and facilities.
					</p><br/>
				</div>
			</div><br/><br/>
			
	</body>
	<%@include file="/footer.jsp" %>
</html>

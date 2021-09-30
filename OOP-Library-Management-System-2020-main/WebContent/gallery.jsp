<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
			<meta charset="utf-8">
	        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<!-- 	<link rel = "stylesheet" href ="UM.css"> -->
		<link rel = "stylesheet" href ="UM.css">
			<title>Our Gallery</title>
</head>
	<%@include file="/header.jsp" %>
<body>
	
	<br><br><div class = "content">
		
			<div class = "side">
				<a href = "about"><button name = "about" class = "sidebutton">About Colombus Library</button><br /></a>
				<a href = "vm"><button name = "vm" class = "sidebutton">Vision And Mission</button><br /></a>
				<a href = "gal"><button name = "gallery" class = "sidebutton" style="background-color:#1f63e0;">Our Gallery</button><br /></a>
			</div>
			
			<div class = "otherSide">
				<h1>Our Gallery</h1>
				<hr>
				<img src = "img/gal1.jpg" style="width:24%" height=180 class = "imgzoom">
				<img src = "img/gal2.jpg" style="width:24%" height=180 class = "imgzoom">
				<img src = "img/gal3.jpg" style="width:24%" height=180 class = "imgzoom">
				<img src = "img/gal4.jpg" style="width:24%" height=180 class = "imgzoom">
				<img src = "img/gal5.jpg" style="width:24%" height=180 class = "imgzoom">
				<img src = "img/gal6.jpg" style="width:24%" height=180 class = "imgzoom">
				<img src = "img/gal7.jpg" style="width:24%" height=180 class = "imgzoom">
				<img src = "img/gal8.jpg" style="width:24%" height=180 class = "imgzoom">
			</div>
			
		</div>
		
</body>
<%@include file="/footer.jsp" %>
</html>
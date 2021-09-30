<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet" href ="UM.css">
<title>Vission and Mission</title>
</head>
<body>
	<%@include file="/header.jsp" %>
	<div class = "content">
		
			<div class = "side">
			
				<a href = "about"><button name = "about" class = "sidebutton">About Colombus Library</button><br /></a>
				<a href = "vm"><button name = "vm" class = "sidebutton"style="background-color:#1f63e0;">Vision And Mission</button><br /></a>
				<a href = "gall"><button name = "gallery" class = "sidebutton">Our Gallery</button><br /></a>
			</div>
			
			<div class = "otherSide">
				<h1>MISSION, VISION & VALUES</h1>
				<hr>
				<h3>Vision</h3>
				<p id = "para">
					Colombus Libraries will be a strategic institutional asset that develops and delivers new methods of creating and supporting knowledge resources. 
					We will enrich teaching and learning and fuel research at Colombus and worldwide.
				</p><br/>
				
				<h3>Mission</h3>
				<p id = "para">
					Colombus Libraries advance discovery, innovation and learning for Colombus, for the state of Kansas and for a rapidly expanding community of world scholars. 
					We equip our students for a knowledge-driven, global society, and we support research and scholarly communication through collaborative opportunities at Colombus and beyond.
				</p><br/><br/>
				
				<h3>Values</h3>
				<div class="points">
					<ul>
						<li>Leadership: We bring a unique perspective and vision from the heart of the scholarly enterprise as expert partners and as scholars in librarianship.</li>
						<li>Accountability: We create measurable positive outcomes for our stakeholders.</li>
						<li>Communication: We foster transparent dialogue in our organization and among our partners and those we serve.</li>
						<li>Agility: We anticipate and respond to user needs.</li>
						<li>Collaboration: We respect the knowledge and skills of others as we bring together the best minds to pursue creative endeavors.</li>
						<li>Service: We strive to provide the very best ideas, people, facilities and technologies.</li>
						<li>Innovation: We employ creative solutions to address our users' needs.</li>
						<li>Diversity: We seek a diverse workforce and encourage all ideas and perspectives.</li>
					</ul>
				</div>
				<br/>
			</div>
		</div><div style="padding-bottom: 11%;"></div>
		<%@include file="/footer.jsp" %>
</body>
</html>
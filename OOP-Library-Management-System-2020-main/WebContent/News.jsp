<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="Header1.jsp" %>
<!DOCTYPE html>
<html>
<head>
	
    <title>Columbus Library</title>

    <!-- Bootstrap CSS CDN -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous"> 
<link href="//netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
<link href="//netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
  
   
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/News.css">

    
  <!-- Custom styles for this template -->
  <link href="modern-business.css" rel="stylesheet">
  

<!-- Bootstrap JS CDN -->  
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
   
   

</head>
<body style = "background-color: #d4d1c9;">
<div class = "carousel1head">
  <header>
      <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
           <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
          <!-- Slide One - Set the background image for this slide in the line below -->
          <div class="carousel-item active" style="background-image: url('images/bookproject5.jpg')">
            
          </div>
          <!-- Slide Two - Set the background image for this slide in the line below -->
          <div class="carousel-item" style="background-image: url('images/bookproject2.jpg')">
            
          </div>
          <!-- Slide Three - Set the background image for this slide in the line below -->
          <div class="carousel-item" style="background-image: url('images/bookproject1.jpg')">
            
          </div>
          
          <div class="carousel-item" style="background-image: url('images/bookproject3.jpg')">
            
          </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
    </header>
</div>
<br><br>

    <!-- Intro Content -->
    <div class = "container style2">
    <div class="row style3">
      <div class="col-lg-6">
        <img class="fluid rounded mb-4" src="" alt="">
        
      </div>
      <div class="col-lg-6 style1" >
        <h2>About Modern Business</h2>
        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sed voluptate nihil eum consectetur similique? Consectetur, quod, incidunt, harum nisi dolores delectus reprehenderit voluptatem perferendis dicta dolorem non blanditiis ex fugiat.</p>
        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Saepe, magni, aperiam vitae illum voluptatum aut sequi impedit non velit ab ea pariatur sint quidem corporis eveniet. Odit, temporibus reprehenderit dolorum!</p>

        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Et, consequuntur, modi mollitia corporis ipsa voluptate corrupti eum ratione ex ea praesentium quibusdam? Aut, in eum facere corrupti necessitatibus perspiciatis quis?</p>
        

           
      </div>
    </div>
    </div>
<br>
 <div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-4">Latest of All in Colombus Library</h1>
    <p class="lead">Sprinkle your Knowloedge in a glimpse</p>
  </div>
</div>   





<table>
        <tbody>
                           
        <c:forEach var="news" items="${listNews}">                     
        <c:set var = "id" value = "${news.id}"/>
		<c:set var = "topic" value = "${news.topic}"/>
		<c:set var = "description" value = "${news.description}"/>
		<c:set var = "date" value = "${news.date}"/>
		<c:set var = "filename" value = "${news.filename}"/>


        <tr class = "tableRow">
  
<div class = "container">
	<div class="card text-center">
	  <div class="card-header">
	  <c:out value="${news.topic}" />
	  </div>
	  <div class="card-body maincb" >
	   
	    <div class="row no-gutters">
	            <div class="col-lg-5">
	               <image src = "images/<c:out value="${news.filename}" />" width = "400", height = "250" class = "rounded"/> 
	            </div>
	            <div class="col-lg-7">
	                <div class="card-block px-2">

    
				<div id="accordion">
				 	 <div class="card">
				 
				         <button class="btn btn-primary" data-toggle="collapse" data-target="#collapseOne" aria-expanded="false" aria-controls="collapseOne">
				          Click to View More
				        </button> 
				        
				     
				
				    <div id="collapseOne" class="collapse" aria-labelledby="headingOne" data-parent="#accordion">
				      <div class="card-body">
				       <c:out value="${news.description}" />
				      </div>
				    </div>
					</div>
				</div>    
				  


                </div>
            </div>
        </div>
    
  </div>
  <div class="card-footer">
   <c:out value="${news.date}" />
  </div>
</div>
</div>
                                
         
                </tr>
                                
<br>             
                                
                                
                                
                </c:forEach>
                           
             </tbody>
 </table> 











<div class = "bg_test">
<div class = "container">
       
   <h1 class="text-center" style="font-family: cursive; margin-top:40px;">Senior Staff</h1>   

        <!------------------ Hover Effect Style : Demo - 16 --------------->

            <div class="row mt-40">
                <div class="col-md-3 col-sm-6">
                    <div class="box16">
                        <img src="images/GCimg26.jpg">
                        <div class="box-content">
                            <h3 class="title";>harbajan Singh</h3>
                            <h5 class="title" style="font-size:17px;color:white;">(Assistant Librarian)</h5>
                            <span class="post">
                            	<b>I loved it there</b><br>
                            Columbus Library is actually out of this world. When you do inside it feels like it's a pradise.</span>
                            <ul class="social1">
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-instagram"></i></a></li>
                                <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="box16">
                        <img src="images/GCimg27.jpg">
                        <div class="box-content">
                            <h3 class="title">Kristianaldino</h3>
                            <h5 class="title" style="font-size:17px;color:white;">Systems Manager</h5>
                            <span class="post">
                            	<b>Wonderful Experience</b>
                            	<br>
                            Wonderful experience.Wonderful stay.Nice ambience.courteous staff, clean and hygiene place.</span>
                            <ul class="social1">
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-instagram"></i></a></li>
                                <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="box16">
                        <img src="images/GCimg28.jpg">
                        <div class="box-content">
                            <h3 class="title">John Seller</h3>
                            <h5 class="title" style="font-size:17px;color:white;">Senior Librarian</h5>
                            <span class="post">
                            	<b>Professional and friendly staff</b>
                            	<br>
                            	Must say this place amazed me to the core. From the very step in the hotel to the last we were.
                            </span>
                            <ul class="social1">
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-instagram"></i></a></li>
                                <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="box16">
                        <img src="images/GCimg29.jpg">
                        <div class="box-content">
                            <h3 class="title">Ching see Pong</h3>
                            <h5 class="title" style="font-size:17px;color:white;">Staff</h5>
                            <span class="post">
                            	<b>Best Library </b>
                            	<br>
                            	Very nice hotel. Can be a little confusing to get around. Very clean. Nice buffet food spicy and clean
                            </span>
                            <ul class="social1">
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-instagram"></i></a></li>
                                <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                            </ul>
                        </div>
                    </div>
                </div>                
            </div>
        

 	

<script src = 'https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>
	            <script src = 'https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
	            <script>
	            	$(document).ready(function(){
	            		swal("Colombus Library","News","success");
	            	});
	            </script>

</div>
</div>
</body>
<%@include file ="Footer1.jsp" %>
</html>


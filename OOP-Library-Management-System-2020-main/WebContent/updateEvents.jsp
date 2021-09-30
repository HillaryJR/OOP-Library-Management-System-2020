<%@ page language="java" contentType="text/html; charset=ISO-8859-1"	
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		
		 <!-- Bootstrap CSS CDN -->
     	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous"> 

	    <link rel="stylesheet" href="css/bootstrap.css">
	    <link rel="stylesheet" href="css/bootstrap.min.css">
	    <!-- Our Custom CSS -->
	    <link rel="stylesheet" href="styleAV.css">
		<link rel = "stylesheet" href = "my.css">
	    <!-- Font Awesome JS -->
	    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
	    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>
		
</head>


<body style="background-color:#060818;">
<div class="wrapper">
        <!-- Sidebar  -->
        <nav id="sidebar" style="height:1100px;">
            <div class="sidebar-header">
<h3>               
<div class="profile clearfix" style="align-content: center">
    <div class="profile_pic">
        <img src="img/user8-128x128.jpg" alt="..."  class="rounded-circle" >
    </div>
<div class="profile_info">
    <p>online</p>
    <!-- <span>Welcome,</span> -->
    <h2>John Doe</h2>
</div>
</div>
</h3>
                <strong>LMS</strong>
 
            </div>

           
            <ul class="list-unstyled components">

                <li>
                    <a href="#">
                        <i class="fas fa-tachometer-alt"></i>
                        Dash Board
                    </a>
                </li>

                <li>
                    <a href="#myprofileSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">
                    <i class="fas fa-user"></i>
                       My Profile
                    </a>

                    <ul class="collapse list-unstyled" id="myprofileSubmenu">
                        <li>
                            <a href="#">
                            <i class="fas fa-eye"></i>
                            View Profile
                            </a>
                        </li>
                        <li>
                            <a href="#">
                            <i class="fas fa-redo"></i>
                            Update Profile
                            </a>
                        </li>
                    </ul>
                </li>

                <li>    <!-- <li class="active">    was removed from here -->

                    <a href="#profileSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">
                        <i class="fas fa-users"></i>
                        Manage users
                    </a>
                    <ul class="collapse list-unstyled" id="profileSubmenu">
                        <!-- <li>
                            <a href="#" >
                                 <i class="fas fa-user-plus"></i>    
                                Add User
                            </a>
                        </li> -->
                        <li>
                            <a href="vUser">
                                <i class="fas fa-eye"></i>
                                View all users
                            </a>
                        </li>
                    </ul>
                </li>
<!--  -->
                <li>
                    <a href="#mangeBookSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">
                        <i class="fas fa-book"></i>
                        Manage Books
                    </a>
                    <ul class="collapse list-unstyled" id="mangeBookSubmenu">
                        <li>
                            <a href="#">
                            <i class="fas fa-plus"></i>   
                            Add Books
                            </a>
                        </li>
                        <li>
                            <a href="#">
                            <i class="fas fa-eye"></i>
                            View Books
                            </a>
                        </li>
                    </ul>

                    <a href="#manageEventsSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">
                        <i class="fas fa-calendar-check"></i>
                        Manage Library Events
                    </a>
                    <ul class="collapse list-unstyled" id="manageEventsSubmenu">
                        <li>
                            <a href="addEvents.jsp">
                            <i class="fas fa-plus"></i>   
                            Add Events
                            </a>
                        </li>
                        <li>
                            <a href="viewEvent.jsp">
                            <i class="fas fa-eye"></i>
                            View all Events
                            </a>
                        </li>
                    </ul>



                    <a href="#ManageSettingsSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">
                        <i class="fas fa-calendar-check"></i>
                        Manage Settings
                    </a>
                    <ul class="collapse list-unstyled" id="ManageSettingsSubmenu">
                        <li>
                            <a href="#">
                            <i class="fas fa-plus"></i>   
                            Manage book categories
                            </a>
                        </li>
                        <li>
                            <a href="#">
                            <i class="fas fa-eye"></i>
                            View all Events
                            </a>
                        </li>
                    </ul>


                    <a href="#managepagesSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">
                        <i class="fas fa-calendar-check"></i>
                        Manage Pages
                    </a>
                    <ul class="collapse list-unstyled" id="managepagesSubmenu">
                        <li>
                            <a href="#"> 
                               <i class="fas fa-newspaper"></i>
                            News page
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="fas fa-address-book"></i>
                            Contact page
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="fas fa-briefcase"></i>
                            About us page
                            </a>
                        </li>
                    </ul>
                </li>

<!--  -->

                <li>
                    <a href="#">
                        <i class="fas fa-image"></i>
                        Portfolio
                    </a>
                </li>
                <li>
                    <a href="#">
                        <i class="fas fa-question"></i>
                        FAQ
                    </a>
                </li>
                <li>
                    <a href="#">
                        <i class="fas fa-paper-plane"></i>
                        Contact
                    </a>
                </li>
            </ul>


            <ul class="list-unstyled CTAs">
                <li>
                    <a href="https://bootstrapious.com/tutorial/files/sidebar.zip" class="download">Download source</a>
                </li>
                <li>
                    <a href="https://bootstrapious.com/p/bootstrap-sidebar" class="article">Back to article</a>
                </li>
            </ul>
        </nav>

        <!-- Page Content  -->
        <div id="content">
  

                    <button type="button" id="sidebarCollapse" class="btn btn-info">
                        <i class="fas fa-align-left"></i>
                        <span></span>
                    </button>
                    <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <i class="fas fa-align-justify"></i>
                    </button>

<br><br>
            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a href="#" class="navbar-brand">Update Library Events</a>
                    </div>

                </nav>
            </header>
			
			<!-- <h1 style="color:#00f9ff;font-size:40px;text-align:center;margin-left:25%;">Add Events</h1><hr> -->
			
		<%
		String id = request.getParameter("eCode");
		String agelimit = request.getParameter("aLimit");
		String eventname = request.getParameter("eName");
		String eventdes = request.getParameter("eDes");
		String date = request.getParameter("eDate");
		String time = request.getParameter("eTime");
		%>
		<div class ="eventFormCon">
			<br/>
			<center>
				<div class="mgk">
					
					<form action="update" method="post" >
						<label class="evid1">Event Code</label><br>
						<input type="text" name="eCode" id="evid1x" value="<%= id %>" readonly></input><br>
						
						<label  class="evid2">Participants</label><br>
						<input type ="text" name ="aLimit" id="evid2x" value="<%= agelimit %>" ></input><br/>

						 <label class="evid3">Event Name</label><br>
						<input type ="text" name ="eName" id="evid3x" value="<%= eventname %>" ></input><br/>
						
						<label class="evid4">Event Description</label><br>
						<textarea name ="eDes" id="evid4x" value="<%= eventdes %>" ></textarea><br/><br/>
						
						
						<label class="evid5">Event Date</label>
						<input type="text" name="eDate" id="evid5x" value="<%= date %>"></input><br/>

						<label class="evid6">Event Time</label>	
						<input type="text" name="eTime"  id="evid6x" value="<%= time %>"></input><br/><br/> 
						
						
						
						<center><button type="submit" id="btnregister" >Update this events</button></center>
					</form>
				</div>
			</center>
        </div><br><br><br>
         </div>
          <!-- Page Content  -->
  
    </div>

    <!-- jQuery CDN - Slim version (=without AJAX) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>

    <script type="text/javascript">
        $(document).ready(function () {
            $('#sidebarCollapse').on('click', function () {
                $('#sidebar').toggleClass('active');
            });
        });
    </script>

</body>
</html>
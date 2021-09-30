 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Columbus Library</title>

    <!-- Bootstrap CSS CDN -->
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous"> 

   
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/style1.css">

    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>

</head>

<body>

    <div class="wrapper">
        <!-- Sidebar  -->
        <nav id="sidebar">
            <div class="sidebar-header">
<h3>               
<div class="profile clearfix" style="align-content: center">
    <div class="profile_pic">
        <div class="buttonSection">
                <a href="logout.jsp"><button class="btn">Log Out</button></a>
            </div>
    </div>
<div class="profile_info">
    <p>online</p>
    <!-- <span>Welcome,</span> -->
    <h2>Cololmbus Library</h2>
</div>
</div>
</h3>
                <strong>LMS</strong>
 
            </div>

                
            <ul class="list-unstyled components">

                <li>
                    <a href="<%=request.getContextPath()%>/QAServlet">
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
                            <a href="<%=request.getContextPath()%>/AdminRetriveServlet">
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
                        <li>
                           <a href="<%=request.getContextPath()%>/UserListServlet">
                                <i class="fas fa-eye"></i>
                                View all users
                            </a>
                        </li>
                    </ul>
                </li>
                
                <li>    <!-- <li class="active">    was removed from here -->

                    <a href="#staffSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">
                        <i class="fas fa-users"></i>
                        Manage Staff
                    </a>
                    <ul class="collapse list-unstyled" id="staffSubmenu">
                        <li>
                            <a href="StaffInsert.jsp">
                            <i class="fas fa-plus"></i>   
                            Add Staff
                            </a>
                        </li>
                        <li>
                           <a href="<%=request.getContextPath()%>/StaffListServlet">
                                <i class="fas fa-eye"></i>
                                View all staff
                            </a>
                        </li>
                        
                    </ul>
                </li>
                
				<!-- Books -->
                <li>
                    <a href="#mangeBookSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">
                        <i class="fas fa-book"></i>
                        Manage Books
                    </a>
                    <ul class="collapse list-unstyled" id="mangeBookSubmenu">
                        <li>
                            <a href="BookInsert.jsp">
                            <i class="fas fa-plus"></i>   
                            Add Books
                            </a>
                        </li>
                        <li>
                            <a href="<%=request.getContextPath()%>/BookListServlet">
                            <i class="fas fa-eye"></i>
                            View Books
                            </a>
                        </li>
                    </ul>
				<!-- Periodicals -->                    
                   <a href="#mangePeriodicalsSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">
                         <i class="fas fa-newspaper"></i>
                        Manage periodicals
                    </a>
                    <ul class="collapse list-unstyled" id="mangePeriodicalsSubmenu">
                        <li>
                            <a href="PeriodicalInsert.jsp">
                            <i class="fas fa-plus"></i>   
                            Add Periodicals
                            </a>
                        </li>
                        <li>
                            <a href="<%=request.getContextPath()%>/PeriodicalListServlet">
                            <i class="fas fa-eye"></i>
                            View Periodicals
                            </a>
                        </li>
                        
                    </ul>

                    <a href="#manageEventsSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">
                        <i class="fas fa-calendar-check"></i>
                        Manage Library Events
                    </a>
                    <ul class="collapse list-unstyled" id="manageEventsSubmenu">
                        <li>
                            <a href="#">
                            <i class="fas fa-plus"></i>   
                            Add Events
                            </a>
                        </li>
                        <li>
                            <a href="#">
                            <i class="fas fa-eye"></i>
                            View all Events
                            </a>
                        </li>
                    </ul>
                    
                    <a href="#manageNewsSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">
                        <i class="fas fa-calendar-check"></i>
                        Manage Lib. News Page
                    </a>
                    <ul class="collapse list-unstyled" id="manageNewsSubmenu">
                        <li>
                            <a href="NewsInsert.jsp">
                            <i class="fas fa-plus"></i>   
                            Add News
                            </a>
                        </li>
                        <li>
                            <a href="<%=request.getContextPath()%>/NewsListServlet">
                            <i class="fas fa-eye"></i>
                            View all News
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
                            <a href="<%=request.getContextPath()%>/NewsListPageServlet">
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
				<script src = 'https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>
	            <script src = 'https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
	            <script>
	            	$(document).ready(function(){
	            		swal("Welcome to Quick Access Admin Dash Board","","success");
	            	});
	            </script>


<style>

.card-text{
	colour:white;
	font-size: 50px;
	
}
.card-title{
margin-top:-10px;
position:relative;
float:left;
left:100px;
}
.card{
	height:90px;
}
</style>

<br><br>

<div class = "container">
<div class = "row">

<div class = "col-lg-4">
<div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
  <div class="card-header">Number of Customers</div>
  <div class="card-body">
    <h5 class="card-title">${userCount}</h5>
  
  </div>
</div>
</div>


<div class = "col-lg-4">
<div class="card text-white bg-primary mb-3" style="max-width: 18rem;">
  <div class="card-header">Number of Staff</div>
  <div class="card-body">
    <h5 class="card-title">${staffCount}</h5>
  
  </div>
</div>
</div>

</div>

</div>



<div class = "container">
<div class = "row">
<div class = "col-lg-4">
<div class="card text-white bg-primary mb-3" style="max-width: 18rem;">
  <div class="card-header">Number of periodicals</div>
  <div class="card-body">
    <h5 class="card-title">${periodicalCount}</h5>
   
  </div>
</div>
</div> 

<div class = "col-lg-4">
<div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
  <div class="card-header">Number of Magazines</div>
  <div class="card-body">
    <h5 class="card-title">${magCount}</h5>
  
  </div>
</div>
</div>
<div class = "col-lg-4">
<div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
  <div class="card-header">Number of News Papers</div>
  <div class="card-body">
    <h5 class="card-title">${newsCount}</h5>
  
  </div>
</div>
</div>


</div>

</div>


<div class = "container">
<div class = "row">

<div class = "col-lg-4">
<div class="card text-white bg-primary mb-3" style="max-width: 18rem;">
  <div class="card-header">Number of Books</div>
  <div class="card-body">
    <h5 class="card-title">${bookCount}</h5>
  
  </div>
</div>
</div>

</div>

</div>




<div class = "container">
<div class = "row">
<div class = "col-lg-3">
<div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
  <div class="card-header">IT Books</div>
  <div class="card-body">
    <h5 class="card-title">${bookCountI}</h5>
   
  </div>
</div>
</div> 

<div class = "col-lg-3">
<div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
  <div class="card-header">Engineering books</div>
  <div class="card-body">
    <h5 class="card-title">${bookCountE}</h5>
  
  </div>
</div>
</div>
<div class = "col-lg-3">
<div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
  <div class="card-header">Business Management</div>
  <div class="card-body">
    <h5 class="card-title">${bookCountB}</h5>
  
  </div>
</div>
</div>

<div class = "col-lg-3">
<div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
  <div class="card-header">Hotel Management</div>
  <div class="card-body">
    <h5 class="card-title">${bookCountH}</h5>
  
  </div>
</div>
</div>


</div>

</div>


<br><br>

<div class = "container">
<p style = "colour:white;">Progresss Bar<p>
<div class="progress">
  <div class="progress-bar bg-dark" role="progressbar" style="width: ${bookCount}%" aria-valuenow="${bookCount}" aria-valuemin="0" aria-valuemax="20">Books</div>
  <div class="progress-bar bg-primary" role="progressbar" style="width: ${userCount}%" aria-valuenow="${userCount}" aria-valuemin="0" aria-valuemax="20">Customers</div>
  <div class="progress-bar bg-dark" role="progressbar" style="width: ${periodicalCount}%" aria-valuenow="${periodicalCount}" aria-valuemin="0" aria-valuemax="20">Periodicals</div>
</div>


</div>

<br><br>
<div class = "container">
<div class = "row">
<div class = "col-lg-4"></div>
<div class = "col-lg-8">


<div class="month">      
  <ul>
    <li class="prev">&#10094;</li>
    <li class="next">&#10095;</li>
    <li>
      August<br>
      <span style="font-size:18px">2017</span>
    </li>
  </ul>
</div>

<ul class="weekdays">
  <li>Mo</li>
  <li>Tu</li>
  <li>We</li>
  <li>Th</li>
  <li>Fr</li>
  <li>Sa</li>
  <li>Su</li>
</ul>

<ul class="days">  
  <li>1</li>
  <li>2</li>
  <li>3</li>
  <li>4</li>
  <li>5</li>
  <li>6</li>
  <li>7</li>
  <li>8</li>
  <li>9</li>
  <li><span class="active">10</span></li>
  <li>11</li>
  <li>12</li>
  <li>13</li>
  <li>14</li>
  <li>15</li>
  <li>16</li>
  <li>17</li>
  <li>18</li>
  <li>19</li>
  <li>20</li>
  <li>21</li>
  <li>22</li>
  <li>23</li>
  <li>24</li>
  <li>25</li>
  <li>26</li>
  <li>27</li>
  <li>28</li>
  <li>29</li>
  <li>30</li>
  <li>31</li>
</ul>

</div>
</div>
</div>
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
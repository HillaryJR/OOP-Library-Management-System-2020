<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Columbus Library</title>

    <!-- Bootstrap CSS CDN -->
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous"> 

    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/style.css" type="text/css">
     <link href="css/style1.css" rel="stylesheet" type="text/css">

 	<!-- Custom JS -->
 	<script src="js/script.js"></script>

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

<!--             <nav class="navbar navbar-expand-lg navbar-light bg-light"> -->
<!--                 <div class="container-fluid"> -->

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
                        <a href="#" class="navbar-brand">Update Periodical Detail</a>
                    </div>

                </nav>
            </header>

<div class = "container">
	<div class = "row">
		<div class = "col-lg-8"></div>
		<div class = "col-lg-4">
					<ul>
                        <li><a href="<%=request.getContextPath()%>/PeriodicalListServlet">
                        <button type="" class="btn btn-secondary btn-block btn-sm">
                        View Book List
                        <i class="fas fa-eye"></i> 
                        </a>
                        </button>
                        </li>
                    </ul>
		</div>
	</div>
</div>
	<%
		String id = request.getParameter("id");
		String type = request.getParameter("type");
		String name = request.getParameter("name");
		String publication = request.getParameter("publication");
		String edition = request.getParameter("edition");
		String price = request.getParameter("price");
		String year = request.getParameter("year");
		String filename = request.getParameter("filename");
		
	%>

	<div class = "container">
		<div class = "card text-white special-card">
			<div class = "card-body">
					<form action="updateP" method ="post" enctype="multipart/form-data" >

<div class="form-group">
    <label for="id">Periodical ID</label>
    <input type="text" class="form-control" id="id"  placeholder="BOOK ID" name = "id"  value = "<%= id %>" readonly>
 </div>
 	
	
	
<%-- 	
<div class="form-group">
    <label for="categoryNum">Enter Book Category</label>
    <input type="text" class="form-control" id="categoryNum"  placeholder="Enter the Category" name = "categoryNum" value = "<%= categoryNum %>">
 </div> --%>
 
 <div class="form-group">
   
  <label for="type">Enter Periodical Type</label>
	<select name="type" class="form-control"  value = "<%= type %>" required>
	 <option value = "<%= type %>" disabled selected hidden><%= type %></option>
    	 <option>Newspaper</option>
    	 <option>Magazine</option>    
</select>



 </div>
 
 <div class="form-group">
    <label for="name">Periodical Name</label>
    <input type="text" class="form-control" id="name"  placeholder="Enter the Book name" name = "name" value = "<%= name %>">
 </div>
 
  <div class="form-group">
    <label for="publication">Enter Publication Name</label>
    <input type="text" class="form-control" id="publication"  placeholder="Enter the publication" name = "publication" value = "<%= publication %>">
 </div>
 
  <div class="form-group">
    <label for="edition">Book Edition</label>
    <input type="text" class="form-control" id="edition"  placeholder="Enter book edition" name = "edition" value = "<%= edition %>">
 </div>
 

 
 
 <div class="form-group">
 	<div class = "row">
 		<div class = "col-md-6">
 			 <label for="price">Enter Book Price</label>
  			  <input type="text" class="form-control" id="price"  placeholder="Enter book price" name = "price" value = "<%= price %>">
 		</div>
 		<div class = "col-md-6">
 			    <label for="year">Published date</label>
    			<input type="date" class="form-control" id="year"  placeholder="Enter published year" name = "year" value = "<%= year %>">
 		</div>
 	</div>
 </div>



  
<!--    <label >Upload Book Cover Photo</label>	  -->
<!-- 					<input type="file" name="filename" value="filename" required><br/><br/>   -->
						
<%-- 						<center><input type="submit" id="btnregister"  value="submit"></center> --%>
 	
	
	
	
	
	
	
	
	
 	
	
<div class = "form-row">
    <div class="form-group col-md-8">
            
  <style type="text/css">
    /*
*
* ==========================================
* CUSTOM UTIL CLASSES
* ==========================================
*
*/
#upload {
    opacity: 0;
}

#upload-label {
    position: absolute;
    top: 50%;
    left: 1rem;
    transform: translateY(-50%);
}

.image-area {
    border: 2px dashed rgba(255, 255, 255, 0.7);
    padding: 1rem;
    position: relative;
}

.image-area::before {
    content: 'Uploaded image result';
    color: #fff;
    font-weight: bold;
    text-transform: uppercase;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    font-size: 0.8rem;
    z-index: 1;
}

.image-area img {
    z-index: 2;
    position: relative;
}



/*
</style>
<script type="text/javascript">

</script>

 <label for="validationDefault03">Choose a book image</label>
            Upload image input
            <div class="input-group rounded bg-white shadow-sm">
               id="upload"

                <label id="upload-label" for="upload" class="font-weight-light text-muted" ></label> 
                <input  id="upload" type="file" onchange="readURL(this);" class="form-control border-0" name="filename" value="filename" >
                




  <label id="upload-label" for="upload" class="font-weight-light text-muted" >Browse</label> 
   <input  id="upload" type="file" onchange="loadFile(event)" class="form-control border-0" class="form-control" name="filename" value="filename" >




                <div class="input-group-append">
                    <label for="upload" class="btn btn-light m-0 rounded-pill px-4"> <i class="fas fa-upload mr-2 text-muted"></i><small class="text-uppercase font-weight-bold text-muted"></small></label>
                </div>
            </div>

<!--             Uploaded image area -->
            <p class="font-italic text-white text-center">The image uploaded will be rendered inside the box below.</p>
            <div class="image-area mt-4"><img id="imageResult" src="images/<%= filename %>" value = "<%= filename %>" alt="" class="img-fluid rounded shadow-sm mx-auto d-block"></div>
 
	


	
	
	
  </div>
<div class="form-group col-md-4">  </div></div>
			
		
<button type="submit" name ="update" value = "Update profile" class="btn btn-success btn-block btn-sm">Update Periodical Details</button>

	</form>
				
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
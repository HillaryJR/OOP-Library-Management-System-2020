<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
	    <meta charset="ISO-8859-1">
	    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	    <link rel = "stylesheet" href ="css/Header1.css" >
		<link rel = "stylesheet"  href = "css/payment.css">
		<link href="css/Footer1.css" rel="stylesheet" type="text/css" media="all">
		
		<title>PaymentForm</title>
	</head>
	
	<header>
		<%@include file="/Header1.jsp" %>
	</header>
	
	<body>
		
		<br><br><br><br><br><br><br>
		<c:forEach var="payment" items="${paymentDetail}">
		
		
						<c:set var="type" value="${payment.type}"/>
						<c:set var="name" value="${payment.name}"/>
						<c:set var="cardNo" value="${payment.cardNo}"/>
						<c:set var="expMonth" value="${payment.expMonth}"/>
						<c:set var="expYear" value="${payment.expYear}"/>
						<c:set var="cvv" value="${payment.cvv}"/>
						<c:set var="payName" value="${payment.payName}"/>
							
			<div id = "extra">	
				<div class = "fixedcontainer" id = "cash">
					
					<form name = "paymentform" method = "post" action = "updatepayment" onsubmit = "return validation()">
		
						<h3>SELECT TYPE OF PAYEMNT</h3>			
					
						<label>Name of CardHolder </label><br /><br />
						<input type = "text" name = "name" value="${payment.name}" ><br /><br />
		
						<label>Card number</label><br /><br />
						<input type = "text" name = "Cnumber" value="${payment.cardNo}" onblur = "creditcolour()"><br /><br />
		
		
						<label >Exp Month</label><br /><br />
						<input type="text"  name="expmonth" value="${payment.expMonth}"><br /><br />
									 
						<label >Exp Year</label><br /><br />
						<input type="text"  name="expyear" value="${payment.expYear}"><br /><br />
		
						<label>CVV</label><br /><br />
						<input type = "text" name = "cvv" value="${payment.cvv}"><br /><br />
						
						<label>Payment Name</label><br /><br />
						<input type = "text" name = "payName" value="${payment.payName}" readonly><br /><br />
				
					</c:forEach>			
				
					<input type = "submit" name = "Submit" value = "update" id = "btn" onclick = "submitBothNValidate()" >
				
				</form>
			
			</div>
		</div>	
	</body>
	
	<footer>
		<br><br><br><br><br><br>
	        <div class="pageFooter">
	            <div class="underLocate">
	                <h6>Locater</h6>
	                	<img src="img/locate1.png">
	               		 <address>
	                   		 The Columbus Library,<br><br>
	                   		 No-10, Aruppola Road,<br><br>
	                    	 Kandy.<br><br>
	                    	 Zip-Code : 14002.
	                	</address>
	                		<ul>
	                   		 <li><span class="fa fa-phone"></span>Phone-Number +94 (081) 222 6622.</li><br>
	                    	 <li><span class="fa fa-envelope-o"></span>Email - support@Columbus.com </li>
	               		    </ul>
	            </div>
	            
	            <div class="underPanel">
	                <h6>Quick Links...</h6>
	                	<ul>
		                    <li><a href="#">Home</a></li><br>
		                    <li><a href="#">Categories</a></li><br>
		                    <li><a href="#">Periodicals</a></li><br>
		                    <li><a href="#">Contact Us</a></li><br>
		                    <li><a href="#">Cart</a></li><br>
	                	</ul>
	            </div>
	            
	            <div class="underAbout">
	              <h6>About Us</h6>
	                <p><i>The Columbus Library, which was established in 02.06.2016 serves as a main library in the Kandy City.We provide a wide range of materials, programs, and 
	                services to our beloved customers to enhance their reading habits. 
	                We are a member of the Srilankan Library Association & our Columbus Library has been recognized as one of the top 5 online library service provider in Sri Lanka.</i> </p>   
	            </div>
	            
	            <div class="underOH">
	              <h6>Vist-Us In Our Opening Hours!</h6><br>
	               <img src="img/clockbig.png">
	                 <p><i>Monday - Friday : 9am - 7pm.<br><br>
	                 		Saturday : 9am - 5pm.<br><br>
	                 		Sunday : 10am - 3pm.<br><br>
	                 		Note : We are closed on Poya Day's and all other public holidays. </i> </p>
	         	</div>
	            
	        </div>
        </footer>

</html>
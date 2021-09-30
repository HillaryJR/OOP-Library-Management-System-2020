<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/Header1.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Cart</title>
		<link rel = "stylesheet" type = "text/css" href = "css/cart.css" />
		<!-- <script src = "JS/cart.js" async></script>-->
	</head>
	
	<body>
		<br><br><br><br>
	
		<section class="container content-section">
		<center>
            <h2 class="section-header">CART</h2>
 		</center>
            <div class="cart-row">
                <span class="cart-item cart-header cart-column">ITEM</span>
                <span class="cart-price cart-header cart-column">PRICE</span>
                <span class="cart-quantity cart-header cart-column">REMOVE</span>
            </div>
			
				<% float total = 0; %>
				<c:forEach var="shop" items="${cartDetails}">	
					<c:set var="itemname" value="${shop.itemname}"/>
					<div class="cart-row">
						<div class = "cart-item cart-column">
							<span class ="cart-item-title">${shop.itemname}</span>
						</div>
						<span class ="cart-price cart-column">350.00</span>
						<%total = total + 350; %>
						<div class = "cart-quantity cart-column">
							<a href="cartDeleteServlet?BookName=${shop.itemname}">
								<button class = "btn btn-danger" type = "button">Remove</button>
							</a>
						</div> 
					</div>
				</c:forEach>
			
			<br><br><br>
			<div class="cart-row">
				<div class="cart-item cart-column">
					<div class = "cart-total-title">Total</div>
				</div>
				<div class="cart-item cart-column">
					<strong><span class = "cart-total-title"> RS <% out.println(total); %> </span></strong>
				</div>
			</div>
		
			<br><br>
			<center>
				<a href="cartDeleteAllServlet?">
					<button class = "btn-sc">Pre-Order</button>
				</a>
			</center>

		</section>	
		
	</body>
	
	<footer>
				<%@include file="/Footer1.jsp" %>
	</footer>
	
</html>
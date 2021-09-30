<%@include file="/Header1.jsp" %>
<html>
	<head>
		<title>FAQs-Page</title>
		<meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<link rel = "stylesheet" type = "text/css" href = "my.css" />
		<script src="Home.js"></script>
	</head>
	
	<body><br><br><br><br>
	<div class="faq">
		<img src="img/faq.jpg" style="width:100%" height="700">
	</div>
	<center>	
				<h1 style="color:#fa6102;font-size:40px;">FAQS-regarding our Columbus Library!</h1>
				
				<button type="button" class="Faq" >(1). Is the library open everyday?</button>
				<div class="content">
				<p>Yes.Our Columbus Library is open on every weekdays as well as on the weekends too.You can check the opening hours at the bottom of our page.We are closed on public holidays.</p>
				</div>
				
				<button type="button" class="Faq">(2). How do I let the Library know I have moved or changed my phone number?</button>
				<div class="content">
				<p>Please visit to your profile account page and update your details.</p>
				</div>
				
				<button type="button" class="Faq">(3). Can i return the items, that i purchased? </button>
				<div class="content">
				<p>Obviously yes, but you need to return it within 3days after you purchased it.</p>
				</div>
				
				<button type="button" class="Faq">(4). How many items, can i order within a day? </button>
				<div class="content">
				<p>There are not, any limits for that.But, note that you need to collect the ordered items within 7 days of your order.If not the order will be cancelled.</p>
				</div>
			
				<button type="button" class="Faq">(5). Do you provide offers or loyalty schemes? </button>
				<div class="content">
				<p>If you are a regular online customer, you will be receiving many offers as well aas super discounts for your purchase.</p>
				</div>
				
				<button type="button" class="Faq">(6). Can i book newspapers daily? </button>
				<div class="content">
				<p>No.We sell newspapers on weekly basis.You can book your favourite newspaper on any day.But you can collect it on Sunday's only.</p>
				</div>
				
				<button type="button" class="Faq">(7). How do i get notifications about my library account?</button>
				<div class="content">
				<p>The library will notify you about your account in one of three ways:<br> by phone, by email, or by mail. You may specify which method to use in your account.</p>
				</div>
				
				<button type="button" class="Faq">(8). Can my firend/child/spouse/parent use my library account?</button>
				<div class="content">
				<p>Unfortunately not.If your friend/child/spouse/parent would like to book items from our website, they should sign up for their own account.</p>
				</div>
				
				<button type="button" class="Faq">(9). Why are some books not available?</button>
				<div class="content">
				<p>Some books are unfortunately not offered from are library.We import restricted amount of books.But if there are any particular book/newspaper/magazines, you want to get from us,then ,
				please visit are library,and please fill our customer suggesion form.We will get that item for you, as soon as possible.</p>
				</div>
				
				<button type="button" class="Faq">(10). If i purchase the same item more than once in he same order,will i get any discounts paid for it?</button>
				<div class="content">
				<p>If your quantity is 5 or more than that, then you will be getting an 10% off from your final bill.</p>
				</div>
				
			</center><br><br><br><br><br>
				
			<script>
				var coll = document.getElementsByClassName("Faq");
				var i;

				for(i=0 ; i < coll.length;i++)
				{
					coll[i].addEventListener("click",function(){
						this.classList.toggle("active");
						var content = this.nextElementSibling;
						if(content.style.display==="block"){
							content.style.display="none";
						}else{
							content.style.display="block";
						}
						});
				}	

			</script>



















	</body>
		<%@include file="/Footer1.jsp" %>
</html>
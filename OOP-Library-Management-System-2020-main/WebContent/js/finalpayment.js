function checkboxValidation() {
    var newAdDiv = document.getElementById("newAdDiv");
    
    
	if (newAdDiv.style.display === "block")
	{

		newAdDiv.style.display = "none" ;

	}

	else
	{

		newAdDiv.style.display = "block" ;

	}
}

/* place order button validation*/
//enabling a button only after checkbox is checked
//check terms and conditions and then place order

function goFurther(){
if (document.getElementById("chkAgree").checked == true)
document.getElementById("btnSubmit").disabled = false;
else
document.getElementById("btnSubmit").disabled = true;
}


/*payment form validation*/

function validation()
{
	var Name = document.forms["paymentform"]["name"];	
	var Num =  document.forms["paymentform"]["Cnumber"];
	var month = document.forms["paymentform"]["expmonth"];
	var year = document.forms["paymentform"]["expyear"];
	var cvvno =  document.forms["paymentform"]["cvv"];
	
	
	if (Name.value == "")	
		{ 
		window.alert("Please enter the Card Holder Name."); 
		name.focus(); 
		return false; 
		} 
		
	var letters = /^[A-Za-z]+$/;

	if(!Name.value.match(letters))
	{
		alert('Please input valid Card Holder Name');
		name.focus();
		return false;
	}
		
		
	
	if (Num.value == "")	
		{ 
		window.alert("Please enter your Card Number."); 
		number.focus(); 
		return false; 
		} 
		
	var numbers = /^[0-9]+$/;

	if(!Num.value.match(numbers))
	{
		window.alert('Enter Valid Credit/Debit Card Number');
		number.focus();
		return false;
	}
		
	if (month.value == "")	
		{ 
		window.alert("Please enter expiry Month."); 
		expmonth.focus(); 
		return false; 
		} 
		
		var numbers = /^[0-9]+$/;

	if(!month.value.match(numbers))
	{
		window.alert('Enter Valid Expiry Month');
		expmonth.focus();
		return false;
	}
	
	if (year.value == "")	
		{ 
		window.alert("Please enter expiry Year."); 
		expyear.focus(); 
		return false; 
		} 
		
		var numbers = /^[0-9]+$/;

	if(!year.value.match(numbers))
	{
		window.alert('Enter Valid Expiry Year');
		expyear.focus();
		return false;
	}
	
	
	if (cvvno.value == "")	
		{ 
		window.alert("Please enter the CVV number."); 
		cvv.focus(); 
		return false; 
		}

		var numbers = /^[0-9]+$/;

	if(!cvvno.value.match(numbers))
	{
		window.alert('Enter Valid CVV / CID Code');
		cvv.focus();
		return false;
	}
	
	return true;
		
}




  
  /* Card color validation*/
  
  
  
  function creditcolour()
{
	var cardNumberJS = document.forms["paymentform"]["number"];	

	var visacardno = /^(?:4[0-9]{12}(?:[0-9]{3})?)$/;

	var mastercardno = /^(?:5[1-5][0-9]{14})$/;

	if(cardNumberJS.value.match(visacardno))
	{
		document.getElementById("visaicon").style.color = "navy";
		document.getElementById("mastericon").style.color = "black";	
	}

	else if(cardNumberJS.value.match(mastercardno))
	{
		document.getElementById("mastericon").style.color = "orangered";
		document.getElementById("visaicon").style.color = "black";
	}

	
	
	
}


function submitBothNValidate()
{
	document.forms["paymentform"].submit();
	document.forms["NewAddressForm"].submit();
}

 $(function(){
        $(".static_class").click(function(){
          if($(this).val() === "Yes")
            $("#extra").show("fast");
          else
            $("#extra").hide("fast");
        });
      });
   

	
      $(function(){
        $(".static_class").click(function(){
          if($(this).val() === "No")
            $("#confirmpay").show("fast");
          else
            $("#confirmpay").hide("fast");
        });
      });

















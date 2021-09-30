function validateRegisterForm() {
	var p = document.forms["register"]["passw"].value;
	var cp = document.forms["register"]["cpassw"].value;
	
		if(p != cp) {
			alert("Password Mis-Match!");
			window.location = 'login.jsp';
		}	
}

function myFunction() {
	  var x = document.getElementById("in2");
	  if (x.type === "password" ) {
	    x.type = "text";
	  } 
	  else {
	    x.type = "password";
	  } 
}	

function myFunction1() {
	  var x = document.getElementById("in3");
	  if (x.type === "password" ) {
	    x.type = "text";
	  } 
	  else {
	    x.type = "password";
	  } 
}

function myFunction2() {
	  var x = document.getElementById("nPass");
	  if (x.type === "password" ) {
	    x.type = "text";
	  } 
	  else {
	    x.type = "password";
	  } 
}

function myFunction3() {
	  var x = document.getElementById("cnPass");
	  if (x.type === "password" ) {
	    x.type = "text";
	  } 
	  else {
	    x.type = "password";
	  } 
}

function passwordMatch() {
	 var x = document.getElementById("nPass");
	 var y = document.getElementById("cnPass");
	 
	 if(x!=y){
		 alert("Password Mis-Match!");
		return false;
	 }
}


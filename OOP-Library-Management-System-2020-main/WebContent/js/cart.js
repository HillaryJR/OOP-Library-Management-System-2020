if(document.readyState == 'loading'){ 
    
    document.addEventListener('DOMContentLoaded', ready) 
    
}

else{
    ready()
}


function ready(){

    var removeCartItems = document.getElementsByClassName('btn-danger')
    console.log(removeCartItems)
    
    for (var i = 0 ; i < removeCartItems.length; i++ ){
    
    var button = removeCartItems[i]
    button.addEventListener('click' , removeCartItem) 
    }
    
    var addToCart = document.getElementsByClassName('C1IS1')
    
    for (var i = 0 ; i < addToCart.length; i++ ){
        
        var button = addToCart[i]
        button.addEventListener('click' , addToCartClicked)
    }
    
    
}

function removeCartItem(Event){
    var buttonClicked = Event.target
        buttonClicked.parentElement.parentElement.remove()
        
        updateCartTotal()
}

function updateCartTotal(){
    
    var cartItemContainer = document.getElementsByClassName('cart-items')[0]
    var cartRows = cartItemContainer.getElementsByClassName('cart-row')
    var total = 0;
    
    for (var i = 0 ; i < cartRows.length; i++ ){

        var cartRow = cartRows[i];
        var priceElemet = cartRow.getElementsByClassName('cart-price')[0];
        
        
        var price  = parseFloat(priceElemet.innerText.replace('Rs', ''));
        total = total + price;
    }
    
    document.getElementsByClassName('cart-total-price')[0].innerText = 'Rs ' + total
    
}

function addToCartClicked(Event){
    var button = Event.target
    var cartItem = button.parentElement
    var title = cartItem.getElementsByClassName('book-title')[0].innerText
    var price = cartItem.getElementsByClassName('book-price')[0].innerText.replace("Rs" , "")   
    console.log(title , price)

    addItemToCart(title , price)
    updateCartTotal()
}

function addItemToCart(title , price){
    
    var cartRow = document.createElement('div')
    cartRow.classList.add('cart-row')
    var cartItems = document.getElementsByClassName('cart-items')[0]
    
    var cartItemNames = cartItems.getElementsByClassName('cart-item-title')
    
    for(var i = 0 ; i < cartItemNames.length ; i++ ){
        if(cartItemNames[i].innerText == title){
            alert('This Item is already added to the cart')
            return
        }    
    }
    
    
    var cartRowContents = `
	                <div class = "cart-item cart-column">
						<span class ="cart-item-title">${title}</span>
					</div>
					<span class ="cart-price cart-column">${price}</span>
					<div class = "cart-quantity cart-column">
						<button class = "btn btn-danger" type = "button">Remove</button>
					</div> `								
                
    cartRow.innerHTML = cartRowContents
    cartItems.append(cartRow)
    
    cartRow.getElementsByClassName('btn-danger')[0].addEventListener('click' ,removeCartItem)
    
    document.getElementsByClassName('btn-purchase')[0].addEventListener('click', purchaseClicked)
}

function purchaseClicked(){
    
    alert('Pre-Order initiated')
    
    var cartItems = document.getElementsByClassName('cart-items')[0]
    
    while(cartItems.hasChildNodes()){
        cartItems.removeChild(cartItems.firstChild)
    }    
    updateCartTotal();
}


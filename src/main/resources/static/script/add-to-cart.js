if(document.readyState === "loading") {
    document.addEventListener("DOMContentLoaded", addButtonListener)
} else {
    addButtonListener()
}

function addButtonListener() {
    let buttons = document.getElementsByClassName("add-button")
    for(let i=0; i<buttons.length; i++) {
        let button = buttons[i]
        button.addEventListener("click", addToCart)
    }
}

function addToCart(event) {
    let dishHtml = event.target.parentElement
    let dish = {
        "id" : dishHtml.dataset.dishId,
        "name" : dishHtml.getElementsByClassName("dish-name")[0].textContent,
        "description" : dishHtml.getElementsByClassName("dish-des")[0].textContent
    }
    let cart = localStorage.getItem("cart")
    if (cart == null){
        cart = []
    } else {
        cart = JSON.parse(cart)
    }
    if(!cart.some(item => item.id === dish.id)) {
        cart.push(dish)
    }
    localStorage.setItem("cart", JSON.stringify(cart))
}
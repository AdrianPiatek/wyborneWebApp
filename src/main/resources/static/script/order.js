if(document.readyState === "loading") {
    document.addEventListener("DOMContentLoaded", generate)
} else {
    generate()
}

function generate() {
    let cart = document.getElementsByClassName("cart")[0]
    let items = localStorage.getItem("cart")
    if(items == null) {
        items = []
    } else {
        items = JSON.parse(items)
    }
    let sum = 0
    for(let i=0; i<items.length; i++) {
        sum += items[i].price
        let cartItem = document.createElement("div")
        cartItem.dataset.dishId = items[i].id
        cartItem.innerHTML = `
            <div class="card mb-2" style="width: 25rem;">
                <div class="card-body">
                    <h5 class="card-title">${items[i].name}</h5>
                    <p class="card-text">${items[i].description}</p>
                    <p class="card-text">${items[i].price + 'zł'}</p>
                </div>
            </div>`
        cart.append(cartItem)
    }

    let price = document.getElementById("price")
    price.innerText = 'Price: ' + sum + 'zł'
}

function sendOrder() {
    let cart = localStorage.getItem("cart")

    if(cart == null) {
        cart = []
    } else {
        cart = JSON.parse(cart)
    }

    let xhr = new XMLHttpRequest()
    xhr.open("POST", "order")
    xhr.setRequestHeader("Accept", "application/json");
    xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8")
    let id = cart.map(x => {return x.id})
    let name = document.getElementById("name").value
    let email = document.getElementById("email").value

    let order = {
        "dishes" : id,
        "name" : name,
        "email" : email
    }

    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4) {
            localStorage.removeItem("cart")
            location.href = "home"
        }};
    if(cart.length === 0){
        alert("Cart is empty")
    } else if (name === null || email === null) {
        alert("complete the form")
    }  else {
        xhr.send(JSON.stringify(order))
    }
}

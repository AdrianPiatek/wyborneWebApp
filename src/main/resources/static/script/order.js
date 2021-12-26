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
    for(let i=0; i<items.length; i++) {
        let cartItem = document.createElement("div")
        cartItem.dataset.dishId = items[i].id
        cartItem.innerHTML = `
            <div class="card mb-2" style="width: 25rem;">
                <div class="card-body">
                    <h5 class="card-title">${items[i].name}</h5>
                    <p class="card-text">${items[i].description}</p>
                </div>
            </div>`
        cart.append(cartItem)
    }
}

function sendOrder() {
    let cart = JSON.parse(localStorage.getItem("cart"))
    let form = document.getElementById("cartForm")
    let xhr = new XMLHttpRequest()
    xhr.open("GET", "restaurants")
    xhr.setRequestHeader("Accept", "application/json");
    let id = cart.map(x => {return x.id})
    let order = {
        "dishes" : id,
        "name" : "yes",
        "email" : "test"
    }
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4) {
            console.log(order)
            //location.href = "home"
        }};

    xhr.send(null)
}

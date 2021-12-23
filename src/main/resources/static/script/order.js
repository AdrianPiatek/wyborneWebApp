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
            <div>${items[i].name}</div>
            <div>${items[i].description}</div>`
        cart.append(cartItem)
    }

}
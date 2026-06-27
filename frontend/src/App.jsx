import { useEffect, useState } from "react";

function App() {

const [foods,setFoods]=useState([]);

const [cart,setCart]=useState([]);

useEffect(()=>{

fetch(
"http://localhost:8080/api/foods"
)

.then(
res=>res.json()
)

.then(
data=>
setFoods(data)
);

},[]);

function addToCart(food){

setCart([

...cart,

food

]);

}

function placeOrder(){

if(
cart.length===0
){

alert(
"Cart is empty"
);

return;

}

alert(
"Order Placed ✅");

setCart([]);

}

const total=

cart.reduce(

(sum,item)=>

sum+
item.price,

0

);

return(

<div

style={{

padding:"30px",

maxWidth:"700px",

margin:"auto",

fontFamily:
"Arial"

}}

>

<h1>

🍔 Food Delivery App

</h1>

<h2>

Cart:
{cart.length}

</h2>

<h2>

Total:
₹{total}

</h2>

<button

onClick=
{placeOrder}

style={{

padding:"10px",

marginBottom:
"20px"

}}

>

Place Order

</button>

<hr/>

{

foods.map(

food=>(

<div

key=
{food.id}

style={{

padding:"20px",

marginBottom:
"15px",

borderRadius:
"12px",

boxShadow:

"0 0 10px rgba(0,0,0,0.1)"

}}

>

<h2>

{food.name}

</h2>

<p>

Category:
{food.category}

</p>

<p>

₹
{food.price}

</p>

<button

onClick={()=>

addToCart(
food
)

}

>

Add To Cart

</button>

</div>

)

)

}

</div>

);

}

export default App;
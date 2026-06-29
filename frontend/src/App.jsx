import { useEffect, useState } from "react";

function App(){

const [foods,setFoods]=useState([]);
const [cart,setCart]=useState([]);
const [ordered,setOrdered]=useState(false);

useEffect(()=>{

fetch(
"https://graceful-wisdom-production.up.railway.app/api/foods"
)

.then(res=>res.json())

.then(data=>setFoods(data));

},[]);

function addToCart(food){

setCart([...cart,food]);

setOrdered(false);

}

function placeOrder(){

if(cart.length===0){

return;

}

alert("Order placed successfully 🎉");

setCart([]);

setOrdered(true);

}

const total=

cart.reduce(
(sum,item)=>
sum+item.price,
0
);

return(

<div style={{padding:"30px"}}>

<h1>
Food Delivery App 🍔
</h1>

<h2>
Cart: {cart.length}
</h2>

<h2>
Total: ₹{total}
</h2>

{

cart.length>0&&(

<button

onClick={placeOrder}

style={{
padding:"12px",
fontSize:"18px",
cursor:"pointer"
}}

>

Place Order

</button>

)

}

{

ordered&&(

<h2>

Order Completed ✅

</h2>

)

}

<br/>
<br/>

<div

style={{

display:"flex",

flexWrap:"wrap",

gap:"20px"

}}

>

{

foods.map((food)=>(

<div

key={food.id}

style={{

width:"320px",

padding:"15px",

border:"1px solid lightgray",

borderRadius:"15px"

}}

>

<img

src={
food.imageUrl||
"https://placehold.co/400x250"
}

alt={food.name}

style={{

width:"100%",

height:"220px",

objectFit:"cover",

borderRadius:"10px"

}}

/>

<h2>
{food.name}
</h2>

<p>
Category:
{food.category}
</p>

<h3>
₹{food.price}
</h3>

<button

onClick={
()=>addToCart(food)
}

>

Add To Cart

</button>

</div>

))

}

</div>

</div>

);

}

export default App;

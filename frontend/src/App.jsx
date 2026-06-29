import { useEffect, useState } from "react";

function App() {

const [foods,setFoods]=useState([]);

useEffect(()=>{

fetch(
"https://graceful-wisdom-production.up.railway.app/api/foods"
)

.then(
(res)=>res.json()
)

.then(
(data)=>setFoods(data)
)

.catch(
(err)=>console.log(err)
);

},[]);

return (

<div
style={{
padding:"30px"
}}
>

<h1>
Food Delivery App 🍔
</h1>

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

border:"1px solid #ddd",

borderRadius:"15px",

boxShadow:"0 2px 10px rgba(0,0,0,0.1)"

}}

>

<img

src={food.imageUrl}

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
Category: {food.category}
</p>

<h3>
₹{food.price}
</h3>

<button>

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
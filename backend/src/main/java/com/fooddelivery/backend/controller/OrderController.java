package com.fooddelivery.backend.controller;

import com.fooddelivery.backend.model.Food;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:5173")

public class OrderController {

@PostMapping("/api/orders")

public String placeOrder(

@RequestBody
List<Food> cart

){

return
"Order placed successfully 🚀";

}

}
package com.fooddelivery.backend.controller;

import com.fooddelivery.backend.model.Food;

import com.fooddelivery.backend.repository.FoodRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin(
origins=
"http://localhost:5173"
)

public class FoodController {

private final
FoodRepository
foodRepository;

public FoodController(
FoodRepository
foodRepository
){

this.foodRepository=
foodRepository;

}

@GetMapping(
"/api/foods"
)

public List<Food>
getFoods(){

return
foodRepository.findAll();

}

@PostMapping(
"/api/foods"
)

public Food
addFood(

@RequestBody
Food food

){

return
foodRepository.save(
food
);

}

}
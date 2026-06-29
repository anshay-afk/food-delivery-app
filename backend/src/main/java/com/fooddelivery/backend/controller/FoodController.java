package com.fooddelivery.backend.controller;

import com.fooddelivery.backend.model.Food;
import com.fooddelivery.backend.repository.FoodRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")

@CrossOrigin(
origins = "*"
)

public class FoodController {

@Autowired
private FoodRepository foodRepository;

@GetMapping
public List<Food> getFoods(){

return foodRepository.findAll();

}

@GetMapping("/seed")
public String seedData(){

return "Seeding disabled";

}

@GetMapping("/reset")
public String resetFoods(){

return "Disabled";

}

}

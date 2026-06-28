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

@PostMapping("/seed")
public String seedData(){

foodRepository.save(
new Food(
null,
"Burger",
250.0,
"Fast Food"
)
);

foodRepository.save(
new Food(
null,
"Pizza",
450.0,
"Italian"
)
);

foodRepository.save(
new Food(
null,
"Momos",
120.0,
"Snacks"
)
);

return "Data Added";

}

}
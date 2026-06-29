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

foodRepository.deleteAll();

foodRepository.save(
new Food(
null,
"Burger",
250.0,
"Fast Food",
"https://images.pexels.com/photos/1639557/pexels-photo-1639557.jpeg"
));

foodRepository.save(
new Food(
null,
"Pizza",
450.0,
"Italian",
"https://images.pexels.com/photos/825661/pexels-photo-825661.jpeg"
));

foodRepository.save(
new Food(
null,
"Momos",
120.0,
"Snacks",
"https://images.unsplash.com/photo-1546833999-b9f581a1996d?q=80&w=1200&auto=format&fit=crop"
));

return "Reset Done";

}
}

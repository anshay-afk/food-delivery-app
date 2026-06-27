package com.fooddelivery.backend.repository;

import com.fooddelivery.backend.model.Food;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository
extends JpaRepository<
Food,
Long
>{

}
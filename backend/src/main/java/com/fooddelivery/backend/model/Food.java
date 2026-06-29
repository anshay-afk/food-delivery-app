package com.fooddelivery.backend.model;

import jakarta.persistence.*;

@Entity
public class Food {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;

private String name;

private Double price;

private String category;

private String imageUrl;

public Food(){

}

public Food(
Long id,
String name,
Double price,
String category,
String imageUrl
){

this.id=id;

this.name=name;

this.price=price;

this.category=category;

this.imageUrl=imageUrl;

}

public Long getId(){
return id;
}

public String getName(){
return name;
}

public Double getPrice(){
return price;
}

public String getCategory(){
return category;
}

public String getImageUrl(){
return imageUrl;
}

}
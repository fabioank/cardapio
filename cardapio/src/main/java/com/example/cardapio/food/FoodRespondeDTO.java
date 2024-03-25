package com.example.cardapio.food;

public record FoodRespondeDTO(Long id, String title, String image, float price) {

    public FoodRespondeDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}

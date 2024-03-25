package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "food")
@Entity(name = "food")
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private float price;

    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.title = data.title();
        this.price = data.price();
    }

}

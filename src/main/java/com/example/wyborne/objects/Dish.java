package com.example.wyborne.objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dish {

    @Id
    @SequenceGenerator(
            name = "dish_sequence",
            sequenceName = "dish_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "dish_sequence"
    )


    private Long id;
    private String name;
    private String description;


    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @JsonIgnore
    @ManyToOne
    Place place;
}

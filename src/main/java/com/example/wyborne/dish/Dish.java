package com.example.wyborne.dish;

import javax.persistence.*;

@Entity
@Table
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


    public Dish(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Dish() {

    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}

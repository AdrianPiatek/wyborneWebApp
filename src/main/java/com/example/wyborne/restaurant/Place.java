package com.example.wyborne.restaurant;

import javax.persistence.*;

@Entity
@Table
public class Place {

    @Id
    @SequenceGenerator(
        name = "place_sequence",
        sequenceName = "place_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "place_sequence"
    )


    private Long id;
    private String name;
    private String description;


    public Place(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public Place(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Place() {

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


    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

package com.example.wyborne.restaurant;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
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


    public Place(String name, String description) {
        this.name = name;
        this.description = description;
    }
}

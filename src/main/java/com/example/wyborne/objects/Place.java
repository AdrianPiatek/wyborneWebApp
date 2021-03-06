package com.example.wyborne.objects;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
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


    @OneToMany(mappedBy = "place",
               fetch = FetchType.LAZY)
    List<Dish> dishList;
}

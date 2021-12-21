package com.example.wyborne.objects;

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
}

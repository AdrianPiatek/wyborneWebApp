package com.example.wyborne.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {

    private List<String> listOfDishes;
    private String name;
    private String email;
}

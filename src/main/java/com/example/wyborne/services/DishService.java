package com.example.wyborne.services;

import com.example.wyborne.objects.Dish;
import com.example.wyborne.repositories.DishRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DishService {

    private final DishRepository dishRepository;

    public List<Dish> getDish() {
        return dishRepository.findAll();
    }

    public Dish getDishById(Long id) {
        return dishRepository.getById(id);
    }

    public void addDish(Dish dish) {
        dishRepository.save(dish);
    }
}
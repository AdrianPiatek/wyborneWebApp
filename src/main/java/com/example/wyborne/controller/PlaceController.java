package com.example.wyborne.controller;


import com.example.wyborne.restaurant.Place;
import com.example.wyborne.restaurant.PlaceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/restaurants")
@AllArgsConstructor
public class PlaceController {

    private final PlaceService placeService;

    @GetMapping
    public List<Place> getPlace() {
        return placeService.getPlace();
    }

    @PostMapping
    public void addPlace(@RequestBody @Validated Place place) {
        placeService.addPlace(place);
    }

}

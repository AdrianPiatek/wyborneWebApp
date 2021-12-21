package com.example.wyborne.controllers;


import com.example.wyborne.objects.Place;
import com.example.wyborne.services.PlaceService;
import lombok.AllArgsConstructor;
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

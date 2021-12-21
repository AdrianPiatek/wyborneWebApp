package com.example.wyborne.restaurant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/restaurants")
public class PlaceController {

    private final PlaceService placeService;

    @Autowired
    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping
    public List<Place> getPlace() {
        return placeService.getPlace();
    }

    @PostMapping
    public void addPlace(@RequestBody Place place) {
        placeService.addPlace(place);
    }
}

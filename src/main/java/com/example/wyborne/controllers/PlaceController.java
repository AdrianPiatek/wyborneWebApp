package com.example.wyborne.controllers;


import com.example.wyborne.objects.Place;
import com.example.wyborne.services.PlaceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> getPlace() {
        return new ResponseEntity<>(placeService.getPlace(), HttpStatus.OK);
    }

    @PostMapping
    public void addPlace(@RequestBody @Validated Place place) {
        placeService.addPlace(place);
    }

}

package com.example.wyborne.controllers;

import com.example.wyborne.objects.Place;
import com.example.wyborne.services.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@Controller
public class ViewController {
    PlaceService placeService;

    @Autowired
    public ViewController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping("/home")
    public String getHomeView(Model model) {
        List<Place> placeList = placeService.getPlace();
        model.addAttribute("placeList", placeList);
        return "home";
    }

    @GetMapping("/menu/{id}")
    public String getResMenu(Model model, @PathVariable("id") Long id) {
        Place place = placeService.getPlaceById(id);
        model.addAttribute("place", place);
        return "menu";
    }

    @GetMapping("/order")
    public String order() {
        return "cart";
    }
}

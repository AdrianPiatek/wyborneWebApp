package com.example.wyborne.controllers;

import com.example.wyborne.objects.Dish;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Controller
@AllArgsConstructor
public class RESTController {
    @PostMapping("/order")
    public void order(@RequestBody Map<String, String> map){
        System.out.println(map);
    }

}

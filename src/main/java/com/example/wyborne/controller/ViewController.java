package com.example.wyborne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/home")
    public String getHomeView(){
        return "home";
    }
}
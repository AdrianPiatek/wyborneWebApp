package com.example.wyborne.controllers;

import com.example.wyborne.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/order2")
    public void showAll(@RequestBody Map<String, ?> map) {

        orderService.showAll(map);
    }

    @PostMapping("/order")
    public void sendMail(@RequestBody Map<String, ?> map) {

        orderService.sendMail(map);
    }
}

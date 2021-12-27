package com.example.wyborne.controllers;

import com.example.wyborne.objects.Order;
import com.example.wyborne.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Controller
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/order")
    public void order(@RequestBody Order order) {
        orderService.showAll(order);
    }

}

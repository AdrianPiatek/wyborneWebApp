package com.example.wyborne.services;

import com.example.wyborne.objects.Order;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class OrderService {

    public void showAll(Order order) {
        System.out.println("\n\n\n");
        System.out.println(order.getName());
        System.out.println(order.getEmail());
        System.out.println("\n\n\n");


    }


}

package com.AIT.examen.Controllers;

import com.AIT.examen.Models.OrderModel;
import com.AIT.examen.Servicies.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/order")
    public OrderModel saveOrder(@RequestBody OrderModel order){
        return this.orderService.saveOrder(order);
    }

    @GetMapping(path= "/order/{id}")
    public Optional<OrderModel> getUserbyId(@PathVariable("id") Long id){
        return this.orderService.getById(id);
    }
}

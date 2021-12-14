package com.example.demo.controller.Hello;

import com.example.demo.services.IOrdersServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/get")
public class Controller {
    private IOrdersServices ordersServices;

    public Controller(IOrdersServices ordersServices) {
        this.ordersServices = ordersServices;
    }

    @GetMapping("/orders")
    public ResponseEntity helloWorld() {
        return new ResponseEntity<>(ordersServices.getAllOrders(), HttpStatus.OK);
    }


}

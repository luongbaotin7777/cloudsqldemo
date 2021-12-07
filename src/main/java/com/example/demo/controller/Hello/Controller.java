package com.example.demo.controller.Hello;

import com.example.demo.entity.OrdersEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.entity.PaymentReport;
import com.example.demo.repository.IOrdersRepository;
import com.example.demo.services.IOrdersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

@RestController
@RequestMapping(value = "/hello")
public class Controller {
    private IOrdersServices ordersServices;

    public Controller(IOrdersServices ordersServices) {
        this.ordersServices = ordersServices;
    }

    @GetMapping("/world")
    public ResponseEntity helloWorld() {
        return new ResponseEntity<>(ordersServices.getAllOrders(), HttpStatus.OK);
    }

    @Bean()
    public Function<String,List<OrdersEntity>> getOrders() {
        return (input) -> {
            List<OrdersEntity> ordersEntities = ordersServices.getAllOrders();
            return ordersEntities;
        };
    }

}

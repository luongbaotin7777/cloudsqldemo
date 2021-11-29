package com.example.demo.services;

import com.example.demo.entity.OrdersEntity;
import com.example.demo.repository.IOrdersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServices implements IOrdersServices {

    private final IOrdersRepository ordersRepository;

    public OrdersServices(IOrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public List<OrdersEntity> getAllOrders() {
        List<OrdersEntity> ordersEntities = ordersRepository.findAll();
        return ordersEntities;
    }
}

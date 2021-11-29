package com.example.demo.services;

import com.example.demo.entity.OrdersEntity;

import java.util.List;

public interface IOrdersServices {
    List<OrdersEntity> getAllOrders();
}

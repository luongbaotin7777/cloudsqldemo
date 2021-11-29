package com.example.demo.repository;

import com.example.demo.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrdersRepository extends JpaRepository<OrdersEntity, Long> {
}

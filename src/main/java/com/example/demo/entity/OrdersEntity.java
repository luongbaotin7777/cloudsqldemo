package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class OrdersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description")
    private String description;

    @Column(name = "create_at")
    private Date create_at;


    @OneToMany(mappedBy = "ordersEntity")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<OrderItemsEntity> orderItemsEntities;

}

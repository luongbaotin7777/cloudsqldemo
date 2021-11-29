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

    @Column(name = "creation_timestamp")
    private Date creation_timestamp;


    @OneToMany(mappedBy = "ordersEntity")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<OrderItemsEntity> orderItemsEntities;

}

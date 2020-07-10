package com.example.springboot1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter@Setter
public class Good {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    private String goodsName;//货物名称
    private Double goodsWeight;//货物重量
    private Integer goodsNumber;//货物数量
    @ManyToOne
    private Order order;
}

package com.example.springboot1.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Sender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @OneToMany(mappedBy = "sender")
    List<Order> orders;
}

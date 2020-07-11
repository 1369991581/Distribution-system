package com.example.springboot1.respons;


import com.example.springboot1.entity.OrderList;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends IBaseRepository<OrderList, Integer>{
}

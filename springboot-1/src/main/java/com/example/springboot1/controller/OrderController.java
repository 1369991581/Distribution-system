package com.example.springboot1.controller;

import com.example.springboot1.entity.OrderList;
import com.example.springboot1.respons.IOrderRepository;
import com.example.springboot1.tools.PostageCalculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping()
@Transactional
public class OrderController {
    @Autowired
    IOrderRepository iOrderRepository;
    @PostMapping("/createOrder")//创建订单
    public void createOrder(@RequestBody OrderList orderList){
        PostageCalculation.postageCalculation(orderList);
        iOrderRepository.save(orderList);
        iOrderRepository.refresh(orderList);
    }
    @GetMapping("/queryOrder/{orderNumber}")//查询订单
    public Map queryOrder(@PathVariable("orderNumber") Integer orderNumber){
        OrderList orderList = iOrderRepository.queryOrder(orderNumber);
        System.out.println(11);
        return Map.of("order",orderList);
    }
    @GetMapping("/updateOrder/{orderNumber}")//修改订单信息
    public void updateOrder(@PathVariable("orderNumber") Integer orderNumber){
        iOrderRepository.queryOrder(orderNumber);
    }
    @GetMapping("/deleteOrder/{orderNumber}")//删除订单信息
    public void deleteOrder(@PathVariable("orderNumber") Integer orderNumber){
        iOrderRepository.deleteOrder(orderNumber);
    }
}

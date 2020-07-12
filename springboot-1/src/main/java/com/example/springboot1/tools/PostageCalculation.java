package com.example.springboot1.tools;

import com.example.springboot1.entity.Good;
import com.example.springboot1.entity.OrderList;
import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;
import java.util.List;

public class PostageCalculation {
    /**
     *
     * @param orderList
     * 收费标准
     * 10kg内10RMB
     * 10kg外2RMB/kg
     */
    public static void postageCalculation(OrderList orderList){
        List<Good> good = orderList.getGoods();
        Iterator<Good> it = good.iterator();
        Double postage = 0.0;
        while(it.hasNext()){
            Good now = it.next();
            if(now.getGoodsWeight() <= 10)
                postage += 10;
            else
                postage += 10 + (now.getGoodsWeight()-10) * 2;
        }
        orderList.setCost(postage);
    }
}

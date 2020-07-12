package com.example.springboot1.respons;

import com.example.springboot1.entity.OrderList;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends IBaseRepository<OrderList, Integer>{
    @Query("select o from OrderList o where o.orderNumber=:orderNumber")//查订单
    OrderList queryOrder(@Param("orderNumber")Integer orderNumber);
    @Modifying
    @Query("delete from OrderList o where o.orderNumber=:orderNumber")
    void deleteOrder(@Param("orderNumber")Integer orderNumber);

    /***
     *
     * @param orderNumber
     * 这没完成
     * 修改订单信息功能
     */
    @Query("update OrderList o set o.station=:station where o.orderNumber=:ordetNumber")
    void updateOrder(@Param("orderNumber")Integer orderNumber);
}

package com.example.springboot1.respons;

import com.example.springboot1.entity.CourierStation;
import com.example.springboot1.entity.OrderList;
import com.example.springboot1.entity.Poster;
import com.example.springboot1.entity.Sender;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourierStationRepository extends IBaseRepository<CourierStation, Integer>{
    @Query("select o from OrderList o where o.orderNumber=:orderNumber")//查订单
    OrderList queryOrder(@Param("orderNumber")Integer orderNumber);
    @Modifying
    @Query("update OrderList o set o.station=:station where o.orderNumber=:orderNumber")//改当前地址
    void updateStation(@Param("station")String station,@Param("orderNumber")Integer orderNumber);
    @Query("update OrderList o set o.poster=:poster where o.orderNumber=:orderNumber")//改快递员信息
    void updateStation(@Param("poster")Poster poster, @Param("orderNumber")Integer orderNumber);

}

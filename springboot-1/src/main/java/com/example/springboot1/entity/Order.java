package com.example.springboot1.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer orderNumber;//单号
    private Double cost;//邮费
    private String remark;//备注
    private Integer score;//评分
    private String evaluation;//评价
    @OneToMany(mappedBy = "order")
    private List<Good> goods;//货物信息
    @ManyToOne
    private CourierStation station;//当前站
    @ManyToOne
    private Member member;//会员
    @ManyToOne
    private Sender sender;//分销商
    @ManyToOne
    private Poster poster;//快递员

}

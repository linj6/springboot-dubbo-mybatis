package com.lnjecit.api.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author lnj
 * createTime 2018-11-04 15:50
 **/
@Data
public class Order implements Serializable {

    // 订单id
    private Long id;

    // 订单编号
    private String code;

    // 买家用户id
    private Long userId;

    // 下单时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date orderTime;

    List<OrderItem> orderItemList;
}

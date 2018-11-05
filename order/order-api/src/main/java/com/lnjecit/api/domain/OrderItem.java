package com.lnjecit.api.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author lnj
 * createTime 2018-11-04 15:56
 **/
@Data
public class OrderItem implements Serializable {

    // 订单明细id
    private Long id;

    // 订单明细id
    private Long orderId;

    // 订单编号
    private String orderCode;

    // 商品id
    private Long goodsId;

    // 商品名称
    private String goodsName;

    // 商品数量
    private BigDecimal goodsNumber;

    // 商品价格
    private BigDecimal goodsPrice;

}

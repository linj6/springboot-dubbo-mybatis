package com.lnjecit.api.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单明细VO
 *
 * @author lnj
 * createTime 2018-11-04 19:39
 **/
@Data
public class OrderItemVO implements Serializable {
    // 商品id
    private Long goodsId;

    // 商品名称
    private String goodsName;

    // 商品数量
    private BigDecimal goodsNumber;

    // 商品价格
    private BigDecimal goodsPrice;
}

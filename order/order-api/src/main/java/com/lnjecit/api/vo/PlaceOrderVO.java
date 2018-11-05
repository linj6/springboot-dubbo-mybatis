package com.lnjecit.api.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 下单VO类
 *
 * @author lnj
 * createTime 2018-11-04 19:37
 **/
@Data
public class PlaceOrderVO implements Serializable {
    // 买家用户id
    private Long userId;

    // 订单明细列表
    private List<OrderItemVO> orderItemVOList;
}

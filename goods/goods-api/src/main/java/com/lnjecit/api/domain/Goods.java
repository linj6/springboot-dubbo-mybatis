package com.lnjecit.api.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品
 *
 * @author lnj
 * createTime 2018-11-02 14:16
 **/
@Data
public class Goods implements Serializable {

    private Long id;

    private String name;

    private BigDecimal unitPrice;

    private BigDecimal number;

    private Long createUserId;

    private Date createTime;

}

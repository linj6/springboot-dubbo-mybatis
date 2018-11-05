package com.lnjecit.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lnjecit.api.service.OrderService;
import com.lnjecit.api.vo.PlaceOrderVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lnj
 * createTime 2018-11-04 20:39
 **/
@RequestMapping("order")
@RestController
public class OrderController {

    @Reference
    private OrderService orderService;

    @PostMapping("placeOrder")
    public String placeOrder(@RequestBody PlaceOrderVO placeOrderVO) {
        int result = orderService.placeOrder(placeOrderVO);
        return result > 0 ? "下单成功" : "下单失败";
    }
}

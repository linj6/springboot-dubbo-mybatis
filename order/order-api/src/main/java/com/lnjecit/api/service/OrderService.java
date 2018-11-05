package com.lnjecit.api.service;

import com.lnjecit.api.domain.Order;
import com.lnjecit.api.vo.PlaceOrderVO;

import java.util.List;
import java.util.Map;

public interface OrderService {

    List<Order> query(Map<String, Object> params);

    int insert(Order order);

    int placeOrder(PlaceOrderVO placeOrderVO);
}

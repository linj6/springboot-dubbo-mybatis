package com.lnjecit.api.service;

import com.lnjecit.api.domain.OrderItem;

import java.util.List;
import java.util.Map;

public interface OrderItemService {

    List<OrderItem> query(Map<String, Object> params);
}

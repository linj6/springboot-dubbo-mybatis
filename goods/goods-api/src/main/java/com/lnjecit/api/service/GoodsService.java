package com.lnjecit.api.service;

import com.lnjecit.api.domain.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsService {

    List<Goods> query(Map<String, Object> params);
}

package com.lnjecit.dao;

import com.lnjecit.api.domain.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsDao {
    List<Goods> query(Map<String, Object> params);
}

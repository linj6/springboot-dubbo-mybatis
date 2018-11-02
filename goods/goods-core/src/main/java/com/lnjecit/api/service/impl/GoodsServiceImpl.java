package com.lnjecit.api.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lnjecit.api.domain.Goods;
import com.lnjecit.api.service.GoodsService;
import com.lnjecit.dao.GoodsDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @author lnj
 * createTime 2018-11-02 14:39
 **/
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Goods> query(Map<String, Object> params) {
        return goodsDao.query(params);
    }
}

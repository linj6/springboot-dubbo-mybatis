package com.lnjecit.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lnjecit.api.domain.Goods;
import com.lnjecit.api.service.GoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author lnj
 * createTime 2018-11-02 14:50
 **/
@RequestMapping("/goods")
@RestController
public class GoodsController {

    @Reference
    private GoodsService goodsService;

    @GetMapping("/list")
    public List<Goods> list(@RequestParam(required = false) Map<String, Object> params) {
        return goodsService.query(params);
    }
}

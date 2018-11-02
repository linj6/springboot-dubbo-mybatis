package com.lnjecit.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lnjecit.api.domain.User;
import com.lnjecit.api.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lnj
 * createTime 2018-11-01 15:42
 **/
@RequestMapping("/user")
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("/list")
    public List<User> list() {
        Map<String, Object> params = new HashMap<>();
        return userService.query(params);
    }
}

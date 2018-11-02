package com.lnjecit.api.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lnjecit.api.domain.User;
import com.lnjecit.api.service.UserService;
import com.lnjecit.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @author lnj
 * createTime 2018-11-01 14:12
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> query(Map<String, Object> params) {
        return userDao.query(params);
    }
}

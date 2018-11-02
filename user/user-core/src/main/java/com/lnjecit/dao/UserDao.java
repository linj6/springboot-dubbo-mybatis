package com.lnjecit.dao;

import com.lnjecit.api.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    List<User> query(Map<String, Object> params);
}

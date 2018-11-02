package com.lnjecit.api.service;

import com.lnjecit.api.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> query(Map<String, Object> params);
}

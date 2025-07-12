package com.user.service.service;

import com.user.service.entity.User;

public interface UserService {
    User register(User user);
    User login(String email, String password);
}

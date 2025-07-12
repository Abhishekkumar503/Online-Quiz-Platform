package com.user.service.service;

import org.springframework.stereotype.Service;

import com.user.service.entity.User;

@Service
public interface UserService {
	User register(User user);

	User login(String email, String password);
}

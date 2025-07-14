package com.user.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.entity.User;
import com.user.service.service.UserService;

import reponse.ApiResponse;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<ApiResponse<User>> register(@RequestBody User user) {
		User savedUser = userService.register(user);
		return ResponseEntity.ok(new ApiResponse<>(true, "User registered successfully", savedUser));
	}

	@PostMapping("/login")
	public ResponseEntity<ApiResponse<User>> login(@RequestParam String email, @RequestParam String password) {
		User loggedInUser = userService.login(email, password);
		return ResponseEntity.ok(new ApiResponse<>(true, "Login successful", loggedInUser));
	}
}

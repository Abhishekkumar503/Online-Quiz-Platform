package com.result.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.result.service.entity.Result;
import com.result.service.service.ResultService;

import reponse.ApiResponse;

@RestController
@RequestMapping("/result")
public class ResultController {

	@Autowired
	private ResultService resultService;

	@PostMapping
	public ResponseEntity<ApiResponse<Result>> saveResult(@RequestBody Result result) {
		Result savedResult = resultService.save(result);
		ApiResponse<Result> response = new ApiResponse<>(true, "Result saved successfully", savedResult);
		return ResponseEntity.ok(response);
	}

	@GetMapping("/user/{userId}")
	public ResponseEntity<ApiResponse<List<Result>>> getResultsByUserId(@PathVariable Long userId) {
		List<Result> results = resultService.getResultsByUserId(userId);
		ApiResponse<List<Result>> response = new ApiResponse<>(true, "Results fetched for user " + userId, results);
		return ResponseEntity.ok(response);
	}
}
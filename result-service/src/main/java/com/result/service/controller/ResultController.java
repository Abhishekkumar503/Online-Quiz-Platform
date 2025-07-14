package com.result.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.result.service.entity.Result;
import com.result.service.service.ResultService;

@RestController
@RequestMapping("/result")
public class ResultController {

	@Autowired
	private ResultService resultService;

	@PostMapping
	public Result saveResult(@RequestBody Result result) {
		return resultService.save(result);
	}

	@GetMapping("/user/{userId}")
	public List<Result> getResultsByUserId(@PathVariable Long userId) {
		return resultService.getResultsByUserId(userId);
	}
}
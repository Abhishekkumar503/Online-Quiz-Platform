package com.question.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.service.entity.Question;
import com.question.service.service.QuestionService;

import reponse.ApiResponse;

@RestController
@RequestMapping("question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@GetMapping
	public ResponseEntity<ApiResponse<List<Question>>> getAll() {
		List<Question> questions = questionService.getAllQuestions();
		ApiResponse<List<Question>> response = new ApiResponse<>(true, "Fetched all questions", questions);
		return ResponseEntity.ok(response);
	}

	@PostMapping
	public ResponseEntity<ApiResponse<Question>> create(@RequestBody Question question) {
		Question created = questionService.saveQuestion(question);
		ApiResponse<Question> response = new ApiResponse<>(true, "Question created successfully", created);
		return ResponseEntity.ok(response);
	}

}

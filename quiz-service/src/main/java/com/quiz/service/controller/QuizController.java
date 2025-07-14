package com.quiz.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.service.entity.Quiz;
import com.quiz.service.service.QuizService;

import reponse.ApiResponse;

@RestController
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private QuizService quizService;

	@PostMapping
	public ResponseEntity<ApiResponse<Quiz>> create(@RequestBody Quiz quiz) {
		Quiz createdQuiz = quizService.createQuiz(quiz);
		ApiResponse<Quiz> response = new ApiResponse<>(true, "Quiz created successfully", createdQuiz);
		return ResponseEntity.ok(response);
	}

	@GetMapping
	public ResponseEntity<ApiResponse<List<Quiz>>> getAll() {
		List<Quiz> quizzes = quizService.getAllQuizzes();
		ApiResponse<List<Quiz>> response = new ApiResponse<>(true, "Fetched all quizzes", quizzes);
		return ResponseEntity.ok(response);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ApiResponse<Quiz>> getById(@PathVariable Long id) {
		Quiz quiz = quizService.getQuizById(id);
		ApiResponse<Quiz> response = new ApiResponse<>(true, "Quiz fetched successfully", quiz);
		return ResponseEntity.ok(response);
	}
}

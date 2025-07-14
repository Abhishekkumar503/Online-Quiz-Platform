package com.quiz.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.service.entity.Quiz;
import com.quiz.service.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private QuizService quizService;

	@PostMapping
	public Quiz create(@RequestBody Quiz quiz) {
		return quizService.createQuiz(quiz);
	}

	@GetMapping
	public List<Quiz> getAll() {
		return quizService.getAllQuizzes();
	}

	@GetMapping("/{id}")
	public Quiz getById(@PathVariable Long id) {
		return quizService.getQuizById(id);
	}
}

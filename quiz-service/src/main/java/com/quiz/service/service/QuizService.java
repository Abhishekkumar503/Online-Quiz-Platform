package com.quiz.service.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import dto.question.QuestionWrapper;
import dto.result.Response;

@Service
public interface QuizService {

	public ResponseEntity<String> createQuiz(String category, int numQ, String title);

	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id);

	public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses);
}

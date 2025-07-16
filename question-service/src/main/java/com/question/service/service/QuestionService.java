package com.question.service.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.question.service.entity.Question;

import dto.question.QuestionWrapper;
import dto.result.Response;

@Service
public interface QuestionService {

	public ResponseEntity<List<Question>> getAllQuestions();

	public ResponseEntity<List<Question>> getQuestionsByCategory(String category);

	public ResponseEntity<String> addQuestion(Question question);

	public ResponseEntity<List<Integer>> getQuestionsForQuiz(String categoryName, Integer numQuestions);

	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionIds);

	public ResponseEntity<Integer> getScore(List<Response> responses);
}

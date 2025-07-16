package com.quiz.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.quiz.service.entity.Quiz;
import com.quiz.service.feign.QuestionClient;
import com.quiz.service.repository.QuizRepository;

import dto.question.QuestionWrapper;
import dto.result.Response;

@Component
public class QuizServiceImpl implements QuizService {

	@Autowired
	QuizRepository quizRepository;

	@Autowired
	QuestionClient questionClient;

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

		List<Integer> questions = questionClient.getQuestionsForQuiz(category, numQ).getBody();
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestionIds(questions);
		quizRepository.save(quiz);

		return new ResponseEntity<>("Success", HttpStatus.CREATED);

	}

	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
		Quiz quiz = quizRepository.findById(id).get();
		List<Integer> questionIds = quiz.getQuestionIds();
		ResponseEntity<List<QuestionWrapper>> questions = questionClient.getQuestionsFromId(questionIds);
		return questions;

	}

	public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
		ResponseEntity<Integer> score = questionClient.getScore(responses);
		return score;
	}

}

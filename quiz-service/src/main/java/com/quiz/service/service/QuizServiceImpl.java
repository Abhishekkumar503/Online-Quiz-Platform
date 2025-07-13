package com.quiz.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quiz.service.entity.Quiz;
import com.quiz.service.repository.QuizRepository;

@Component
public class QuizServiceImpl implements QuizService {

	@Autowired
	private QuizRepository quizRepository;

	@Override
	public Quiz createQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> getAllQuizzes() {
		// TODO Auto-generated method stub
		return quizRepository.findAll();
	}

	@Override
	public Quiz getQuizById(Long id) {
		// TODO Auto-generated method stub
		return quizRepository.findById(id).orElseThrow();
	}

}

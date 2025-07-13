package com.quiz.service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.service.entity.Quiz;

@Service
public interface QuizService {

	Quiz createQuiz(Quiz quiz);

	List<Quiz> getAllQuizzes();

	Quiz getQuizById(Long id);
}

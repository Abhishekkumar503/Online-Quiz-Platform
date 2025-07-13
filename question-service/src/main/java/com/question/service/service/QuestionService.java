package com.question.service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.service.entity.Question;

@Service
public interface QuestionService {

	List<Question> getAllQuestions();

	Question saveQuestion(Question question);
}

package com.question.service.repository;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface QuestionRepositoryCustom {

	List<Integer> findRandomQuestionsByCategory(String category, int limit);
}

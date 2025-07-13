package com.result.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.result.service.entity.Result;
import com.result.service.repository.ResultRepository;

@Service
public class ResultServiceImpl implements ResultService {

	@Autowired
	private ResultRepository resultRepository;

	@Override
	public Result save(Result result) {
		// TODO Auto-generated method stub
		return resultRepository.save(result);
	}

	@Override
	public List<Result> getResultsByUserId(Long userId) {
		// TODO Auto-generated method stub
		return resultRepository.findByUserId(userId);
	}

}

package com.result.service.service;

import java.util.List;

import com.result.service.entity.Result;

public interface ResultService {

	Result save(Result result);

	List<Result> getResultsByUserId(Long userId);
}

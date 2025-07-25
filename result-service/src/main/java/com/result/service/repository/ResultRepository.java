package com.result.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.result.service.entity.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {

	List<Result> findByUserId(Long userId);
}

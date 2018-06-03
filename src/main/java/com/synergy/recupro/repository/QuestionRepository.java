package com.synergy.recupro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synergy.recupro.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}

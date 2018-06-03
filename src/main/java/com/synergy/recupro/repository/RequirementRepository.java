package com.synergy.recupro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synergy.recupro.model.Accounts;
import com.synergy.recupro.model.Answer;
import com.synergy.recupro.model.Requirements;

@Repository
public interface RequirementRepository extends JpaRepository<Requirements, Long> {
	List<Requirements> findByAccountsId(Long account_id);
}

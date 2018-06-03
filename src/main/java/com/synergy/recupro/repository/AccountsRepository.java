package com.synergy.recupro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synergy.recupro.model.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
}

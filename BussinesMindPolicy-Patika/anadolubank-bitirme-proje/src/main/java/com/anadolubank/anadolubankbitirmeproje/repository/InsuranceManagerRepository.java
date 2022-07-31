package com.anadolubank.anadolubankbitirmeproje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anadolubank.anadolubankbitirmeproje.model.InsuranceManager;

@Repository
public interface InsuranceManagerRepository extends JpaRepository<InsuranceManager, Long> {
}

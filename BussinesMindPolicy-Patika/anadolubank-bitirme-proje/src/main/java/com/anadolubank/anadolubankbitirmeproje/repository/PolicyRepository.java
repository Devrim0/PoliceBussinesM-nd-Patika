package com.anadolubank.anadolubankbitirmeproje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anadolubank.anadolubankbitirmeproje.model.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {
}

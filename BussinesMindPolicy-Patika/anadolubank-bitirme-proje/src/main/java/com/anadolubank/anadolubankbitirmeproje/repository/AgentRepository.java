package com.anadolubank.anadolubankbitirmeproje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anadolubank.anadolubankbitirmeproje.model.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {
}

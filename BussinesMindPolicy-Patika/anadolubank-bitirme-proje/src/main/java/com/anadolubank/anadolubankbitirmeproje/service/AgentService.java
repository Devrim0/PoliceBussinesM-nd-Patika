package com.anadolubank.anadolubankbitirmeproje.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anadolubank.anadolubankbitirmeproje.model.Agent;
import com.anadolubank.anadolubankbitirmeproje.repository.AgentRepository;

import java.util.List;

@Service
public class AgentService {

    @Autowired
    private AgentRepository agentRepository;

    public List<Agent> findAll() {return this.agentRepository.findAll();}
}

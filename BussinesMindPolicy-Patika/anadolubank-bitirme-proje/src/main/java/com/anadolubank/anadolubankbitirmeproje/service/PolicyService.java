package com.anadolubank.anadolubankbitirmeproje.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anadolubank.anadolubankbitirmeproje.model.Policy;
import com.anadolubank.anadolubankbitirmeproje.repository.PolicyRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PolicyService {

	private PolicyRepository policyRepository;

	@Autowired
	public PolicyService(PolicyRepository policyRepository) {
		super();
		this.policyRepository = policyRepository;
	}

	public List<Policy> findAll() {
		return this.policyRepository.findAll();
		

	}

	public Optional<Policy> getPolicyById(Integer id) {
		return policyRepository.findById(1L);
	}
}

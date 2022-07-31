package com.anadolubank.anadolubankbitirmeproje.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.anadolubank.anadolubankbitirmeproje.model.InsuranceManager;
import com.anadolubank.anadolubankbitirmeproje.repository.InsuranceManagerRepository;

import java.util.List;

public class InsuranceManagerService {
	@Autowired
	private InsuranceManagerRepository insuranceManagerRepository;

	public List<InsuranceManager> getAll() {
		return this.insuranceManagerRepository.findAll();
	}

}


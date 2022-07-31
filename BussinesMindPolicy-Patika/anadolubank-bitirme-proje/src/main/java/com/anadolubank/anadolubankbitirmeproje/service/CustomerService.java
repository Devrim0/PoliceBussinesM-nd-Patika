package com.anadolubank.anadolubankbitirmeproje.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.anadolubank.anadolubankbitirmeproje.model.Customer;
import com.anadolubank.anadolubankbitirmeproje.repository.CustomerRepository;

import java.util.List;

public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> findAll() {
		return this.customerRepository.findAll();
	}
}

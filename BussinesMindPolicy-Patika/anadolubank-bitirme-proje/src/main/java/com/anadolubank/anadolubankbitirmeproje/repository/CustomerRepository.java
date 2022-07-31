package com.anadolubank.anadolubankbitirmeproje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anadolubank.anadolubankbitirmeproje.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

package com.tempProjectBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tempProjectBackend.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
		
}

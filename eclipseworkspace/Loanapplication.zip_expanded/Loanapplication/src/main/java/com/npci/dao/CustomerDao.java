package com.npci.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.npci.beans.Customer;

public interface CustomerDao extends JpaRepository<CreditScore, Integer>  {
	@Query("select c from Customer c where c.emailId = ?1")
	public Customer getcustomer(String emailId);
	Customer save(Customer customer);
}



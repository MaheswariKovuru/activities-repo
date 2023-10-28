package com.npci.service;


import com.npci.beans.Loan;
import com.npci.exceptions.CustomerNotFoundException;


public interface LoanService {
	

	public Loan getLoan(String email_id);
	public Loan login(String email_id, String password) throws CustomerNotFoundException;
	
	
}

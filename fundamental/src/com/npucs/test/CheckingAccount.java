package com.npucs.test;

import com.npucs.java.AbsAccounts;

public class CheckingAccount extends AbsAccounts {

	public CheckingAccount(double id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public double getMonthlyInterestRate() {
		
			return (AnnualInterestRate/12);
		}
		  
		
	 }	



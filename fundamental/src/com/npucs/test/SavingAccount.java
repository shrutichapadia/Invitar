package com.npucs.test;

import com.npucs.java.AbsAccounts;

public class SavingAccount extends AbsAccounts {
	
	public SavingAccount(int Annualint) {
		super(Annualint);
		// TODO Auto-generated constructor stub
	}

	

	public double getMonthlyInterestRate() {
		
			return (AnnualInterestRate/12);
		} 

		}
		 
		 
package com.npucs.java;

import java.util.Date;

public abstract class AbsAccounts {
	public static double getMonthlyInterestRate;
	private int id = 0;
	private double balance =0;
	private Date dateCreated;
	public double AnnualInterestRate;
	
	public AbsAccounts(double Annualint){
		AnnualInterestRate = Annualint;
		
	}

public abstract double getMonthlyInterestRate();
	
public int getid(){
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

public Date getDateCreated(Date dateCreated) {
	return dateCreated;
}


public double getWithdraw(double Withdraw){	
	return balance= balance - Withdraw;
}
public double getDeposit(double deposit){
	return balance = balance + deposit;
}



}
 

 
	 
 
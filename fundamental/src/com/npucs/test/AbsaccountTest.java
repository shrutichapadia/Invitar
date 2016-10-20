package com.npucs.test;

import java.util.Date;

import com.npucs.java.AbsAccounts;
import fundamental.Account;

public class AbsaccountTest {

	private static AbsAccounts acc2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbsAccounts acc1 = new SavingAccount(2234);
		System.out.println("Initial Information for Account "+"ID:"+acc1.getid()+" and Its  Balance is:   "+ acc1.getBalance());
		
	
		System.out.println("Monthly interest is "+ acc1.getMonthlyInterestRate());
		acc1.getWithdraw(2500);
		acc1.getDeposit(3000);
		System.out.println("Person Account id and balance are after Deposit "+ acc1.getBalance());
		Date date = new Date();
		date.toString();
		System.out.println("This was created on this date:" +date.toString() );
		
		
	

	acc2 = new CheckingAccount(1122);
	System.out.println("Initial Information for Account "+"ID:"+acc1.getid()+" and Its  Balance is:   "+ acc1.getBalance());
	

	System.out.println("Monthly interest is "+ acc1.getMonthlyInterestRate());
	acc1.getWithdraw(2500);
	acc1.getDeposit(3000);
	System.out.println("Person Account id and balance are after Deposit "+ acc1.getBalance());
	Date date1 = new Date();
	date1.toString();
	System.out.println("This was created on this date:" +date1.toString() );
	
	
}
}

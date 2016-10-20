package com.opit.session4;

public interface Animal {

	//Rules of the contract
	
	//methods are by-default abstract...means no implementation body
    public abstract void eat(); //no curly-braces...no body of the method
	void sleep();
	void breathe();
	
	//constant : Values cannot be changed
	public static final int num_of_legs = 4;
	
	int num_of_tails = 1;
}

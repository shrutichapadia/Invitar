package com.opit.session4;

public class Dog implements Animal{

	@Override
	public void eat() {
		//providing an implementation
		// TODO Auto-generated method stub
	  System.out.println("Dog is eating...");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Dog is sleeping...");
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("Dog is breathing...");
	}
	

}

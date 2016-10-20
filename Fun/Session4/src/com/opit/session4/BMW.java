package com.opit.session4;

public class BMW extends Car {
	
	//Car is the Parent of BMW
	//BMW inherits Car
	//BMW is the sub-class of Car
	
	//Add specific behaviour : 1.overriding the parent class's method
	//2. add its own method
	
	//method is overridden 
	//Method Over-riding : Whenever  achild class adds some specific functionlity to the method
	// inherited from the parent
	public void start(){
		System.out.println("I am calling my superclass method");
		super.start(); //super is the reference to the parent class
		System.out.println("BMW Car starting...making a fancy sound !!!");
	}
	//over-ridden
	public void stop(){
		System.out.println("BMW stopping....flashing fancy lights !!!!");
	}
	
	//Not over-ridden from the parent
    //New independent method 
	public void stopTheft(){
		System.out.println("This BMW cannot be stolen now !!!");
	}
	
}

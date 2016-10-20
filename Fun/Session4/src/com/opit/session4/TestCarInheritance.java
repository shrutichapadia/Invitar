package com.opit.session4;

public class TestCarInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Car c = new Car();
		c.start();  //Parent class's method
		c.stop();
		c.checkMileage();
		
		
		
		BMW bmw = new BMW();
		bmw.start();
		bmw.stop();
		bmw.stopTheft();
		
		//1. At Compile time : Compiler will look at the Ref variable : LHS
		//2. At Run time : JVM will look at the actual object : RHS
		
		//poly : multiple
		//morph : form 
		//Polymorphism : Ability of an object to take multiple forms
		Car c2 = new BMW(); //Polymorphic reference : Multiple forms
		
		System.out.println("Testing polymorphism...");
		c2.start();
		c2.stop();
		//c2.stopTheft();
		 //BMW has inherited but not over-ridden this method
		c2.checkMileage();
		
		//Interface : WebDriver interface
		// Browser driver classes
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new ChromerDriver();
		// WebDriver driver = new IEDriver();
		
		
		
		//Rule 1 : At runtime, actual object decides which method will run RHS
		//Rule 2 : At Compile time, Ref variable is checked (LHS will be checked)
		
		GPSSystem gps = new GPSSystem(100,"Garmin");
		Car car_with_gps = new Car(25000, gps);
	}

}

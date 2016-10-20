package com.opit.session4;

public class Car {
	
	//HAS-A relationship
	//Car HAS-A GPSSystem
	GPSSystem gps; //instance variable
    
	int price;
	
	public void start(){
		System.out.println("General Car starting !!!");
	}
	
	public void stop(){
		System.out.println("General Car is stopped now");
	}
	
	public void checkMileage(){
		System.out.println("Showing general Car's mileage !!!");
	}
	
	public Car(int price, GPSSystem gps){
		System.out.println("Creating Car Object");
	}
	
	public Car(){
		
	}
	
	
}

package com.opit.session4;

public class TestTrucks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//In order to create a Truck object, we need to first create the "GPSSystem" object
		GPSSystem gps1 = new GPSSystem(1000,"Tomtom");
		
		Truck fordRam = new Truck(25000,gps1);
		
		//Coupling : In order to create the Truck object we first need to create GPSSystem object
		//Truck class is coupled with GPSSystem class
		//Truck and GPSSystem class are in "HAS-A" relationship.
		//Truck HAS-A GPSSystem
	}

}

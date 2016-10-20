package com.opit.session4;

public class Truck {

	int price;
	//GPSsystem class ref variable is being used as Truck class's property : Truck HAS-A GPSSystem
	GPSSystem gps;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    
	public GPSSystem getGps() {
		return gps;
	}

	public void setGps(GPSSystem gps) {
		this.gps = gps;
	}
    
	
	public Truck(int price, GPSSystem gps){
		this.price = price;
		this.gps = gps;
	}
}

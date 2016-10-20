package com.opit.session4;

public class BMWX5 extends BMW{
	
	//BMWX5 will inherit both BMW and Car
	//over-ridden method
	public void start(){
		System.out.println("BMWX5' way of starting....big noise !!!");
	}
	//over-ridden
	public void stop(){
		System.out.println("BMWX5's way of stopping...break light's falshing..scrreching noise");
	}

}

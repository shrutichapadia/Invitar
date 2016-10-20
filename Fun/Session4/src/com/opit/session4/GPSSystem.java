package com.opit.session4;

public class GPSSystem {
	
	int priceNum;
	String modelName;
	
	public int getPriceNum() {
		return priceNum;
	}
	public void setPriceNum(int priceNum) {
		this.priceNum = priceNum;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	//Constructor
	public GPSSystem(int priceNum, String modelName){
		this.priceNum = priceNum;
		this.modelName = modelName;
	}
	

}

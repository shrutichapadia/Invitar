package com.opit.test.testng;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider(name="regTestDataProvider")
	public static Object[][] getUsersData(){
		//Rows : how many times the params are passed
		//Columns : how many params are passed
		Object[][] data = new Object[2][3];
		
		data[0][0] = "Himesh";
		data[0][1] = "Jindal";
		data[0][2] = "jindal.himesh@gmail.com";
		
		data[1][0] = "Anuj";
		data[1][1] = "Patel";
		data[1][2] = "anuj.patel@gmail.com";
		
		return data;
	}
	
	@DataProvider(name="loginTestDataProvider")
	public static Object[][] getData(){
		//Rows : how many times the params are passed
		//Columns : how many params are passed
		Object[][] data = new Object[2][2];
		
		data[0][0] = "P1";
		data[0][1] = "P2";
		
		data[1][0] = "Q1";
		data[1][1] = "Q2";
		
		
		return data;
	}


	@DataProvider(name="sampleDataProvider")
	public static Object[][] getSampleData(Method m){
	
		Object[][] data = null;
		
		if(m.getName().equals("testC")){
			data = new Object[2][2];
		
		data[0][0] = "P1";
		data[0][1] = "P2";
		
		data[1][0] = "Q1";
		data[1][1] = "Q2";
		}else if(m.getName().equals("testD")){
			data = new Object[2][3];
			
			data[0][0] = "R1";
			data[0][1] = "R2";
			data[0][2] = "R3";
			
			data[1][0] = "S1";
			data[1][1] = "S2";
			data[1][2]="S3";
		}
		
		return data;
	}
}

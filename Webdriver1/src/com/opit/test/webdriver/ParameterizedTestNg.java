package com.opit.test.webdriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizedTestNg {

	@Test(dataProvider="getUsersData")
	public void resgisterUsers(String fName, String lName, String email){
		System.out.println("Run with Param :"+fName+" -- "+lName+" -- "+email );
	}
	
	@DataProvider
	public Object[][] getUsersData(){
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
}

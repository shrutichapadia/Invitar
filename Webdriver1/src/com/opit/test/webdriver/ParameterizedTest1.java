package com.opit.test.webdriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {

		@Test
		@Parameters("Username")
		public void parameterTest(String Username){
		System.out.println("Parameterized value is" +Username);
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


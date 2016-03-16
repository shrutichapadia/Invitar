package com.opit.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//Step 1 
@RunWith(Parameterized.class)
public class ParameterizedTest {
	
	//Step 2. Global variables
	public String bankName;
	public int acctNum;
	public String employeeFName;
	public String employeeLName;
	
	//Step3. Create a parameterized constructor of this class
	
	public ParameterizedTest(String bankName, int acctNum, String employeeFName, String employeeLName){
		this.bankName = bankName;
		this.acctNum = acctNum;
		this.employeeFName = employeeFName;
		this.employeeLName = employeeLName;
	}
	//Step 4 test method to which we want the parameters to be passed
	@Test
	public void testAccountBalance(){
		//Selenium code here to test the account
		System.out.println("Testing "+this.employeeFName+ " "+ this.employeeLName+ " with account "+this.acctNum+" with bank "+this.bankName);
	}
	
	//Step5 getData() which returns a Collection and is marked with @Paremeters
	@Parameters
	public static Collection<Object[]> getData(){
		
		//create an object array\
		
		//Number of Rows : 2 : Represents Number of times we want to run the test case
		//Number of Columns : 3 : Represents Number of Parameters that need to be passed each time
		
		Object [][] data = new Object[3][4];
		data[0][0] = "Citibank";
		data[0][1] = 12345;
		data[0][2] = "Himesh";
		data[0][3] = "Jindal";
		
		data[1][0] = "Wellsfargo";
		data[1][1] = 678910;
		data[1][2] = "Rashid";
		data[1][3] = "Khan";
		
		data[2][0] = "Chase";
		data[2][1] = 99999;
		data[2][2] = "Anuj";
		data[2][3] = "Patel";
		
		return Arrays.asList(data);
	}
	

}

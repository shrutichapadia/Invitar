package com.opit.test.testng;

import org.testng.annotations.Test;

public class TestCase2 {

	@Test(priority=2,dataProviderClass=TestDataProvider.class, dataProvider="regTestDataProvider")
	public void testA(String fName, String lName, String email){
		
	}
	
	@Test(priority=1,dataProviderClass=TestDataProvider.class, dataProvider="regTestDataProvider")
	public void testB(String fName, String lName, String email){
		
	}
	@Test(priority=3,dataProviderClass=TestDataProvider.class, dataProvider="sampleDataProvider")
    public void testC(String s1, String s2){
		
	}
	@Test(priority=4,dataProviderClass=TestDataProvider.class, dataProvider="sampleDataProvider")
    public void testD(String s1, String s2, String s3){
	
    }
	
}

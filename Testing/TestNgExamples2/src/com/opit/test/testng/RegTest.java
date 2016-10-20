package com.opit.test.testng;

import com.opit.test.testng.TestDataProvider;
import org.testng.annotations.Test;

public class RegTest {

	@Test(dataProviderClass=TestDataProvider.class, dataProvider="regTestDataProvider")
	public void testReg(String fName, String lName, String email){
		System.out.println("Run with Param :"+fName+" -- "+lName+" -- "+email);
	}
}

package com.opit.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailTest {

	@Test
	public void testSendMail(){
		System.out.println("Testing the send mail");
	}
	@Test
	public void testReceiveMail(){
		System.out.println("Testing the mail recieved");
	}
	
	@BeforeMethod
	public void openBrowser(){
		System.out.println("Opening Chrome Browser");
	}
	
	@AfterMethod
	public void closeBrowser(){
		System.out.println("Closing Chrome Browser");
	}
	
	@BeforeTest
	public void prepareTests(){
		System.out.println("Preparing for the tests");
	}
	
	@AfterTest
	public void tearDownTests(){
		System.out.println("Tearing down after the tests");
	}
}

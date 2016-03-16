package com.opit.testng;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GoogleNews {
	
	@BeforeSuite
	public void prepareEnvironment(){
		System.out.println("Connect to DB");
	}
    
	@AfterSuite
	public void tearDownEnvironment(){
		System.out.println("Close the connection to DB");
	}
	@BeforeMethod
	public void openBrowser(){
		System.out.println("Opening Firefox Browser");
	}
	
	@AfterMethod
	public void closeBrowser(){
		System.out.println("Closing Firefox Browser");
	}
	@Test
	public void testNews(){
		System.out.println("Tesing Google News");
	}
	
	@Test
	public void testNewsPublish(){
		System.out.println("Tesing Google News");
	}
	
	@Test
	public void testNewsFeed(){
		throw new SkipException("skipping this test due to...");
	}
}

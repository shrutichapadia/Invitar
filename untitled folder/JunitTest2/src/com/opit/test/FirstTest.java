package com.opit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class FirstTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	  System.out.println("Preparing our test environment");	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tearing down after all test cases");
	}

	@Before
	public void setUp() throws Exception {
		//open the browser
		//driver.get(URL)
		System.out.println("Opening the browser");
	}

	@After
	public void tearDown() throws Exception {
		//driver.close();
		System.out.println("Close the browser");
	}

	@Test
	public void testLogin() {
		System.out.println("Testing our Login functionality.");
	}

	@Test
	public void testEmail() {
		System.out.println("Testing our email functionality.");
	}
	
	@Test
	@Ignore
	public void testLogOut() {
		System.out.println("Testing our Logout functionality.");
	}
}

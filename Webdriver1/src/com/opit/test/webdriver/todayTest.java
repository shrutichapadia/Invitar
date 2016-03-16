package com.opit.test.webdriver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class todayTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Preparing our test environment");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tearing down after all test complete");
	}

	@Before
	public void setUp() throws Exception {
		//open the browser
		//driver.get(URL)
		System.out.println("Opening the browser");
		System.out.println("Before each and every test funcationality");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Close the browser");
	}

	@Test
	public void testLogin() {
		// driver.close();
		System.out.println("Testing our login funcationality");
	}
	@Test
	public void testEmail() {
		System.out.println("Testing our login Email funcationality");
	}
	@Test
	public void testLogout() {
		System.out.println("Testing our logout funcationality");
	}
}

package com.opit.test;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestSecond {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Opening firefox");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Closing firefox");
	}

	@Test
	public void testSecond() {
		System.out.println("testing 2nd module");
	}

}

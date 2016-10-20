package com.opit.test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {

	@Test(priority=1)
	public void testLogin(){
		System.out.println("Testing the Login");
		Assert.assertEquals("A", "B");
	}
	
	@Test(priority=2, dependsOnMethods={"testLogin"})
	public void testChangePassword(){
		System.out.println("Testing Changing the password");
	}
	
	@Test(priority=3, dependsOnMethods={"testLogin","testChangePassword"})
	public void testLogout(){
		System.out.println("Testing Logout");
	}
	
}

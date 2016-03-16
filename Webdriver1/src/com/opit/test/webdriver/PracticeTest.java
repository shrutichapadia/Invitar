package com.opit.test.webdriver;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeTest {
	//instance variable
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL ="https://www.google.com/?gws_rd=ssl";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public <WebElement> void testCalenderSelection() {
		driver.get(baseURL);
		driver.findElement(By.xpath("id='gmail-sign-in")).click();
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	
}
}
package com.opit.test.webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;

public class GmailPhotoTest {
  @Test
  public void f() {
	  System.out.println("Check Googlephoto is working then login with gmail ");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Check Googlephoto is working ");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest Googlephoto is working ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AAfterTest Googlephoto is working ");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Aftersuite Googlephoto is working ");
  }

}

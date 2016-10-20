package com.opit.testng;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchExportedTest {

    private WebDriver driver;

    @BeforeMethod
	public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
	public void tearDown() throws Exception {
        driver.quit();
    }

////    @Test
////    public void testSearchExportedFromIDE() throws Exception {
////        String baseUrl = "http://usa.shivyog.com/";
////        driver.get(baseUrl + "/");
//
////        WebElement searchField = driver.findElement(By.id("sted        searchField.clear();
////        searchField.sendKeys("Stockholm");
////        searchField.submit();
////
////        String topLinkXPathExpression = "//div[@id='directories']/table/tbody/tr/td[2]/a";
////        WebElement topSearchResult = driver.findElement(By.xpath(topLinkXPathExpression));
////        topSearchResult.click();
////
////        driver.findElement(By.cssSelector("li")).click();
////        String expected = "Stockholm";
////        WebElement actualHeadLine = driver.findElement(By.cssSelector("h1"));
////        String actual = actualHeadLine.getText();
////        assertTrue(actual.contains(expected));
////    }
}
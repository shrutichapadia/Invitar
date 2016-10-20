package com.datadriven.example;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.datadriven.utils.Constants;
import com.datadriven.utils.Xls_Reader;

public class DataDrivenExpedia {
    private WebDriver driver;
	@Before
	public void setUp() throws Exception {
        driver = new FirefoxDriver();
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		driver.get(Constants.URL);
		
		driver.findElement(By.id("tab-flight-tab")).click();
		
		Thread.sleep(2000);
		
		Xls_Reader testCaseReader = new Xls_Reader(Constants.File_Path + Constants.File_Name);
		
		
		String origin = testCaseReader.getCellData("Sheet1", 0, 1);
		String destination = testCaseReader.getCellData("Sheet1", 1, 1);
	
		 
		driver.findElement(By.id("flight-origin")).sendKeys(origin);
		driver.findElement(By.id("flight-destination")).sendKeys(destination);
		
	
		String depDate = testCaseReader.getCellData("Sheet1", 2, 1);
		String retDate = testCaseReader.getCellData("Sheet1", 3, 1);
		
        
		
		String depDate1 = depDate.substring(0,2);
		String retDate1 = retDate.substring(0,2);
		
	
		
		WebElement cal_Dep_Element = driver.findElement(By.id("flight-departing"));
		cal_Dep_Element.click();
		
        WebElement calDep = driver.findElement(By.xpath("//div[@class='cal']/section[1]/ul[@class='cal-dates']"));
		
		Thread.sleep(2000);
		
		List<WebElement> columns = calDep.findElements(By.tagName("li"));
		
        for(WebElement cell : columns){
			if(cell.getText().equals(depDate1)){
				cell.findElement(By.linkText(depDate1)).click();
			break;
			}
		}
        
        Select dropdown_Adults = new Select(driver.findElement(By.id("flight-adults")));
		
		
		
		dropdown_Adults.selectByValue("2");
		
        
        
		WebElement cal_Arr_Element = driver.findElement(By.id("flight-returning"));
		cal_Arr_Element.click();
		
       WebElement calArr = driver.findElement(By.xpath("//div[@class='cal']/section[2]/ul[@class='cal-dates']"));
		
		Thread.sleep(2000);
		
		List<WebElement> cols = calArr.findElements(By.tagName("li"));
		
        for(WebElement cell : cols){
			if(cell.getText().equals(retDate1)){
				cell.findElement(By.linkText(retDate1)).click();
			break;
			}
		}
	
        WebElement searchBtn = driver.findElement(By.id("search-button"));
		searchBtn.click();
		
		//testCaseReader.setCellData("Sheet1", 4, 1, "Pass");
        
	}
	

}

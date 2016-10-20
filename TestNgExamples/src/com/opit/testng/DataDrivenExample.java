//package com.opit.testng;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.opit.utils.Constants;
//import com.opit.utils.Xls_Reader;
//
//public class DataDrivenExample {
//	
//	    private WebDriver driver;
//	    
//	
//		@BeforeMethod
//		public void setUp() throws Exception {
//	        driver = new FirefoxDriver();
//			
//			// Maximize the browser's window
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		}
//
//	
//		@AfterMethod
//		public void tearDown() throws Exception {
//			// after completing all test close the browser 
//			 driver.quit();
//		}
//	
//		@Test
//		public void test() throws Exception {
//			// URL upload and open with FireFox browser
//			driver.get(Constants.URL);
//			
//			//click on Flight tab to choose flight facility
//			driver.findElement(By.id("tab-flight-tab")).click();
//			
//			Thread.sleep(2000);
//			
//			Xls_Reader testCaseReader = new Xls_Reader(Constants.File_Path + Constants.File_Name);
//		//	Xls_Reader testCaseReader = new Xls_Reader(Constants.File_Path + Constants.File_Name);			
//			
//			//reading data from data file.xls 
//			String origin = testCaseReader.getCellData("Sheet1", 1, 1);
//			String destination = testCaseReader.getCellData("Sheet1", 1, 2);
//			
//			//web element for flight origin and destination
//			driver.findElement(By.id("flight-origin")).sendKeys(origin);
//			driver.findElement(By.id("flight-destination")).sendKeys(destination);
//
//			// date for flight booking 
//			String depDate = testCaseReader.getCellData("Sheet1", 2, 1);
//			String retDate = testCaseReader.getCellData("Sheet1", 3, 1);
//			
//	        
//			
//			String depDate1 = depDate.substring(1,3);
//			String retDate1 = retDate.substring(1,4);
//			
//		
//			// selection on flight departing
//			WebElement cal_Dep_Element = driver.findElement(By.id("flight-departing"));
//			cal_Dep_Element.click();
//			
//			//use element.xpath selector for select date
//	        WebElement calDep = driver.findElement(By.xpath("//div[@class='cal']/section[1]/ul[@class='cal-dates']"));
//			
//			Thread.sleep(2000);
//			
//			List<WebElement> columns = calDep.findElements(By.tagName("li"));
//			
//	        for(WebElement cell : columns){
//				if(cell.getText().equals(depDate1)){
//					cell.findElement(By.linkText(depDate1)).click();
//				break;
//				}
//			}
//	        // to choose total adults 
//	        Select dropdown_Adults = new Select(driver.findElement(By.id("flight-adults")));
//			dropdown_Adults.selectByValue("2");
//			
//			Select dropdown_Children = new Select(driver.findElement(By.id("flight-children")));
//			dropdown_Children.selectByValue("1");
//	        // click on flight return
//			WebElement cal_Arr_Element = driver.findElement(By.id("flight-returning"));
//			cal_Arr_Element.click();
//			
//	       WebElement calArr = driver.findElement(By.xpath("//div[@class='cal']/section[2]/ul[@class='cal-dates']"));
//			
//			Thread.sleep(2000);
//			
//			List<WebElement> cols = calArr.findElements(By.tagName("li"));
//			
//	        for(WebElement cell : cols){
//				if(cell.getText().equals(retDate1)){
//					cell.findElement(By.linkText(retDate1)).click();
//				break;
//				}
//			}
//	        // final click button to search for flights
//	        WebElement searchBtn = driver.findElement(By.id("search-button"));
//			searchBtn.click();
//			// send result back to excel as pass/fail
//			testCaseReader.setCellData("Sheet1", 4, 1, "Pass");
//	        
//		}
//
//		@Test
//		public void testinfo() throws Exception {
//			
//			Xls_Reader testCaseReader = new Xls_Reader(Constants.File_Path + Constants.File_Name);
//			// 2nd page testing continue 
//			//select depart flight from list available for depart and return
//			WebElement searchbutton = driver.findElement(By.className("btn-secondary btn-action t-select-btn"));
//			searchbutton.click();
//			
//			Thread.sleep(2000);
//			
//			String departflightindex = testCaseReader.getCellData("Sheet1", 6, 1);
//			String arriveflightindex = testCaseReader.getCellData("Sheet1", 6, 2);
//			
//			// click on continue booking button for next step ot book flight
//			WebElement continuebooking = driver.findElement(By.id("FlightUDPBookNowButton1"));
//			continuebooking.click();
//		}
//		
//		
//
//	}



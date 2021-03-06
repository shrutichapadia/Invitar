package com.opit.test.webdriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CalenderSelectionTest {
	
	//instance variables
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "http://www.expedia.com";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public <WebElement> void testCalenderSelection() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(3000);
		driver.findElement(By.id("tab-flight-tab")).click();
		
		// textbox using selenium
//		WebElement flightab = (WebElement)
		driver.findElement(By.id("flight-origin")).sendKeys("SFO");
		WebElement flightto = (WebElement) driver.findElement(By.id("flight-destination"));
		//flightto.sendkeys("LAX");
//		WebElement) flightab).sendKeys("FSO");
//		driver.findElement(By.id("flight-destination")).sendKeys("LON");
//		driver.findElement(By.id("flight-departing-label")).click();
//		
		WebElement cal_dep = (WebElement) driver.findElement(By.xpath("//div[@class='cal']/section[1]/ul"));
		
		java.util.List<org.openqa.selenium.WebElement> dates_dep = ((By) cal_dep).findElements((SearchContext) By.tagName("li"));
		//List <WebElement> dates_dep = ((By) cal_dep).findElements((SearchContext) By.tagName("li"));
		Thread.sleep(3000);
//		
//		for(WebElement cell :dates_dep){
//		if(cell.getText().equals("30")){
//			((By) cell).findElement(By.linkText("30")).click();
//			break;
//		}
//		//div[@class='cal']/section[1]/ul
//	//this xpath use //div[@class='cal']/section[1]
//	
//		driver.findElement(By.id("flight-children")).click();
//		Select sel1 = new Select (driver.findElement(By.id("flight-children"));
//		
//		//list<WebElement> options = cell.getOptions();
//		
//		//drop down how to test === Dropdowns : select sel1 = new Select(Element);
//		
//		
		
		
	//}

	}
}

package TestingSelenium;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SouthWestTest {
	
	private static WebDriver driver;
	private String  baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "http://www.southwest.com";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		
		//driver.quit();
	}

	@Test
	public void test() {
		driver.get(baseURL);
		driver.findElement(By.id("booking-form--flight-tab"));
		driver.findElement(By.id("trip-type-round-trip")).click();
		driver.findElement(By.id("air-city-departure")).sendKeys("SFO");
		driver.findElement(By.id("air-city-arrival")).sendKeys("NYC");
		driver.findElement(By.id("air-date-departure")).getAttribute("05/03/2016");
		driver.findElement(By.id("air-pax-count-adults")).sendKeys("1");
		driver.findElement(By.id("jb-booking-form-submit-button")).click();
		driver.findElement(By.id("Out2AContainer")).click();
		driver.findElement(By.id("Out3A")).click();
		driver.findElement(By.id("In2B")).click();
		driver.findElement(By.id("priceItinerarySubmit")).click();
		driver.findElement(By.name("optionsItinerarySubmit")).click();
	}

//    //Another Example of Data Driven Using CSV File
//    @Test (dataProvider = "csvData")
////    driver.get(baseURL);
////	driver.findElement(By.id("booking-form--flight-tab"));
////	driver.findElement(By.id("trip-type-round-trip")).click();
//    public void csvDataExample(String departure, String arrival, Date date)
//                  throws InterruptedException {
//           System.out.println("Depart: " + departure + ": arrive: " + arrival
//                        + ":Depart Date : " + date);
//    }
           
    
    }
	
	


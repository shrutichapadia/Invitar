package TestingSelenium;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExpediawebTest {
	
	private static WebDriver driver;


	@Before
	public void setUp() throws Exception{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception{
		
		//driver.quit();
	}

	@Test
	public void ExpediaTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("tab-flight-tab")).click();
		//flighttab.click();
	
		System.out.println("hiiiiiiiii");
		WebElement flightfrom = driver.findElement(By.id("flight-origin"));
		flightfrom.sendKeys("SFO");
		WebElement flightto = driver.findElement(By.id("flight-destination"));
		flightto.sendKeys("LON");

		WebElement flightdate = driver.findElement(By.id("flight-departing"));
		flightdate.click();
		
		
		}

}

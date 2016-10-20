package TestingSelenium;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonCSSLocatorTest {
	private WebDriver driver;
	


	@BeforeMethod
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
	//	WebDriver.close();
		}

	@Test
	public void Logintest() {
		
		
		WebElement todaydeal = driver.findElement(By.id("nav-a"));
		todaydeal.click();
	
	}

}


//WebElement searchButton(By.xpath("//input[@class=')
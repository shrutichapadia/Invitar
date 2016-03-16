package TestingSelenium;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonCSSLocatorTest {
	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		//webdriver.close();
		}

	@Test
	public void Logintest() {
		
		
		WebElement todaydeal = driver.findElement(By.id("nav-a"));
		todaydeal.click();
	
	}

}


//WebElement searchButton(By.xpath("//input[@class=')
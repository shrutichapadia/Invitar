package TestingSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WebdriverTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		System.setProperty("webdriver.chrome.driver"Chromedriver path");
//		WebDriver ChromeDriver = new ChromeDriver();
		//driver.get("www.google.com");
		
		//driver.get("https://www.southwest.com/");
		// navigate .to is alternste to .get for url
		driver.navigate().to("https://www.southwest.com/");
		driver.findElement(By.id("booking-form--flight-tab"));
		driver.findElement(By.id("trip-type-round-trip")).click();
		driver.findElement(By.id("air-city-departure")).sendKeys("SFO");
		driver.findElement(By.id("air-city-arrival")).sendKeys("NYC");

		driver.findElement(By.id("air-date-departure")).getAttribute("05/03/2016");
		driver.findElement(By.id("air-pax-count-adults")).sendKeys("3");
		driver.findElement(By.id("jb-booking-form-submit-button")).click();
		driver.findElement(By.id("Out2AContainer")).click();
		driver.findElement(By.id("Out3A")).click();
		driver.findElement(By.id("In2B")).click();
		driver.findElement(By.id("priceItinerarySubmit")).click();
		driver.findElement(By.name("optionsItinerarySubmit")).click();
		//driver.findElement(By.linkText("Flexible dates")).click();
		//driver.getPageSource();
		//driver.close();
				
	}

}

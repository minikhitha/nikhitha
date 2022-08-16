package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.Page;



public class Action extends Page{
	
WebDriver driver;
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		// Set Browser to ThreadLocalMap
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}

	public void isDisplayed(String locator) {
			
		boolean result =driver.findElement(By.xpath(locator)).isDisplayed();
		Assert.assertTrue(result);

	}
}
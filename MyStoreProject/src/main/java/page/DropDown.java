package page;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Vgive\\driver\\chromedriver_win32 (2)");
		
		//WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://vgive-qa.herokuapp.com/");
		driver.findElement(By.xpath("//button[@class='grey-outline_btn']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='text-clr']")).click();
	//	WebElement country=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/form/div/div[1]/section/div/div/div[10]/div/div/label"));
	//	System.out.println("click performed"+country);
		//String OptionToSelect="India";
		//int count=0;
		//country.sendKeys("India");
		
	/*	Select cont=new Select(country);
		List<WebElement>optionlist=cont.getOptions();
		
		for(WebElement ele:optionlist) {
			
			if(ele.getText().equals("India"))
					{
				ele.click();
				System.out.println("india performed....................");
				break;
					}
		
		}
		
	    
/*		String text;
		do {
			ClickOnCountry.sendKeys(Keys.ARROW_DOWN);
			text=ClickOnCountry.getAttribute("India");
			if(text.equals("India")){
				
				ClickOnCountry.sendKeys(Keys.ENTER);
				break;
			}
		}while(!text.isEmpty());
	*/	
		
	/*	WebElement from= driver.findElement(By.xpath("/html/body/div[1]/div/main/div/form/div/div[1]/section/div/div/div[10]/div/div/div/input"));
	      from.clear();
	      from.sendKeys("India");
	      Thread.sleep(3000);
	      Actions builder=new Actions(driver);
	      builder.moveToElement( from.findElement(By.xpath("//input[@value='India']"))).click().build().perform();

	*/

	
		
		driver.findElement(By.xpath("//a[@data-bs-target='#selectAvtarModal']")).click();
		driver.findElements(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/div"));
		
		driver.findElement(By.linkText("Save")).click();
		
	}
}
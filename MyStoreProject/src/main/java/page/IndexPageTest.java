/**
 * 
 */
package page;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.utility.Log;

public class IndexPageTest extends BaseClass {
	String username;
	
	 
	Action action= new Action();
	BaseClass base=new BaseClass();
	
	//Locators
	/*String myStoreLogo="//a[@title='My Store']";
	String searchProductBox="search_query_top";
	String searchButton="submit_search";
	String signInLink="//a[@class='login']";
	String emailTextBox="email";
	String passwordTextBox="passwd";
	String signInBtn="SubmitLogin";
	
	*/
	@Parameters("browser")
	@BeforeMethod //(groups = {"Smoke","Sanity","Regression"})
	public void setup(@Optional("Chrome")String browser) {
			launchApp(browser);
		    System.out.println("launch browser.......");
	}
	
	@AfterMethod(groups = {"Smoke","Sanity","Regression"})
	public void tearDown() {	
		//getDriver().quit();
		System.out.println("tear down ........");
	}
	
	
	@Test(groups = "Smoke")
	public void verifyLogo() throws Throwable {
		Log.startTestCase("verifyLogo");		
		Thread.sleep(1000);
		boolean result=action.isDisplay(driver, prop.getProperty("myStoreLogo"),"xpath");
		System.out.println(result);
		//SoftAssert softAssert = new SoftAssert();
		//softAssert.assertTrue(result);
		Log.endTestCase("verifyLogo");
	}
	
	@Test(groups = "Smoke")
	public void verifyTitle() {
		Log.startTestCase("verifyTitle");	
		String myStoreTitel=driver.getTitle();
		System.out.println(myStoreTitel);
		Assert.assertEquals(myStoreTitel, "My Store");
		Log.endTestCase("verifyTitle");
	}
	
	@Test
	public void  login() {
		System.out.println(prop.getProperty("username")+"-"+ prop.getProperty("password"));
		action.click(driver,prop.getProperty("signInLink"), "xpath");
		action.enterText(driver,prop.getProperty("emailTextBox"), "id",prop.getProperty("username"));
		action.enterText(driver,prop.getProperty("passwordTextBox"), "id",prop.getProperty("password"));
		action.click(driver, prop.getProperty("signInBtn"),"id");
		
	}


}

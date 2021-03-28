package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class ValidateNavigationBar extends Base {
	
	private static Logger log =  LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void intialize() throws IOException
	{
		driver = initializedriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test()
	public void basePageNavigation() throws IOException
	{
		
			
			LandingPage la = new LandingPage(driver);
				
		Assert.assertTrue(la.navigationBar().isDisplayed());	
		log.info("navigation bar is displayed");
			
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver = null;
	}
	
	

}

package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.LandingPage;
import resources.Base;

public class ValidateTitle extends Base {
	
	private static Logger log =  LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void intialize() throws IOException
	{
		driver = initializedriver();
		log.info("driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("navigated to Homepage");
	}
	
	
	@Test()
	public void basePageNavigation() throws IOException
	{
		LandingPage la = new LandingPage(driver);
		Assert.assertEquals(la.getTitle().getText(), "FEATURED COURSES");
		log.info("successfully validated text messages");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver = null;
	}
	
	

}

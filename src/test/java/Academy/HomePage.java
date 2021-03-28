package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base {
	
	private static Logger log =  LogManager.getLogger(Base.class.getName());
	
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String mailid, String passkey, String loginfo) throws IOException
	{
			driver = initializedriver();
			driver.get(prop.getProperty("url"));
		
			LandingPage la = new LandingPage(driver);
			la.getTitle().getText();
			la.signIn().click();
			
			
			LoginPage lo = new LoginPage(driver);
			lo.emailId().sendKeys(mailid);
			lo.passWord().sendKeys(passkey);
			log.info(loginfo);
			lo.logIn().click();
			
			driver.close();
			driver =null;
	}
	
	
		
	
	
	@DataProvider
	public Object[][] getData()

	{
		Object data[][] = new Object[2][3];
		
		data[0][0] = "nonrestricteduer@qw.com";
		data[0][1] = "12345";
		data[0][2] = "restricteduser";
		
		data[1][0] = "nonrestricteduer@qw.com";
		data[1][1] = "12345";
		data[1][2] = "nonrestricteduser";
		
		return data;
		
	}
	
	

}

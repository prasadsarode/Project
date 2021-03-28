package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class LoginPage {
	
	public WebDriver driver;
	
	By email = By.cssSelector("input[type='email']");
	By pass  =By.cssSelector("input[type='password']");
	By logIn = By.cssSelector("input[name='commit']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement emailId()
	{
		return driver.findElement(email);
	}
	
	public WebElement passWord()
	{
		return driver.findElement(pass);
	}
	
	public WebElement logIn()
	{
		return driver.findElement(logIn);
	}
	
	
	

}

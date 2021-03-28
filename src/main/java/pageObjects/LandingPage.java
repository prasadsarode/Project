package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signIn = By.cssSelector("a[href='http://qaclickacademy.usefedora.com/sign_in']");
	By title = By.xpath("//*[@id='content']/div/div/h2");
	By navigationBar = By.cssSelector("ul[class='nav navbar-nav navbar-right']");
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement signIn() 
	{
		return driver.findElement(signIn);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement navigationBar()
	{
		return driver.findElement(navigationBar);
	}
	
	
	
	

}

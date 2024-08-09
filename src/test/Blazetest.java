package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Blazelogin;
import pages.Blazeregister;

public class Blazetest {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/register");
	}
	
	
	@Test
	public void register()
	{
		Blazeregister ob=new Blazeregister(driver);
		ob.setvalues("sonu","sutherland","sonulalns@gmail.com","S@1704#a","S@1704#a");
		ob.register();
		
	}
	@Test
	public void login() 
	{
		//driver.get("https://blazedemo.com/login");
		//driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"app-navbar-collapse\"]/ul[2]/li[1]/a")).click();
		Blazelogin ob=new Blazelogin(driver);
		ob.setvalues("sonulalns@gmail.com", "S@1704#a");
		ob.login();
		
		
	}
}

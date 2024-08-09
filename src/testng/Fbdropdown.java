package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fbdropdown {

	ChromeDriver driver;
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	
	public void urlopen()
	{
		driver.get("https://www.facebook.com/signup");
	}
	
	@Test
	
	public void test()
	{
		WebElement dateelement=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select date=new Select(dateelement);
		date.selectByValue("5");
		
		
		WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select month=new Select (monthelement);
		month.selectByValue("4");
		
		WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select year=new Select (yearelement);
		year.selectByIndex(4);
		
	}
	
		
		
		
		
	
}

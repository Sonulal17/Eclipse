package programs;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo {
	
	ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}

	@Test
	
	public void test()
	{
		driver.findElement(By.name("name")).sendKeys("sonu");
		driver.findElement(By.id("company")).sendKeys("luminar");
		driver.findElement(By.name("email")).sendKeys("sonu@12");
		driver.findElement(By.id("password")).sendKeys("son1234");
		driver.findElement(By.id("password-confirm")).sendKeys("son1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();              //classum use cheyyam instead of button attribute 'type'.
	}
}

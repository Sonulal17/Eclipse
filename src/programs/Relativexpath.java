package programs;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {

	ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	
	public void test()
	{
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("son@145");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	
	
}

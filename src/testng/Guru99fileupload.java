package testng;

//import java.awt.AWTException;
//import java.awt.Toolkit;
//import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99fileupload {
	
	ChromeDriver driver;
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/upload/");
	}
	
	@Test
	
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\sonu lal 123\\Desktop\\sonu\\sql\\sql.pdf");
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}
		
}

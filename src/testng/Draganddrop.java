package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {

	ChromeDriver driver;
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
	
	}
	
	@BeforeMethod
	
	public void url()
	{
		driver.get("https://demoqa.com/droppable");
	}
	
	@Test
	
	public void test1()
	{
		driver.manage().window().maximize();      //maximise cheydh vekkan.
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(drag, drop);
		act.perform();
		
		String str=drop.getText();
		System.out.println(str);
		
		if(str.equals("Dropped!"))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("failed");
		}
		
		
		
	}
}

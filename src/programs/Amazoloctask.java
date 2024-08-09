package programs;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazoloctask {

	
	ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	
	public void test()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);   //enter mobile and search.
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();              //cart icon clicking
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]/div/span")).click();      //click on hello sign in tab
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sonulal");        //click on the text area and input a  value
		driver.findElement(By.xpath("//input[@type='submit']")).click();                   // click on the continue button.
		//driver.findElement(By.xpath("//span[@id='continue']/span/input")).click();   //parent to child method.
		
		//back to home page
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
		// after reaching home page clicking best sellers tab
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]")).click(); 
		//click hamburger menu.
		driver.findElement(By.xpath(" //a[@id='nav-hamburger-menu']")).click();

		
		
	}
}

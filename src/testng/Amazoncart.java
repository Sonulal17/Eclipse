package testng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

public class Amazoncart {
	
	WebDriver driver;
	ExtentReports extent;
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		extent=new ExtentReports();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	
	public void urlloading()
	{
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	
	public void search() 
	{

		//search mobile phones
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile phones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	

		//title verification using assert.
		//test = extent.createTest("amazontitleverification");
		String Exp="Amazon.in : Mobile phones";
		String actual=driver.getTitle();
		System.out.println(Exp);
		System.out.println(actual);
		Assert.assertEquals(Exp, actual);
			
	   WebElement phone= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
	   System.out.println(phone.getText());
	   
        String parentWindow = driver.getWindowHandle();
        System.out.println("The parent window is " + driver.getTitle());
        phone.click();
        
        Set<String>allwindows = driver.getWindowHandles();

        for (String handle:allwindows) 
        {
        	System.out.println(handle);
            if (!handle.equals(parentWindow)) 
            {
               driver.switchTo().window(handle);
               driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
               WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
               wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")));
               driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
            }
        }
	}
		
		
}

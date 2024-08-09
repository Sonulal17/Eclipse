package testng;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rishiherbal {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	
	public void urlloading()
	{
		driver.get("https://rishiherbalindia.linker.store/");
	}
	
	@Test
	
	public void test() throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/i")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(2000);
	
		//sign up
		
		WebElement w=driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input"));
		w.sendKeys("sonulalns@gmail.com");
		
		WebElement x=driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input"));
		x.sendKeys("S@1704#a");
		
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[1]/button")).click();
		Thread.sleep(4000);
		
		//log in
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input"));
		a.sendKeys("sonulalns@gmail.com");
		
		WebElement b=driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input"));
		b.sendKeys("S@1704#a");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();	
		Thread.sleep(5000);
		
		//serach herbal agro
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal agro Growth Booster");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
		//add to wish list
		driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]")).click();
		
		//click on link$ add aloe fairness cream to wishlist.
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]")).click();
		
		//7 click all link.
		driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		//click on health link
		driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		//click on safety link.
		driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/ul/li[3]/a")).click();
		
		//scroll down to the bottom
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)", "4000");
		//click on about us
		driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
		//screenshot
		driver.navigate().back();
		WebElement pvcyElement=driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
		File src1=pvcyElement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./screenshot//pvcyelement.png"));
		//response code
		
		 String url = "https://rishiherbalindia.linker.store/";
		 URL ob=new URL(url);
			
			HttpURLConnection con=(HttpURLConnection) ob.openConnection();
			int code=con.getResponseCode();
			System.out.println("The url is " + code);
			con.connect();
			
			if(con.getResponseCode()==200)
			{
				System.out.println("valid url");
			}
			else
			{
				System.out.println("invalid url");
			}
	        
		
		
		
		
	}
}













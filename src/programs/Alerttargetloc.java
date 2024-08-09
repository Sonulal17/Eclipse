package programs;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttargetloc {

		ChromeDriver driver;
		
		@Before
		
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("file:///C:/Users/sonu%20lal%20123/Desktop/basic.html");
		}
		
		@Test
		
		public void test()
		{
			driver.findElement(By.xpath("/html/body/input[1]")).click();
			//driver.switchTo().alert().accept();
			
			//driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("sonu");
			//driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("lal");
		    //driver.findElement(By.xpath("/html/body/input[4]")).click();
			
			Alert a=driver.switchTo().alert();
			String text=a.getText();
			if(text.equals("alert box"))
			{
				System.out.println("test pass");
			}
			else
			{
				System.out.println("test fail");
			} 
			a.accept();
			
			driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("sonu");
			driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("lal");
			
			
			
		}
}

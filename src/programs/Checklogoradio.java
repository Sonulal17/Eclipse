package programs;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checklogoradio {
	
	ChromeDriver driver;
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test()
	{
		WebElement web=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean src=web.isDisplayed();
		if(src)
		{
			System.out.println("logo present");
		}
		else
		{
			System.out.println("not present");
		}
		
		//Checkbox selected or not
		
		WebElement web1=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		boolean str=web1.isSelected();
		
		if(str)
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("not selected");
		}
		
		//radio button.
		
		WebElement web2=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		boolean str1=web2.isSelected();
		if(str1)
		{
			System.out.println("radio button selected");
		}
		else
		{
			System.out.println("radio button not selected");
		}
		
	}
}

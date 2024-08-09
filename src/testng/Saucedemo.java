package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Saucedemo {

	WebDriver driver;
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	
	public void url()
	{
		driver.get("https://www.saucedemo.com/v1/");
	}
	
	@Test
	
	public void main() throws IOException, InterruptedException
	{
		File f=new File("C:\\Users\\sonu lal 123\\Downloads\\sauce.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi); 
			XSSFSheet sh=wb.getSheet("sheet1");
			System.out.println(sh.getLastRowNum());
			
			
			for(int i=0;i<=sh.getLastRowNum();i++)
			{
				String username=sh.getRow(i).getCell(0).getStringCellValue();  //only string value read .
				System.out.println("username="+username);
				String pswd=sh.getRow(i).getCell(1).getStringCellValue();
				System.out.println(pswd);
				
				
				driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
				driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pswd);
				
				driver.findElement(By.id("login-button")).click();
				Thread.sleep(2000);
				
				
				//VALIDATION 
				
				String title=driver.getTitle();
				System.out.println(title);
				String dummy="Swag Labs";
				if(dummy.equals(title))
				{
					System.out.println("login successfull");
				}
				else
				{
					System.out.println("login failed");
				}
				
			}
		
	}
}

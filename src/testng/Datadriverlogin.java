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

public class Datadriverlogin {
	
		WebDriver driver;
		@BeforeTest
		
		public void setup()
		{
			driver=new ChromeDriver();
		}
		
		@BeforeMethod
		
		public void urlloading()
		{
			driver.get("https://www.facebook.com/");
		}
		
		@Test
		public void main() throws IOException
		{
			File f=new File("C:\\Users\\sonu lal 123\\Downloads\\fb.xlsx");
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fi);
				XSSFSheet sh=wb.getSheet("sheet1");
				System.out.println(sh.getLastRowNum());
				
				
				for(int i=0;i<=sh.getLastRowNum();i++)
				{
					String username=sh.getRow(i).getCell(0).getStringCellValue();
					System.out.println("username="+username);
					String pswd=sh.getRow(i).getCell(1).getStringCellValue();
					System.out.println(pswd);
					
					driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
					driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
					driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
					driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pswd);
					
					driver.findElement(By.name("login")).click();
					
					//validation of login
					
					String original=driver.getTitle();
					System.out.println(original);
					String dum="Facebook";
					
					if(dum.equals(original))
					{
						System.out.println("pass");
					}
					else
					{
						System.out.println("failed");
					}
				}
			
		}
}

package programs;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//to pass values in DropDown.
public class Dropdownvaluesread {

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
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(dayelement);
		day.selectByValue("04");
		List<WebElement> son=day.getOptions();
		System.out.println("total day  count is " +son.size());
		
		
		WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select month=new Select(monthelement);
		month.selectByIndex(2);
		List<WebElement> mon=month.getOptions();
		System.out.println("total month count is" +mon.size());
		
		
		WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select year=new Select(yearelement);
		year.selectByVisibleText("1999");
		List <WebElement> wed=year.getOptions();
		System.out.println("the total year count is "+ wed.size());
	}
	
}

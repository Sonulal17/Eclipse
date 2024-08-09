package programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploading {
	
	ChromeDriver driver;
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	
	public void urloading()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	
	@Test
	
	public void test1() throws AWTException 
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		
		fileUpload("C:\\Users\\sonu lal 123\\Desktop\\sonu\\sql\\sql.pdf");
	}
	
	public void fileUpload(String p) throws AWTException
	{
		
		//to copy path to clipboard
		
		StringSelection strSelection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		//to paste into s/m window
		
		Robot robot=new Robot();
		robot.delay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		//Thread.sleep(5000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		}
}

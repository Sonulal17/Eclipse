package programs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitbrowserpgm {
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("browser open");
		
	}
	
	@Test
	public void test()
	{
		String src=driver.getTitle();
		System.out.println(src);
		System.out.println("test activities");
		
		
		
	}
	
	@Test
	public void test1()
	{
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("failed");
		}
		
		
	}
	
	@After
	public void browserclose()
	{
		
		System.out.println("browser closes");
	}
}

package programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getcontent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.getPageSource();
		String content=driver.getPageSource();
		//System.out.println(content);

		
		
		if(content.contains("Gmail"))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
		driver.close();
		//driver.quit();   */

	}

}

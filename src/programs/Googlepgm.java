package programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expected="Google";
		
		
		if(actualtitle.equals(expected))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
		driver.close();
		//driver.quit();
	}

}

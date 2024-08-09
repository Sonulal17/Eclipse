package programs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urlconnection {

	ChromeDriver driver;
	String str="https://www.google.com/";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(str);
	}
	
	@Test
	
	public void linkcount() throws IOException
	{
		URL ob=new URL(str);
		
		HttpURLConnection con=(HttpURLConnection) ob.openConnection();
		int code=con.getResponseCode();
		System.out.println(code);
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

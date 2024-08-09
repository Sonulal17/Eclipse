package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pages.Fbpage;
import utilities.Excelutilities;

public class Fbtest  extends Baseclass{
	
	@Test
	public void verifyLoginWithValidCred()
	{
		WebDriver driver;
		Fbpage p1=new Fbpage(driver);
		
		//reading the data from excel file by the specified path.
		
		String xl="C:\\Users\\sonu lal 123\\data.xlsx";
		String Sheet="Sheet1";
		
		int rowCount=Excelutilities.getRowCount(xl,Sheet);
		for(int i=1;i<rowCount;i++)
		{
			String Username=Excelutilities.getCellValue(xl,Sheet,i,O);
			System.out.println(Username);
			String pwd=Excelutilities.getCellValue(xl,Sheet,i,1);
			System.out.println(pwd);
			
			///passing username and pswd as parameters.
			
			//submitting the data by clicking on login button
			
			p1.setvalues(Username, pwd);
			p1.login();
		}
	}
}

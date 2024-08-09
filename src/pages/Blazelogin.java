package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blazelogin {
	
	WebDriver driver;
	@FindBy (name="email")
	WebElement blemail;
	
	
	@FindBy (id="password")
	WebElement blpassword;
	
	@FindBy (xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button")
	WebElement Bllogin;
	
	
	public Blazelogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setvalues(String email,String password)
	{
		blemail.sendKeys(email);
		blpassword.sendKeys(password);
		
	}
	
	public void login()
	{
		Bllogin.click();
	}
	
}


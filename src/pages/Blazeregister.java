package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blazeregister {
	
	WebDriver driver;
	@FindBy (id="name")
	WebElement blname;
	
	
	@FindBy (id="company")
	WebElement blcomp;
	
	@FindBy (name="email")
	WebElement Blemail;
	
	@FindBy(name="password")
	WebElement Blpass;
	
	@FindBy(id="password-confirm")
	WebElement blconpass;
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button")
	WebElement Blreg;
	
	
	public Blazeregister(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setvalues(String name,String company,String email,String password,String confirmpassword)
	{
		blname.sendKeys(name);
		blcomp.sendKeys(company);
		Blemail.sendKeys(email);
		Blpass.sendKeys(password);
		blconpass.sendKeys(confirmpassword);
		
		
	}
	
	public void register()
	{
		Blreg.click();
	}
	
}

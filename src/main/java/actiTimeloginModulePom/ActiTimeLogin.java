package actiTimeloginModulePom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLogin  
{//declaration
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement Uname;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pass;
	
	@FindBy(xpath="//a[@class='initial']")
	private WebElement loginButton;
	
	WebDriver driver;
	
	public ActiTimeLogin(WebDriver driver)
	{ //initiallization
		
		PageFactory.initElements(driver,this);
	}
	public void SetActiTimeUname(String UN)
	{
		Uname.sendKeys(UN);
	}
	public void SetActiTimePass(String PASS)
	{
		pass.sendKeys(PASS);
	}
	public void SetActiTimeLoginButton()
	{
		loginButton.click();;
	}

}

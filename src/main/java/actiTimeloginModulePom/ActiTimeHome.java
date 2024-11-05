package actiTimeloginModulePom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHome 
{ //declaration
	
	@FindBy(xpath="//img[@height='61']")
	private WebElement Logo;
	
	@FindBy(xpath="//a[@href=\"/tasks/otasklist.do\"]")
	private WebElement Task;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement Logout;
	
	@FindBy(xpath="//div[@class=\"popup_menu_icon add_ons_icon\"]")
	private WebElement Plusicon;
	
	@FindBy(xpath="//a[@class=\"item_link has_icon qb_icon\"]")
	private  WebElement ClickIntegration;
	
	WebDriver driver1;
	
	public ActiTimeHome(WebDriver driver)
	{//initiallization
		
		PageFactory.initElements(driver,this);
		driver1=driver;
	}
	
	public void windowid()
	{
		String id = driver1.getWindowHandle();
		System.out.println(id);
	}
	
	public void SetActiTimeLogo()
	{ //usage 
		boolean resp = Logo.isDisplayed();
		if(resp==true)
		{
			System.out.println("Test Case Is Pass ="+resp);
		}
		else
		{
			System.out.println("Test Case Is Fail =" +resp);
		}
		
	}
	public void ClikTaskOption()
	{
		Task.click();
		
	}
	/* public void CheckClickButtond()
	 {
		 boolean D = Task.isEnabled();
			if(D==true)
			{
				System.out.println("Test Case Is Pass ="+D);
			}
			else
			{
				System.out.println("Test Case Is Fail ="+D);
				
			}
	 }
	
	public void SetActiTimeLogout()
	{
		Logout.click();
	}*/
	public void clickPlusIcon() throws InterruptedException
	{
		Actions a = new Actions(driver1);
		a.moveToElement(Plusicon).perform();
		Thread.sleep(2000);
		Plusicon.click();
	}
	
	public void clickIntegrationBooks()
	{
		ClickIntegration.click();
	}

}

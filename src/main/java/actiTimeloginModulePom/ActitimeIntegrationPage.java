package actiTimeloginModulePom;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeIntegrationPage 
{
	@FindBy(xpath="//span[@class=\"Features\"]")
	private WebElement ClickFeaturestab ;
	
	
	
	@FindBy(xpath="//button[@id=\"cookie-button--got-it\"]")
	private WebElement Acceptcookies;
	
	WebDriver driver1;
	
	public ActitimeIntegrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		driver1=driver;
	}
	
	public void Switchtochildwindow()
	{
		Set<String> allids = driver1.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(allids);
		driver1.switchTo().window(al.get(1));
			
	}
	public void ClickFeaturestab() 
	{
		ClickFeaturestab.click();
		System.out.println("Click Succesfully" +ClickFeaturestab);
		Acceptcookies.click();
		
			
		String url = driver1.getCurrentUrl();
		System.out.println(url);
		
	}
	
	
	

}

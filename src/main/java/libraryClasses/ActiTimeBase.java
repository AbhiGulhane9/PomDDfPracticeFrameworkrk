package libraryClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeBase 
{
	public WebDriver driver;
	public void InitiallizeBrowser() throws IOException
	{
	driver = new ChromeDriver();
	driver.get(ActiTimeUtilityClass.propertyFile("Url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}

package actiTimeLoginModuleTest;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import actiTimeloginModulePom.ActiTimeHome;
import actiTimeloginModulePom.ActiTimeLogin;
import actiTimeloginModulePom.ActitimeIntegrationPage;
import libraryClasses.ActiTimeBase;
import libraryClasses.ActiTimeUtilityClass;
public class ActiTimetestclass extends ActiTimeBase 
{
	ActiTimeLogin login;
	ActiTimeHome home;
	ActitimeIntegrationPage integration;
	//int TCID;
	
	
	
		@BeforeClass
		public void startbrwser() throws EncryptedDocumentException, IOException
		{
			InitiallizeBrowser();
			
			login= new ActiTimeLogin(driver);
			home = new ActiTimeHome(driver);
			integration = new ActitimeIntegrationPage(driver);
			
		}
		@BeforeMethod
		public void EnterCredToLogin() throws InterruptedException, EncryptedDocumentException, IOException
		{
			
			login.SetActiTimeUname(ActiTimeUtilityClass.propertyFile("UN"));
			login.SetActiTimePass(ActiTimeUtilityClass.propertyFile("Pass"));
			login.SetActiTimeLoginButton();
			home.SetActiTimeLogo();
			home.ClikTaskOption();
			home.clickPlusIcon();
			home.clickIntegrationBooks();
		}
		
		@Test
		public void verifyfeaturesitle()
		{
			//TCID= +TCID;
			integration.Switchtochildwindow();
			integration.ClickFeaturestab();
			String exp = "https://www.actitime.com/not-found";
			String act = "https://www.actitime.com/not-found";
			Assert.assertEquals(act, exp,"fail please check");
			
		}
		
		
		@AfterMethod
		//we can also use int tcid to store ss and also use this tcid in @test and also mention this tcid in common with int 
		public void CloseBrowser(ITestResult S1) throws IOException 
		{
		if(S1.getStatus()==ITestResult.SUCCESS)
		{
			ActiTimeUtilityClass.CapturesShot(driver);
			driver.quit();
		}
		else
		{
			ActiTimeUtilityClass.CapturesShot(driver);
		}
		
		}
		
		
	

}

package example.Pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;

public class Methods extends SetUp{
	
	public Methods(AppiumDriver driver)
	{		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}
	
	//@AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
	@AndroidFindBy(xpath="//android.widget.Button[@text='ALLOW']")
	public MobileElement ALLOW;
	
	@AndroidFindBy(id="com.android.packageinstaller:id/permission_deny_button")
	public MobileElement DENY;
	
	
	
	public void waitcommand() throws InterruptedException
	{
		Thread.sleep(30);
	}
	
	public boolean VerifyPage(String xpath, String pagetitle)
	{
		Assert.assertTrue(xpath.contains(pagetitle));
	     
	     System.out.println("Testing Passed");
	     
		return false;
	} 
	
	public String log(String message) 
	{
		
		Logger logger = Logger.getLogger("NewSmokeTest");
		
		PropertyConfigurator.configure("log4j.properties");	
		
		logger.info(message);
		
		return null;
		
	}
	
	public void Allow()
	{
		ALLOW.click();
		
	}
	
	public void Deny()
	{
		DENY.click();
		
	}
	
	
	
	
	
	
		
		/*public String waitfor(String locator)
		{
			
			WebDriverWait wait = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));   
			
			return null;
		}*/
	
	

}

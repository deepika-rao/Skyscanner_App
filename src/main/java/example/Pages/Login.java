package example.Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login extends SetUp{
	
	public Login(AppiumDriver driver)
	{		
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}

	@AndroidFindBy(id="net.skyscanner.android.main:id/userEditText")
	public MobileElement Email;
	
	@AndroidFindBy(id="net.skyscanner.android.main:id/passwordEditText")
	public MobileElement Password;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='LOG IN']")
	public MobileElement LOG_IN;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='FORGOT PASSWORD?']")
	public MobileElement FORGOT_PASSWORD;
	
	
	public void Email()
	{
		Email.sendKeys("dkudmulwar@afs.net");
		//System.out.println("Clicked on Accessibility");
	}
	
	public void Password()
	{
		Password.sendKeys("testing123");
		//System.out.println("Clicked on Animation");
	}
	
	public void LOG_IN()
	{		
		LOG_IN.click();		
	}
	
	public void FORGOT_PASSWORD()
	{
		FORGOT_PASSWORD.click();
		
	}
	

}
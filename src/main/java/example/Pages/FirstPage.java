package example.Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FirstPage extends SetUp{
	
	public FirstPage(AppiumDriver driver)
	{		
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Continue with Facebook']")
	public MobileElement ContinuewithFacebook;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Sign in with Google']")
	public MobileElement SigninwithGoogle;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Sign up with Email']")
	public MobileElement SignupwithEmail;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Already have an account? Log in']")
	public MobileElement Login;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='NONE OF THE ABOVE']")
	public MobileElement NONE_OF_THE_ABOVE;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='0']")
	public MobileElement Close;
	
	
	public void ContinuewithFacebook()
	{
		ContinuewithFacebook.click();
		//System.out.println("Clicked on Accessibility");
	}
	
	public void SigninwithGoogle()
	{
		SigninwithGoogle.click();
		//System.out.println("Clicked on Accessibility");
	}
	
	public void SignupwithEmail()
	{
		SignupwithEmail.click();
		//System.out.println("Clicked on Accessibility");
	}
	
	public void Login()
	{
		Login.click();
		//System.out.println("Clicked on Accessibility");
	}
	
	public void NONE_OF_THE_ABOVE()
	{
		NONE_OF_THE_ABOVE.click();
		//System.out.println("Clicked on Accessibility");
	}
	
	public void CloseBtn()
	{		
		Close.click();		
	}
	

}

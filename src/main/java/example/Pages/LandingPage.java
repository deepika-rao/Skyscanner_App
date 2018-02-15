package example.Pages;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LandingPage extends SetUp{
	
	private String FirstPageIdentificaton= "The world’s travel search engine"; 
	
	private String SecondPageIdentification= "No booking fees";
	
	public LandingPage(AppiumDriver driver)
	{		
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='The world’s travel search engine']")
	public MobileElement WorldsTravel;	
	
	@AndroidFindBy(id="net.skyscanner.android.main:id/nextText")
	public MobileElement Next;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='No booking fees']")
	public MobileElement NoBookingFees;
	
	public void ClickNext()
	{
		if(WorldsTravel.getText().contains(FirstPageIdentificaton))
		{
			Next.click();	
		}
	}
	
	public void ClickNextAgain()
	{
		if(NoBookingFees.getText().contains(SecondPageIdentification))
		{
			Next.click();	
		}
		
	}
}

package example.Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Search extends SetUp{
	
	public Search(AppiumDriver driver)
	{		
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}
	
	@AndroidFindBy(id="net.skyscanner.android.main:id/flights_icon")
	public MobileElement Flight;
	
	//@AndroidFindBy(id="net.skyscanner.android.main:id/home_flights_text")
	//public WebElement Flight;
	
	@AndroidFindBy(id="net.skyscanner.android.main:id/hotels_icon")
	public MobileElement Hotels;
	
	@AndroidFindBy(id="net.skyscanner.android.main:id/carhire_icon")
	public MobileElement Car_hire;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Explore']")
	public MobileElement Explore;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Profile']")
	public MobileElement Profile;
	
	
	public void Flights()
	{
		//Flights.click();
		
		if(Flight!=null)
		{
			
			Flight.click();
		}
		//System.out.println("Clicked on Accessibility");
	}
	
	public void Hotels()
	{
		Hotels.click();
		//System.out.println("Clicked on Accessibility");
	}
	
	public void Car_hire()
	{
		Car_hire.click();
		//System.out.println("Clicked on Accessibility");
	}
	
	public void Explore()
	{
		Explore.click();
		//System.out.println("Clicked on Accessibility");
	}
	
	public void Profile()
	{
		Profile.click();
		//System.out.println("Clicked on Accessibility");
	}

}

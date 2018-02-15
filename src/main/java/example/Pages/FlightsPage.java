package example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FlightsPage extends SetUp{
	
	private static AppiumDriver driver;
	
	private String From="New Delhi";
			
	private String To="Mumbai";	

	public FlightsPage(AppiumDriver driver)
	{		
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='RETURN']")
	public MobileElement RETURN;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='ONE WAY']")
	public MobileElement ONEWAY;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Departing From']")
	public MobileElement DepartingFrom;
	
	@AndroidFindBy(id="net.skyscanner.android.main:id/toText")
	public MobileElement FlyingTo;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Fri, 9 Feb']")
	public MobileElement Date;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Departing From']")
	public MobileElement DepartureLocation;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='New Delhi ']")
	public MobileElement select1;
	
	@AndroidFindBy(id="net.skyscanner.android.main:id/toText")
	public MobileElement DestinationLocation;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Mumbai ']")
	public MobileElement select2;
	
	@AndroidFindBy(id="net.skyscanner.android.main:id/fab")
	//@AndroidFindBy(xpath="//android.widget.ImageButton")
	//@AndroidFindBy(className="android.widget.ImageButton")
	public MobileElement SearchButton;
	
	
	
	
	public void Return()
	{
		RETURN.click();
	}
	
	public void OneWay()
	{
		ONEWAY.click();
	}
	
	public void Departing()
	{
		DepartingFrom.click();
	}
	
	public void Flying()
	{
		FlyingTo.click();
	}
	
	public void Date()
	{
		Date.click();
	}
	
	public void From() throws Exception
	{
		
		//DepartingFrom.click();		
		
		DepartureLocation.sendKeys("N");		
			
		/*if(DepartureLocation.getText().contains(From))
		{
			select1.click();	
		}*/
	}
	
	public void To() throws Exception
	{
		//FlyingTo.click();
		
		DestinationLocation.sendKeys("L");
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Mumbai ']").click();			
		
		/*Thread.sleep(10);		
		
		if(DestinationLocation.getText().contains(To))
		{
			select2.click();	
		}*/				
	}
	
	public void Searchbtn()
	{		
		//SearchButton.click();
		TouchAction a2 = new TouchAction(driver);
		a2.tap (100, 100).perform();
	}
	
	
}

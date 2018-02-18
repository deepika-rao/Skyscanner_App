package example.Test;

import org.testng.annotations.Test;

import example.Pages.FirstPage;
import example.Pages.FlightsPage;
import example.Pages.LandingPage;
import example.Pages.Login;
import example.Pages.Methods;
import example.Pages.Search;
import example.Pages.SetUp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PressesKeyCode;
import io.appium.java_client.android.AndroidKeyCode;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class NewSmokeTest extends SetUp{
	
	private static AppiumDriver driver;
	
	private FirstPage firstpage;
	
	private Login login;
	
	private Methods methods;
	
	private Search search;	
	
	private LandingPage lp;
	
	private FlightsPage fp;
  
  @BeforeSuite
  public void beforeSuite() throws Exception {
	  
	  driver = Set_Up();
	  
	  firstpage = new FirstPage(driver);
	  
	  login = new Login(driver);
	  
	  methods = new Methods(driver);
	  
	  search = new Search(driver);	
	  
	  lp = new LandingPage(driver);
	  
	  fp = new FlightsPage(driver);
	  
  }
  
  @BeforeClass
  public void Firstpage() throws Exception
  {
	  methods.waitcommand();
	  
	  methods.log("Launch application");
	  
	  lp.ClickNext();
	  
	  methods.log("Click Next");
	  
	  methods.waitcommand();
	  
	  lp.ClickNextAgain();
	  
	  methods.log("Click Next Again");
	  
	 }
  
  @Test(priority=1)
  public void Loginpage() throws Exception
  {	  
	  methods.waitcommand();
	  
	  firstpage.CloseBtn();
	  
	  methods.log("Click on Close Button");	  
  }
  
  @Test(priority=2)
  public void SelectDepart() throws Exception
  {
	  methods.waitcommand();
	  
	  search.Flights();
	  
	  methods.waitcommand();
	  
	  fp.OneWay();
	  
	  methods.log("Click on One Way");
	  
	  Thread.sleep(2000);
	  
	  fp.Departing();
	  
	  methods.log("Click on Departing From");
	  
	  methods.Allow();
	  
	  methods.log("Click on Allow");
	  
	  Thread.sleep(2000);
	  
	  fp.Departing();
	  
	  methods.log("Click on Departing From");
	  
	  methods.waitcommand();
	  
	  fp.From();
	  
	  methods.log("Enter location");
	  
	  methods.waitcommand();
	  
	  ((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.KEYCODE_DPAD_DOWN);
	  
	  Thread.sleep(2000);
	  
	  ((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.KEYCODE_DPAD_DOWN);
	  
	  Thread.sleep(2000);
	  
	  ((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.ENTER);
	  
	  Thread.sleep(2000);
	  
	  methods.log("Enter Departure");
	  
  }
  
  @Test(priority=3)
  public void SelectFlying() throws Exception
  {	  
	    
	  Thread.sleep(2000);
	  
	  fp.To();
	  
	 ((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.KEYCODE_DPAD_DOWN);
	  
	  Thread.sleep(2000);
	  
	 ((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.KEYCODE_DPAD_DOWN);
	  
	  Thread.sleep(3000);
	  
	 ((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.ENTER);
	  
	  Thread.sleep(2000);
	  
	  methods.log("Enter Destination");	  
	  
	  Thread.sleep(5000);	
	  
	  //fp.SearchButton(driver, "android.widget.ImageButton", "net.skyscanner.android.main:id/fab");
	  fp.SearchBtn();
	  
	  Thread.sleep(5000);
	  
	  methods.log("Click Searchbutton");
	  
	  Thread.sleep(4000);
	  
	  methods.VerifyPage("//android.widget.TextView[@text='Search Flights']", "Search Flights");
	
  }
  
  /*@Test(priority=4)
  public void SearchFlights() throws Exception
  {	  
	  Thread.sleep(4000);
	  
	  fp.Searchbtn();
	  
	  Thread.sleep(3000);
	  
	  methods.log("Click Searchbutton");
	  
	  Thread.sleep(4000);
	  
	  methods.VerifyPage("net.skyscanner.android.main:id/sortFilterBarSortAndFilterButton", "SORT & FILTER");
	  
  }*/
    
  

}

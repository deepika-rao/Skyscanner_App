package example.Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import example.Pages.FirstPage;
import example.Pages.Methods;
import example.Pages.Search;
import example.Pages.SetUp;
import io.appium.java_client.AppiumDriver;

public class Test_Cases extends SetUp{	
	
	private static AppiumDriver driver;
	
	private FirstPage firstpage;
	
	private Methods methods;
	
	private Search search;
	
	//@BeforeSuite
	@Test
	  public void SetBase() throws Exception 
	{
		driver = Set_Up();	
		
		firstpage = new FirstPage(driver);
		
		methods = new Methods(driver);
		
		search = new Search(driver);
		
		//System.out.println("Launched application");
	}
	
	
		
	
}
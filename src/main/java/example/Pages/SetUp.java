package example.Pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class SetUp {
	
	/*static Properties properties;
	
	static	AndroidDriver<AndroidElement> driver;
	
	public void startServer() {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723 --session-override -dc \"{\"\"noReset\"\": \"\"false\"\"}\"\"");
			Thread.sleep(10000);
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static AndroidDriver<AndroidElement> Set_Up() throws IOException{		
		
		properties = new Properties();
		
		File f = new File(System.getProperty("user.dir")+"\\src\\properties_file\\config.properties");
		
		FileReader obj = new FileReader(f);
		
		properties.load(obj);				
			
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, properties.getProperty("PLATFORM_NAME"));						
			
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, properties.getProperty("DEVICE_NAME"));
			
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "50");
			
			cap.setCapability(MobileCapabilityType.APP, properties.getProperty("APP"));
			
			cap.setCapability("appWaitPackage", "net.skyscanner.android.main");
			
			cap.setCapability("appWaitActivity", "net.skyscanner.app.presentation.globalnav.activity.GlobalNavActivity ");
			
			return driver;			
			
	}
	
	public void driver() throws IOException
	{
		
		AndroidDriver<AndroidElement> driver = Set_Up();		
		
	}*/
	
	static Properties properties;
	
	public static AndroidDriver<WebElement> Set_Up() throws IOException{	
		
		AndroidDriver<WebElement> driver;
		
		properties = new Properties();
		
		File f = new File(System.getProperty("user.dir")+"\\src\\properties_file\\config.properties");
		
		FileReader obj = new FileReader(f);
		
		properties.load(obj);
		
			//Setting desired capabilities
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, properties.getProperty("PLATFORM_NAME"));
			
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, properties.getProperty("DEVICE_NAME"));
			
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "50");
			
			cap.setCapability(MobileCapabilityType.APP, properties.getProperty("APP"));	
			
			cap.setCapability("appWaitPackage", "net.skyscanner.android.main");
			
			cap.setCapability("appWaitActivity", "net.skyscanner.app.presentation.globalnav.activity.FullScreenSmartLockActivity");
		
			driver = new AndroidDriver<WebElement>(new URL(properties.getProperty("AppiumURL")),cap);
			
			return driver;
	}
		
		
	}
	



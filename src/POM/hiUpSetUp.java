package POM;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class hiUpSetUp {
	
	AppiumDriver<MobileElement> driver;
	//String path;
	
	@Test
	public void setup_server( ) throws IOException, InterruptedException
	{
		
		System.out.println("Session is creating");

	// path=System.getProperty("user.dir");
	 DesiredCapabilities cap=new DesiredCapabilities();
	 cap.setCapability("platformName","Android");
	 cap.setCapability("deviceName", "Galaxy S6"); 
	 cap.setCapability("platformVersion", "6.0");
	 //cap.setCapability("autoAcceptAlerts",true);
	 cap.setCapability("noReset",true);
	 //cap.setCapability("newCommandTimeout", 120);
	 //cap.setCapability("app",path+"\\app\\Hiup_2.2.1_65.apk");
	 cap.setCapability("appPackage", "co.olivemedia.hihoandroidwebapp");
	 cap.setCapability("appActivity", "co.olivemedia.hihoandroidwebapp.activities.SplashScreenActivity");
     //cap.setCapability("unicodeKeyboard", true);//hide keywords
     
    
    
	 try
 {
	 
 driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
 System.out.println("Session is created");   

	 Thread.sleep(3000);
	 }

 catch(Exception e)
 {
	 System.out.println("Unable to open application.");
		 System.out.println(e.getMessage());
 }

	 Thread.sleep(4000);
	
	}

}

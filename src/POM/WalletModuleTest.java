package POM;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class WalletModuleTest extends excel {
	
	AppiumDriver<MobileElement> driver;
	Wallet_Page objwallet;
	String label;
	
	@Test(priority=1)
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

	
	@SuppressWarnings("unlikely-arg-type")
	@Test(priority=2)
	public void WalletTestCase() throws InterruptedException
	{
		try {
			objwallet=new Wallet_Page(driver);
			Thread.sleep(2000);
			objwallet.wallet();
			Thread.sleep(2000);
			MobileElement loc_title=driver.findElement(objwallet.wal_til);
			String title1=loc_title.getText();
			if(title1.equals("My wallet"))
			{
				label="Pass";
				System.out.println("Wallet menu has been opened.");
				Thread.sleep(5000);
			}
			else
			{
				label="fail";
			}
				
			Thread.sleep(2000);
			objwallet.clickadd();
			Thread.sleep(3000);
			//MobileElement cert=driver.findElement(By.xpath("//android.widget.TextView[@text='Monkey westling']"));
			MobileElement cert=driver.findElement(objwallet.wallet_asset);
			String doc=cert.getText();		
			cert.click();
			 System.out.println("doc " + doc);
			
			Thread.sleep(3000);
			objwallet.clickpic();
			Thread.sleep(3000);
			objwallet.clickcapture();
			Thread.sleep(3000);
			objwallet.clicksave();
			Thread.sleep(20000);
			/*MobileElement gallery=driver.findElement(By.xpath("//android.widget.Button[@text='Gallery']"));
			gallery.click();
			MobileElement gallery_mob=driver.findElement(By.xpath("//android.widget.TextView[@text='Gallery']"));
			gallery_mob.click();*/
			
			//need to verify added wallet with list in wallet
			objwallet.clickcerty();
			System.out.println("Certificate tab has been opened.");
			Thread.sleep(2000);
	       
	        String listwallet=objwallet.getassets();
	        System.out.println("cert " + listwallet);
		 
				if(listwallet.equalsIgnoreCase(doc))
			{
				label="Pass";
				System.out.println("Document has been attached.");

			}
			else
			{
				label="fail";
			}
								

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable test Wallet Menu.");
			System.out.println(e.getMessage());
		}
		
		
	} 

}

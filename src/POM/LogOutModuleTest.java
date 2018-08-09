package POM;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LogOutModuleTest{
	
	AppiumDriver<MobileElement> driver;
	Logout_Page objlogout;
	String label;
	
@Test
	public void LogoutTestCase ()
	{
		try
		{
		
		objlogout=new Logout_Page(driver);
		
		objlogout.logout();
		
		String link=objlogout.gettitle();

		if(link.equals("Refine"))
		{
		label="Pass";
		System.out.println("Successfully logged out");
		
		}
		else
		{

		label="Fail";
			
		}
	}

		catch(Exception e)
		{
			System.out.println("Unable to logout");
			 Assert.fail("Unable to logout",e);
			//objlogout.clickclose();
			//objlogout.clickcan();
		}
	
	}

}

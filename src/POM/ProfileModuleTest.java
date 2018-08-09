package POM;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ProfileModuleTest extends Signup_Page{
	
	AppiumDriver<MobileElement> driver;
	ElementsPath obj=new ElementsPath();
	Signup_Page obj_signup;
	String label;
	 

public ProfileModuleTest(AppiumDriver<MobileElement> driver2) {
		super(driver2);
		// TODO Auto-generated constructor stub
	}

@Test	
public void Profiletest()
	 {
	
 try
	{
	 clickcontrol();
	 clickmenu();
	 clickprof();
	 
	 MobileElement edit=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/bt_edit"));
	edit.click();
	MobileElement title=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/et_edit_user_profile_title"));
	title.sendKeys("Mr.");
	driver.hideKeyboard();
	verticalSwipe();
	Thread.sleep(2000);
	MobileElement about=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/et_user_profile_about_me"));
	about.sendKeys("I am Creative Designer");	
	driver.hideKeyboard();
	Thread.sleep(2000);
	MobileElement save=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/bt_save_edit_profile"));
	save.click();
		}
	
	catch(Exception e)
	{
	e.getMessage();
	System.out.println("Unable to edit profile.");
	}
			
		
	 }
	 
	
		
		
}

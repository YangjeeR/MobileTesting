package POM;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginModuleTest {
	
	AppiumDriver<MobileElement> driver;
	String label;
	Login_Page objLogin;
	
@Test
	public void LoginTestCase()
	{
	
			
	
	try {
		
		objLogin = new Login_Page(driver);
	    
		String email="jmeter2011@gmail.com";
		
		objLogin.loginmain(email, "y@nzEE2018");
		Thread.sleep(20000);
	   // verify title
        objLogin.prof();
        Thread.sleep(2000);
		String til = objLogin.gettitle();
	   // Assert.assertTrue(til.contains(email));
		
	    if(til.equals(email))
	    {
	    	System.out.println("Successfully logged in");
	    	label="Pass";
	    }
	    else
	    {
	    	System.out.println("Login failed");
	    	label="Fail";
	   	 
	    }
	  //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    
	}
	 catch(Exception e) {
		 System.out.println("Unable to login");
		 System.out.println(e.getMessage());
		 //objLogin.clickclose();
		// objLogin.clickcan();
	 }
	
	
	}

}

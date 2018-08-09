package POM;


import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class LoginCase extends excel {
	
	AppiumDriver<MobileElement> driver;
	String path;
	Login_Page objLogin;
	String label;



	@Test
	public void LoginTestCase() throws InterruptedException
	{
	
	driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);	
		
	objLogin = new Login_Page(driver);
    
	String email="jmeter1234@gmail.com";
	
	objLogin.loginmain("jmeter1234@gmail.com", "y@nzEE2018");
   // verify title

	String til = objLogin.gettitle();
   // Assert.assertTrue(til.contains(email));
	
    if(til.equals(email))
    {
    System.out.println("Successfully logged in");
    label="Pass";
    }
    else
    {
    label="Fail";
   	 
    }
    driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
    
    sheet.getRow(2).getCell(4).setCellValue(label);		
	}
    
}

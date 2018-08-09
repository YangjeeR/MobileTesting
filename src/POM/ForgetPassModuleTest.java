package POM;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ForgetPassModuleTest extends excel {
	AppiumDriver<MobileElement> driver;
	Forget_Page objForget;
	String label;
	
@Test
	public void ForgetTestCase ()
	{
		//driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);	
		try
		{
		objForget=new Forget_Page(driver);
		
		objForget.forget("jmeter1234@gmail.com");
		
		
		String link=objForget.getresettil();

		if(link.equals("Email sent"))
		{
		label="Pass";
		System.out.println("Reset link has been sent in mentioned email address.");
		objForget.reset_ok();
		Thread.sleep(2000);
		objForget.clickclose();
		}
		else
		{

		label="Fail";
			
		}
		sheet.getRow(4).getCell(4).setCellValue(label);
	}
		catch(Exception e)
		{
			System.out.println("Unable to reset password");
			System.out.println(e.getMessage());
			objForget.clickclose();
			objForget.clickcan();
		}

}
	
}

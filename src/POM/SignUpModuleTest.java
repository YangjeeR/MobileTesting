package POM;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SignUpModuleTest extends excel {

	AppiumDriver<MobileElement> driver;
	Signup_Page signobj;
	String label;
	
	public void SignUpTestCase()
	{
	try {
	
		signobj=new Signup_Page(driver);
		
		signobj.SignUp();
		
		label=signobj.label;

		if(label=="Pass")
		{
		System.out.println("You have successfully signed Up.");
		}
		else
		{
		System.out.println("SignUp unsucessfull");		
		}
		sheet.getRow(5).getCell(4).setCellValue(label);
		
		}
	catch (Exception e)
	{
		System.out.println("Unable to sign in new user.");
		System.out.println(e.getMessage());
	}
	
	}
}

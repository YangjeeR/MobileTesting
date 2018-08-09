package POM;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SettingsModuleTest extends excel {

	AppiumDriver<MobileElement> driver;
	Settings_Page objset;
	String label;
	
@Test
	public void SettingsTestCase() 
	{
		try {
			//training by industry
			objset=new Settings_Page(driver);
			Thread.sleep(2000);
			objset.setting();
			Thread.sleep(2000);
			String title=objset.getset_tile();
			if(title.equals("Settings"))
			{
				label="Pass";
				System.out.println("Settings menu has been opened.");
				Thread.sleep(2000);
			}
			else
			{
				label="fail";
			}
				sheet.getRow(33).getCell(4).setCellValue(label);
			
				//region 
			objset.clickregion();
			objset.clickregion_name();
			Thread.sleep(4000);
			//objset.clickregion_sel();
			objset.region_menu();
			Thread.sleep(2000);
			objset.clickchange_reg();
			if(title.equals("Settings"))
			{
				label="Pass";
				System.out.println("Region has been changed.");
				Thread.sleep(2000);
				objset.clicksignout();
				objset.clickyes();
				MobileElement home=driver.findElement(objset.get_job);
				String til=home.getText();
				if(til.equals("Jobs"))
				{
					System.out.println("User has successfully signed out from the application");
				}
				
				else
				{
					System.out.println("User has not signed out from the application");
				}
				
			}
			else
			{
				label="fail";
			}
				sheet.getRow(34).getCell(4).setCellValue(label);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable test Settings Menu.");
			System.out.println(e.getMessage());
		}	
		
		

	}
	
	
}

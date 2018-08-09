package POM;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MyTrainingModuleTest  extends excel {
	
	AppiumDriver<MobileElement> driver;
	MyTraining objmytrain;
	String label;

	@Test
	public void MytTrainingTestCase() throws InterruptedException
	{
		
		
		try {
			objmytrain=new MyTraining(driver);
			Thread.sleep(2000);
			objmytrain.mytrain();
			Thread.sleep(2000);
			String til=objmytrain.getmytil();
			if(til.equalsIgnoreCase("My Training"))
			{
				label="Pass";
				System.out.println("My training Page has been opened.");
			}
			else
			{
				label="fail";
			}
				sheet.getRow(36).getCell(4).setCellValue(label);
				
			MobileElement list_train=driver.findElement(objmytrain.train_list);
			if(list_train.isDisplayed())
			{
				MobileElement mytrain=driver.findElement(objmytrain.train_list_first);
				String mytrain_til=mytrain.getText();
			
				objmytrain.clicktrain_list_first();
				Thread.sleep(4000);
				MobileElement mytrain1=driver.findElement(objmytrain.train_first);
				String mytrain_til1=mytrain1.getText();
			
				if(mytrain_til.equals(mytrain_til1))
				{
					label="Pass";
					System.out.println("Selected my training has been opened");
				}
				else
				{
					label="fail";
				}
				
				sheet.getRow(37).getCell(4).setCellValue(label);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable test My Training Menu.");
			System.out.println(e.getMessage());
		}
		
		
	}
}

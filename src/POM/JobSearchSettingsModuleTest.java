package POM;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class JobSearchSettingsModuleTest extends excel {

	
	AppiumDriver<MobileElement> driver;
	JobSetting objsearch;
	String label;
	
	@Test(priority=1)
	public void JobSearchLocationTestCase() throws InterruptedException
	{
		//check interview tab is empty or not
		try {
			Thread.sleep(2000);
			objsearch=new JobSetting(driver);
			objsearch.jobsearchloc("4460");
			
			Thread.sleep(2000);
			MobileElement loc_title=driver.findElement(objsearch.loc_title);
			String title1=loc_title.getText();
			if(title1.equals("Set your search area"))
			{
				label="Pass";
				System.out.println("Jobs Search location tab has been clicked.");
				objsearch.clickdone();
			}
			else
			{
				label="fail";
			}
				sheet.getRow(18).getCell(4).setCellValue(label);

			String title=objsearch.gettilejob();
			if(title.equals("Jobs"))
			{
			label="Pass";
			System.out.println("Location tab has been clicked.");
			}
			else
			{
			 label="fail";
			}
			sheet.getRow(19).getCell(4).setCellValue(label);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable test Job Search Location Menu.");
			System.out.println(e.getMessage());
		}
		
	}

	@Test(priority=2)
	public void JobSearchTestCase() throws InterruptedException
	{
		
		try {
			Thread.sleep(2000);
			objsearch=new JobSetting(driver);
			objsearch.jobsearch();
			Thread.sleep(2000);;
			//objjobs.clickreset();
			Thread.sleep(4000);
			MobileElement loc_title=driver.findElement(objsearch.job_title);
			String title1=loc_title.getText();
			if(title1.equals("Set your job type"))
			{
				label="Pass";
				System.out.println("Jobs Search location tab has been clicked.");
			}
			else
			{
				label="fail";
			}
				sheet.getRow(20).getCell(4).setCellValue(label);
		}
				catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Jobs search location failed");
					System.out.println(e.getMessage());
				}
				
		  try
		  {
				objsearch.click_indus();
				Thread.sleep(4000);	
			System.out.println("Job tab has been clicked.");
			//objsearch.getrole();
			Thread.sleep(30000);
			MobileElement role_sel1=driver.findElement(objsearch.role_indus);
			String role_sel=role_sel1.getText();
			//System.out.println(role_sel);
			objsearch.clickrole_sel();
			
			objsearch.clickdone();
			Thread.sleep(6000);	
			String title=objsearch.gettilejob();
			if(title.startsWith(role_sel))
			{
			label="Pass";
			System.out.println("Selected role job has been displayed.");
			}
			else
			{
			 label="fail";
			}
			sheet.getRow(21).getCell(4).setCellValue(label);
		} 
		  catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable test Job Search Tab.");
			System.out.println(e.getMessage());
		}
		
	}
	@Test(priority=3)
	public void JobSearchpPayTestCase() throws InterruptedException
	{
		//check interview tab is empty or not
		try {
			objsearch=new JobSetting(driver);
			Thread.sleep(2000);
			objsearch.jobsearchpay();
			Thread.sleep(2000);
			MobileElement loc_title=driver.findElement(objsearch.pay_title);
			String title1=loc_title.getText();
			if(title1.equals("Set your pay range"))
			{
				label="Pass";
				System.out.println("Pay tab has been clicked.");
				Thread.sleep(2000);
				objsearch.clickdone();
			}
			else
			{
				label="fail";
			}
				sheet.getRow(22).getCell(4).setCellValue(label);
			Thread.sleep(2000);
			String title=objsearch.gettilejob();
			if(title.equals("Jobs"))
			{
			label="Pass";
			System.out.println("Pay tab search is successfull.");
			}
			else
			{
			 label="fail";
			}
			sheet.getRow(23).getCell(4).setCellValue(label);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable test Job Search Pay Tab.");
			System.out.println(e.getMessage());
		}
		
	}
	
}

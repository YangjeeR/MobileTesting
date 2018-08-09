package POM;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class JobFeedModuleTest extends excel {
	
	AppiumDriver<MobileElement> driver;
	JobsFeed objjobs;
	Application_Page objapp;
	String label;
	String main_jobtitle;
	String mainjobs;

	
	@Test(priority=2)
	public void JobsFeedTestCase() throws InterruptedException
	{
		try {
			objjobs=new JobsFeed(driver);
			
			objjobs.jobs();
			objjobs.clickrefine();
			objjobs.clickreset();
			Thread.sleep(15000);
			
			objjobs.clickfirstjob();

			MobileElement jobapp=driver.findElement(objjobs.applyjob);
			if(jobapp.isDisplayed())
			{
				label="Pass";
				System.out.println("Job Feed has been successfully opened.");
			}
			else
			{
				label="fail";
			}
			sheet.getRow(15).getCell(4).setCellValue(label);
			Thread.sleep(3000);
			
			MobileElement label_job=driver.findElement(objjobs.label_jobs);
			objjobs.clickapply();
			Thread.sleep(15000);
		

			if(label_job.isDisplayed())
{
				
			System.out.println("Job has already been applied.");
			int i=2;
			do {
				if(label_job.isDisplayed())
					
					{
					
					objjobs.clickcontrol();
					
				    	 objjobs.clickmenu();
				    	 objjobs.clickjobs();
				    	// System.out.println(i);
				    	 MobileElement jobs=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView"));;
				    	 jobs.click();
				    	 objjobs.clickapply();
				    	 i++;
				    	 Thread.sleep(4000);
			
				    	 if(!label_job.isDisplayed())
				    		{
				    		 String link=objjobs.getapptitle();
				    
				  			  System.out.println(link);
				        		if(link.equalsIgnoreCase("Job page"))
								
				            {
				        		    main_jobtitle=objjobs.getjob_main_title();
				        			label="Pass";
				        			verticalSwipe();
				        			Thread.sleep(2000);
				        			driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/et_job_application_information_to_the_recruiter")).sendKeys("Hi I am thankful");
				        			driver.hideKeyboard();
				        			verticalSwipe();
				        			Thread.sleep(2000);
				        			objjobs.clicksend_app();
				        			Thread.sleep(2000);
				        			String til=objjobs.getapp();
				        			
				        			if(til.equalsIgnoreCase("Your application has been sent"))
				        			{
				        				label="Pass";
				        				System.out.println("Selected Application has been applied.");
				        				
				        			}
				        			else
				        			{
				        				label="Fail";
				        			}
				        	    }
				
				    	 	
				    		}
					}
			}while(label_job.isDisplayed());
}
 	   else
				  {
					 Thread.sleep(10000); 
				   String link=objjobs.getapptitle();
				   System.out.println(link);
					if(link.equalsIgnoreCase("Job page"))
					
						{
						 main_jobtitle=objjobs.getjob_main_title();
						label="Pass";
						Thread.sleep(2000);
						driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/et_job_application_information_to_the_recruiter")).sendKeys("Hi I am thankful");
						driver.hideKeyboard();
						verticalSwipe();
						Thread.sleep(2000);
						objjobs.clicksend_app();
						Thread.sleep(10000);
						String til=objjobs.getapp();
						
						if(til.equalsIgnoreCase("Your application has been sent"))
						{
							label="Pass";
							System.out.println("Selected Application has been applied.");
							
						}
						else
						{
							label="Fail";
						}
						
						}
			    } 

			sheet.getRow(16).getCell(4).setCellValue(label);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable test Job Feed Menu.");
			
			System.out.println(e.getMessage());
		}
		
       		
		
}
	


public void verticalSwipe() throws InterruptedException {
		
		Dimension dim=driver.manage().window().getSize();
		int height=dim.getHeight();
		int width=dim.getWidth();
		int x= width/2;
		int starty=(int)(height*0.80);
		int endy=(int)(height*0.20);
		driver.swipe(x, starty, x, endy, 2000);
		//driver.swipe(x, endy, x, starty, 3000);
		Thread.sleep(2000);
	}

}


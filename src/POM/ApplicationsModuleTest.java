package POM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ApplicationsModuleTest  {

	AppiumDriver<MobileElement> driver;
	Application_Page objapp;
	String label;
	JobFeedModuleTest objjobs;
	
	@Test(priority=1)
	public void ApplicationTestCase() throws InterruptedException
	{
		
		
		try {
			objapp=new Application_Page(driver);
			
			objapp.jobs();
			
			//after clicking Application Menu
			String link=objapp.gettil();

			if(link.equals("Your job applications"))
			{
			
			System.out.println("Application Menu is successfully displayed.");
			}
			else
			{

				System.out.println("Application Menu hasnot been displayed.");
				
			}

			Thread.sleep(6000);
			


			/*String mess=objapp.no_mess();
			//MobileElement display=driver.findElement(objapp.jobsview);
			if(mess.equals("When you apply for a job, your application will be shown here. Unfortunately, you don't have any valid applications."))
			{
			*/
			//check added application from job feed exists in application list or not
				/*List<MobileElement> listapp=driver.findElements(objapp.app_list);
				if(listapp.contains(mainjobs))
				{
					System.out.println("Application added from Job Feed successfully");
				}
				else
				{
					System.out.println("No application added from job feed found");
				}*/
					
MobileElement listview=driver.findElement(objapp.app_list);

//check application tab is empty or not
if(listview.isDisplayed())
{
			System.out.println("Application list has been opened");
			 String view1=objapp.getviewtil();
			objapp.clickview();
			Thread.sleep(3000);
			//click view
			objapp.clickviewnow();
			String view2=objapp.getviewtil();
			   if(view2.equals(view1))
				{
				label="Pass";
				System.out.println("Selected application has been opened");
				Thread.sleep(4000);
				String appclosed=objapp.getclosed();
				if(!appclosed.equalsIgnoreCase("Closed"))
				{
				verticalSwipe();
				objapp.clickapp_cancel();//to cancel app
				objapp.clickappyes();
				objapp.clickappok();
				System.out.println("Selected application has been canceled");
				}
				Thread.sleep(4000);
				//objapp.jobs();
				}
				else
				{
					System.out.println("Selected application hasnot been opened.");

				}
			  }
else
{
			System.out.println("No Application lists to display.");

			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable test Application Menu.");
			System.out.println(e.getMessage());

		}	
	

	}
	

	
@Test(priority=2)
	public void InterviewTestCase()
	{
		//check interview tab is empty or not
		try {
			objapp.clickint();
			driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
			System.out.println("Interivew tab has been clicked.");
			
			MobileElement tab=driver.findElement(objapp.int_view);
			if(tab.isDisplayed())
			{
			/*if(mess.equals("When your application is approved for an interview, your interview details will be shown here. Unfortunately, you currently don't have any valid interviews."))
			{
			*/
			System.out.println("No interview lists to display.");

			}
			else
			{
				System.out.println(" interview lists are displayed.");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable test Interview Tab.");
			System.out.println(e.getMessage());
		}
		
	}

@Test(priority=3)
public void OfferTestCase()
{
	//check interview tab is empty or not
	try {
		objapp.clickoffer();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		System.out.println("Offer tab has been clicked.");
		MobileElement tab=driver.findElement(objapp.offer_tab_list);
		if(tab.isDisplayed())
		{
		/*String mess=objapp.getofftil();
		
		if(mess.equals("When your application is successful and you have been offered the job, your job offer details will be shown here. Unfortunately, you currently don't have any valid job offers."))
		{*/
		System.out.println("No offer lists to display.");
		label="Pass";
		}
		else
		{
		 label="fail";
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Unable test Offer Tab.");
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

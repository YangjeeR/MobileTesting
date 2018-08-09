package POM;

import static org.testng.Assert.assertEquals;


import java.io.File;
import java.io.IOException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


public class HiupTest_{
	
	AppiumDriver<MobileElement> driver;
	String path;
	Login_Page objLogin;
	Logout_Page objlogout;
	String label;
	ElementsPath obj;
	Signup_Page signobj;
	Forget_Page objForget;
	JobsFeed objjobs;
	Application_Page objapp;
	JobSetting objsearch;
	Training_Page objtrain;
	Wallet_Page objwallet;
	Settings_Page objset;
	MyTraining objmytrain;

	@Test(priority=1,description="Creating App session Test Case")
	public void setup_server( ) throws IOException, InterruptedException
	{
		objLogin = new Login_Page(driver);
		System.out.println("Session is creating");

	 path=System.getProperty("user.dir");
	 DesiredCapabilities cap=new DesiredCapabilities();
	 cap.setCapability("platformName","Android");
	 cap.setCapability("deviceName", "Galaxy S6"); 
	 cap.setCapability("platformVersion", "6.0");
	 cap.setCapability("autoAcceptAlerts",true);
	 cap.setCapability("noReset",true);
	 //cap.setCapability("newCommandTimeout", 120);
	 cap.setCapability("app",path+"\\app\\Hiup_2.2.1_65.apk");
     cap.setCapability("unicodeKeyboard", true);//hide keywords
     
    
    
	 try
 {
	 
 driver= new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
 System.out.println("Session is created");   

	 Thread.sleep(3000);
	 }

 catch(Exception e)
 {
	 System.out.println("Unable to open application.");
		 System.out.println(e.getMessage());
 }
 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 
	
	}
	

	////@Test(priority=2,description="Login Test Case")
	public void LoginTestCase()
	{
	
		
	
	try {
		
		objLogin = new Login_Page(driver);
	    
		String email="jmeter2012@gmail.com";
		
		objLogin.loginmain(email, "y@nzEE2018");
		Thread.sleep(30000);
	   // verify title
        objLogin.prof();
        Thread.sleep(2000);
		String til = objLogin.gettitle();
	   // Assert.assertTrue(til.contains(email));
		
	    if(til.equals(email))
	    {
	    	System.out.println("Successfully logged in");

	    }
	    else
	    {
	    	System.out.println("Login failed");

	   	 
	    }
	  //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	 catch(Exception e) {
		 System.out.println("Unable to login");
		 System.out.println(e.getMessage());
		 objLogin.clickclose();
		 objLogin.clickcan();
	 }
	
	
	}
    

	//@Test(priority=19,description="Logout Test Case")
	public void LogoutTestCase()
	{
		try
		{
		
		objlogout=new Logout_Page(driver);
		
		objlogout.logout();
		
		String link=objlogout.gettitle();

		if(link.equals("Refine"))
		{
		System.out.println("Successfully logged out");
		
		}
		else
		{
			System.out.println("Unable to log out");

		}

	}

		catch(Exception e)
		{
			System.out.println("Unable to logout");
			System.out.println(e.getMessage());
			objlogout.clickclose();
			objlogout.clickcan();
		}
	
	}

@Test(priority=24)
	public void ForgetTestCase()
	{
		//driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);	
		try
		{
		objForget=new Forget_Page(driver);
		
		objForget.forget("jmeter1234@gmail.com");
		
		Thread.sleep(5000);
		String link=objForget.getresettil();

		if(link.equals("Email sent"))
		{
	
		System.out.println("Reset link has been sent in mentioned email address.");
		objForget.reset_ok();
		Thread.sleep(5000);
		objForget.clickclose();
		}
		else
		{
		System.out.println("Reset link hasnot been sent");
			
		}

	}

catch(Exception e)
{
	System.out.println("Unable to reset password");
	System.out.println(e.getMessage());
	objForget.clickclose();
	objForget.clickcan();
}

}
	
	
@Test(priority=21,description="Sign Up Test Case")
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
		
		}
	catch (Exception e)
	{
		System.out.println("Unable to sign in new user.");
		System.out.println(e.getMessage());
	}
	
	}

////@Test(priority=3)
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
				System.out.println("Job Feed has been successfully opened.");
			}
			else
			{
				label="fail";
			}

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
				    	 Thread.sleep(15000);
			
				    	 if(!label_job.isDisplayed())
				    		{
				    		 String link=objjobs.getapptitle();
				    
				  			  System.out.println(link);
				        		if(link.equalsIgnoreCase("Job page"))
								
				            {
				        			label="Pass";
				        			verticalSwipe();
				        			Thread.sleep(2000);
				        			driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/et_job_application_information_to_the_recruiter")).sendKeys("Hi I am thankful");
				        			driver.hideKeyboard();
				        			verticalSwipe();
				        			Thread.sleep(2000);
				        			objjobs.clicksend_app();
				        			Thread.sleep(20000);
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
					 Thread.sleep(15000); 
				   String link=objjobs.getapptitle();
				   System.out.println(link);
					if(link.equalsIgnoreCase("Job page"))
					
						{
						label="Pass";
						Thread.sleep(2000);
						driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/et_job_application_information_to_the_recruiter")).sendKeys("Hi I am thankful");
						driver.hideKeyboard();
						verticalSwipe();
						Thread.sleep(2000);
						objjobs.clicksend_app();
						Thread.sleep(40000);
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


		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable test Job Feed Menu.");
			
			System.out.println(e.getMessage());
		}
       		
		
}
	
	
//@Test(priority=4)
	public void ApplicationTestCase() throws InterruptedException
	{
		
		
		try {
			objapp=new Application_Page(driver);
			
			objapp.jobs();
			
			//after clicking Application Menu
			String link=objapp.gettil();

			if(link.equals("Your job applications"))
			{
			label="Pass";
			System.out.println("Application Menu is successfully displayed.");
			}
			else
			{

			label="Fail";
				
			}
			driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
			Thread.sleep(5000);


			/*String mess=objapp.no_mess();
			//MobileElement display=driver.findElement(objapp.jobsview);
			if(mess.equals("When you apply for a job, your application will be shown here. Unfortunately, you don't have any valid applications."))
			{
			*/
			
/*MobileElement listview=driver.findElement(objapp.app_list);

//check application tab is empty or not
if(listview.isDisplayed())
{
			System.out.println("Application list has been opened");
			 String view1=objapp.getviewtil();
			objapp.clickview();
			//click view
			objapp.clickviewnow();
			String view2=objapp.getviewtil();
			   if(view2.equals(view1))
				{
				label="Pass";
				//verticalSwipe();
				System.out.println("Selected application has been opened");
				driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
				
				Thread.sleep(4000);
				objapp.jobs();
				}
				else
				{

				label="Fail";	
				}
			  }
else
{
			System.out.println("No Application lists to display.");
			label="Pass";
			}*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable test Application Menu.");
			System.out.println(e.getMessage());
			}
		
	}
//@Test(priority=8)
	public void InterviewTestCase()
	{
		//check interview tab is empty or not
		try {
			objapp.clickint();
			driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
			System.out.println("Interivew tab has been clicked.");
			
			MobileElement tab=driver.findElement(objapp.int_view);
			if(tab.isDisplayed())
			{
			/*if(mess.equals("When your application is approved for an interview, your interview details will be shown here. Unfortunately, you currently don't have any valid interviews."))
			{
			*/
			System.out.println("No interview lists to display.");
			label="Pass";
			}
			else
			{
			 label="fail";
			}
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable test Interview Tab.");
			System.out.println(e.getMessage());
		}
		
	}
//@Test(priority=9)
	public void OfferTestCase()
	{
		//check interview tab is empty or not
		try {
			objapp.clickoffer();
			driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
			System.out.println("Offer tab has been clicked.");
			MobileElement tab=driver.findElement(objapp.offer_tab_list);
			if(tab.isDisplayed())
			{
			/*String mess=objapp.getofftil();
			
			if(mess.equals("When your application is successful and you have been offered the job, your job offer details will be shown here. Unfortunately, you currently don't have any valid job offers."))
			{
			System.out.println("No offer lists to display.");*/
			label="Pass";
			}
			else
			{
			 label="fail";
			}
			Thread.sleep(5000);
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

//@Test(priority=10)
public void JobSearchLocationTestCase() throws InterruptedException
{
	//check interview tab is empty or not
	try {
		Thread.sleep(2000);
		objjobs.clickrefine();
		objjobs.clickreset();
		Thread.sleep(15000);
		objjobs.jobs();
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
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Unable test Job Search Location Menu.");
		System.out.println(e.getMessage());
	}
	
}

//@Test(priority=11)
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
	
	}
			catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Jobs search location failed");
				System.out.println(e.getMessage());
			}
			
	  try
	  {
			objsearch.click_indus();
			Thread.sleep(2000);
			objsearch.click_indus2();
			Thread.sleep(4000);	
		System.out.println("Job tab has been clicked.");
		//objsearch.getrole();
		//MobileElement role_sel1=driver.findElement(objsearch.role_indus2);
		//String role_sel=role_sel1.getText();
		//System.out.println(role_sel);
		//objsearch.clickrole_sel();
		
		objsearch.clickdone();
		Thread.sleep(10000);	
		String title=objsearch.gettilejob();
		if(title.contains("Engineer"))
		{
		label="Pass";
		System.out.println("Selected role job has been displayed.");
		}
		else
		{
		 label="fail";
		}

	} 
	  catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Unable test Job Search Tab.");
		System.out.println(e.getMessage());
	}
	
}
//@Test(priority=12)
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

	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Unable test Job Search Pay Tab.");
		System.out.println(e.getMessage());
	}
	
}

//@Test(priority=13)
public void TrainingTestCase() throws InterruptedException
{
	try {
		//training by industry
		objtrain=new Training_Page(driver);
		Thread.sleep(2000);
		objtrain.training();
		Thread.sleep(2000);
		MobileElement loc_title=driver.findElement(objtrain.train_title);
		String title1=loc_title.getText();
		if(title1.equals("Training"))
		{
			label="Pass";
			System.out.println("Training menu has been opened.");
			Thread.sleep(2000);
		}
		else
		{
			label="fail";
		}

	}
	
	catch(Exception e)
	{
		System.out.println("Unable to open training menu");
		System.out.println(e.getMessage());
	}
     try
     {
		objtrain.clickcourse();//courses by industry
		Thread.sleep(9000);
		
		objtrain.selindus();//hardcoded industry
		Thread.sleep(10000);
		//objtrain.clickcourseindust();
		//Thread.sleep(3000);
		
		  //Identify all the elements on web page
		java.util.List<MobileElement> allElements = driver.findElements(objtrain.row_course);
   
		//Count the total all element on web page
		int linkListCount = allElements.size();

		for(int i=1;i<=linkListCount;i++)

{
		MobileElement sel_course=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout["+i+"]/android.widget.RelativeLayout"));
				//("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout["+i+"]/android.widget.RelativeLayout/android.widget.TextView[1]"));
		String price=sel_course.findElement(objtrain.price).getText();
		
		//System.out.println(price);
			if(price.equalsIgnoreCase("Free"))
			{
			sel_course.click();
			Thread.sleep(4000);
			MobileElement enroll=driver.findElement(objtrain.enroll);
			objtrain.clickenroll();
			Thread.sleep(7000);
			if(enroll.isDisplayed())
				{
				System.out.println("Course has already been purchased.");
				objtrain.training();
				Thread.sleep(2000);
				objtrain.clickcourse();//courses by industry
				Thread.sleep(7000);
				objtrain.selindus();
				Thread.sleep(9000);
			
			
				}
				else
					{
						String text=objtrain.getmess();
							if(text.equalsIgnoreCase("Thank you for your purchase"))
							{
								label="Pass";
								System.out.println("Course has been successfully purchased.");
							}
							else
							{
								label="Fail";	
							}
						break;
					}
			}
		
			
		else
		{
		sel_course.click();
		objtrain.clickenroll();
		objtrain.click_purchase();
		objtrain.setcardnum("4242424242424242");
		objtrain.clickcarddate();
		MobileElement month=driver.findElement(objtrain.card_month);
		month.click();
		MobileElement year=driver.findElement(objtrain.card_month);
		year.click();
		driver.hideKeyboard(); // keyword next or enter btn
		objtrain.click_ok();
		objtrain.setcardcvv("123");
		driver.hideKeyboard();
		MobileElement pay=driver.findElement(objtrain.pay);
		objtrain.click_pay();
		Thread.sleep(15000);
		
		if(pay.isDisplayed())
		{
			System.out.println("Course has already been purchased.");
		}
		else
		{

		String text=objtrain.getmess();
		if(text.equalsIgnoreCase("Thank you for your purchase"))
		{
			label="Pass";
			System.out.println("Course has been successfully purchased.");
		}
		else
		{
		 label="Fail";	
		 }
		break;
		 }
		}
		
}
	
     }
     
     catch(Exception e)
 	{
 		System.out.println("Unable to apply training course");
 		System.out.println(e.getMessage());
 	}
     
     try
     {
		Thread.sleep(2000);
		
		 // my courses
		objtrain.training();
		objtrain.clickmy_course();
		Thread.sleep(4000);
		MobileElement title=driver.findElement(objtrain.my_course_list);
		String text=title.getText();
		if(text.equals("My training"))
		{
			label="Pass";
			System.out.println("My courses list has been opened.");
		}
		else
		{
			label="fail";
		}
		
     }
    catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Unable open my course menu.");
		System.out.println(e.getMessage());
	}
	
	}

//@Test(priority=14)
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
			

		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Unable test My Training Menu.");
		System.out.println(e.getMessage());
	}
	
	
}

//@Test(priority=15)
public void WalletTestCase() throws InterruptedException
{
	try {
		//training by industry
		objwallet=new Wallet_Page(driver);
		Thread.sleep(2000);
		objwallet.wallet();
		Thread.sleep(2000);
		MobileElement loc_title=driver.findElement(objwallet.wal_til);
		String title1=loc_title.getText();
		if(title1.equals("My wallet"))
		{
			label="Pass";
			System.out.println("Wallet menu has been opened.");
			Thread.sleep(5000);
		}
		else
		{
			label="fail";
		}
		
			
		Thread.sleep(2000);
		objwallet.clickadd();
		Thread.sleep(3000);
		//MobileElement cert=driver.findElement(By.xpath("//android.widget.TextView[@text='Monkey westling']"));
		MobileElement cert=driver.findElement(objwallet.doc);
		String doc=cert.getText();
		cert.click();
		
		Thread.sleep(3000);
		objwallet.clickpic();
		Thread.sleep(3000);
		objwallet.clickcapture();
		Thread.sleep(3000);
		objwallet.clicksave();
		Thread.sleep(15000);
		/*MobileElement gallery=driver.findElement(By.xpath("//android.widget.Button[@text='Gallery']"));
		gallery.click();
		MobileElement gallery_mob=driver.findElement(By.xpath("//android.widget.TextView[@text='Gallery']"));
		gallery_mob.click();*/
			if(title1.equals("My wallet"))
		{
			label="Pass";
			System.out.println("Document has been attached.");

		}
		else
		{
			label="fail";
		}
		
			Thread.sleep(2000);
		//certificate
		objwallet.clickcerty();
		Thread.sleep(8000);
		String tile=objwallet.gettile();
		if(tile.equalsIgnoreCase(doc))
		{
			label="Pass";
			System.out.println("Certificate tab has been opened.");
		}
		
		else
		{
			label="fail";
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Unable test Wallet Menu.");
		System.out.println(e.getMessage());
	}
	
	
} 

//@Test(priority=16)
public void SettingsTestCase() throws InterruptedException
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
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Unable test Settings Menu.");
		System.out.println(e.getMessage());
	}	
	
	

}

////@Test(priority=17)
	public void LoginValidTestCase() throws IOException, TesseractException, InterruptedException
	{
	
	driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);	
		
	objLogin = new Login_Page(driver);
	
	objLogin.login_valid("jmeter12345@gmail.com", "y@nzEE2018");
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 System.out.println(scrFile);
	 
	FileUtils.copyFile(scrFile, new File("C:\\Users\\Acer\\Desktop\\screenshot\\screenshot.jpg"));


	// get the Tesseract direct interace
    Tesseract instance = new Tesseract();

    // the doOCR method of Tesseract will retrive the text
    // from image captured by Selenium
    String result = instance.doOCR(scrFile);
    System.out.println(result);

    // check the the result
    assertEquals("Email or password is incorrect", "Your email or password seems to be incorrect", result.trim());

/*
 	 
  }
  driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
  
  sheet.getRow(2).getCell(4).setCellValue(label);		
	}
	*/

}

	@Test(priority=22,description="Logout Test Case")
	public void Logout2TestCase()
	{
		try
		{
		
		objlogout=new Logout_Page(driver);
		
		objlogout.logout();
		
		String link=objlogout.gettitle();

		if(link.equals("Refine"))
		{
		System.out.println("Successfully logged out");
		
		}
		else
		{
			System.out.println("Unable to log out");

		}

	}

		catch(Exception e)
		{
			System.out.println("Unable to logout");
			System.out.println(e.getMessage());
			objlogout.clickclose();
			objlogout.clickcan();
		}
	
	}

}

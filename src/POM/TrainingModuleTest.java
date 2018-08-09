package POM;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TrainingModuleTest extends excel {
	
	AppiumDriver<MobileElement> driver;
	Training_Page objtrain;
	String label;
	
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
			sheet.getRow(25).getCell(4).setCellValue(label);
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
			MobileElement pay=driver.findElement(objtrain.pay);
			objtrain.click_pay();
			Thread.sleep(10000);
			
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
			sheet.getRow(26).getCell(4).setCellValue(label);
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
				sheet.getRow(27).getCell(4).setCellValue(label);
	     }
	    catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable open my course menu.");
			System.out.println(e.getMessage());
		}
		
	     //match purchased course title with my course list title
		}


}

package POM;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class JobsFeed {
	
AppiumDriver<MobileElement> driver;
ElementsPath obj=new ElementsPath();

	 
By control=By.id(obj.control_btn1);
By menu = By.xpath(obj.main_menu2);
By jobsfeed=By.xpath(obj.jobsfeed);
By firstjob=By.xpath(obj.firstjob);
By applyjob=By.id(obj.applynow);
By applytil=By.id(obj.applytil);
By app_til=By.id(obj.app_til);
By recruit=By.id(obj.recruit);
By refine=By.id(obj.refine);
By reset_jobs=By.id(obj.jobs_reset);
By njobs=By.xpath(obj.njobs);
By label_jobs=By.id(obj.label_jobs);
By back_to_job=By.id(obj.back_to_job);
By view_applic=By.id(obj.view_applic);
By send_app=By.id(obj.send_app);
By app_sent=By.id(obj.app_sent);
By job_main_title=By.id(obj.job_main_title);


public JobsFeed(AppiumDriver<MobileElement> driver2)
{
	
	this.driver=driver2;
}

public void clickcontrol() 
{
driver.findElement(control).click();

}

public void clicksend_app()
{
	driver.findElement(send_app).click();
}

public void clickmenu() 
{
	 driver.findElement(menu).click();
}

public void clickjobs()
{
	driver.findElement(jobsfeed).click();
}

public void clickfirstjob()
{
	driver.findElement(firstjob).click();
}

public void clickapply()
{
	driver.findElement(applyjob).click();
}

public String getjobtil()
{
	return driver.findElement(applyjob).getText();
}

public void otherjobs()
{
	driver.findElement(njobs).click();
	
}

public String getapptitle()
{
	return driver.findElement(app_til).getText();
}

public String getapp()
{
	return driver.findElement(app_sent).getText();
}

public void clickrefine()
{
	driver.findElement(refine).click();
}

public void clickreset()
{
	driver.findElement(reset_jobs).click();
}

public String getjob_main_title()
{
	return driver.findElement(job_main_title).getText();
}
//back to application
//view your application
//application has three tabs application,interviews,offer
//application tab shows all applied job,click view and apply,application is ready message is poped out and particular application is removed


public void jobs()
{
this.clickcontrol();
this.clickmenu();
this.clickjobs();
//this.clickfirstjob();
//this.clickapply();
}

}

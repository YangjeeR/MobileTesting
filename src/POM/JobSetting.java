package POM;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class JobSetting {
	
	
	AppiumDriver<MobileElement> driver;
	ElementsPath obj=new ElementsPath();

		 
	By control=By.id(obj.control_btn1);
	By menu = By.xpath(obj.main_menu2);
	By jobsearch=By.xpath(obj.jobsearch);
	By locat=By.id(obj.locat);
	By postcode=By.id(obj.postcode);
	By done=By.id(obj.done);
	By jobtab=By.id(obj.jobtab);
	By role=By.id(obj.role);
	By get_job=By.id(obj.get_job);
	By role_tile=By.id(obj.role_tile);
	By sel_role=By.xpath(obj.sel_role);
	By paytab=By.id(obj.paytab);
	By range=By.id(obj.range);
	By box=By.id(obj.checkbox);
	By loc_title=By.id(obj.loc_title);
	By job_title=By.id(obj.job_title);
	By pay_title=By.id(obj.pay_title);
	By role_sel=By.xpath(obj.role_sel);
	By role_jobs=By.id(obj.role_jobs);
	By role_indus=By.id(obj.industry);
	By role_indus2=By.xpath(obj.industry1);
	By reset_jobs=By.id(obj.jobs_reset);


	
	public JobSetting(AppiumDriver<MobileElement> driver2)
	{
		
		this.driver=driver2;
	}

	public void clickcontrol() 
	{
	driver.findElement(control).click();

	}

	public void clickmenu() 
	{
		 driver.findElement(menu).click();
	}

	public void clickjobs()
	{
		driver.findElement(jobsearch).click();
	}

	public void setpost(String code)
	{
		driver.findElement(postcode).sendKeys(code);
		
	}

	public void clickdone()
	{
		driver.findElement(done).click();
	}

	public void clickjobtab()
	{
		driver.findElement(jobtab).click();
	}
	
	public void clickrole()
	{
		driver.findElement(role).click();
	}

	public String gettilejob()
	{
		return driver.findElement(get_job).getText();
	}
	
	public void getrole() 
	{
		 driver.findElement(sel_role).click();
	}
	
	public void clickselrole()
	{
		driver.findElement(role_tile).click();
	}
	public void clickpaytab()
	{
		driver.findElement(paytab).click();
	}
	public void clickrange()
	{
		driver.findElement(range).click();
	}
	public void clickcheckbox()
	{
		driver.findElement(box).click();
	}
	
	public void clickrole_sel()
	{
		driver.findElement(role_indus).click();
	}
	
	public String getrole_jobs()
	{
		return driver.findElement(role_jobs).getText();
	}
	
	public void click_indus()
	{
		driver.findElement(role_indus).click();
	}
	
	public void clickreset()
	{
		driver.findElement(reset_jobs).click();
	}
	
	public void click_indus2()
	{
		driver.findElement(role_indus2).click();
	}
	
public void jobsearchloc(String code) throws InterruptedException
{
	this.clickcontrol();
	this.clickmenu();
	this.clickjobs();
	Thread.sleep(3000);
	this.clickreset();
	Thread.sleep(15000);
	this.clickcontrol();
	this.clickmenu();
	this.clickjobs();
	this.setpost(code);
	driver.hideKeyboard();
	
}

public void jobsearch() throws InterruptedException
{
	this.clickcontrol();
	this.clickmenu();
	this.clickjobs();
	this.clickjobtab();
	this.clickreset();
	Thread.sleep(15000);
	this.clickcontrol();
	this.clickmenu();
	this.clickjobs();
	this.clickjobtab();
	Thread.sleep(4000);
	
}

public void jobsearchpay() throws InterruptedException
{
	this.clickcontrol();
	this.clickmenu();
	this.clickjobs();
	this.clickreset();
	Thread.sleep(15000);
	this.clickcontrol();
	this.clickmenu();
	this.clickjobs();
	this.clickpaytab();
	this.clickrange();
	this.clickcheckbox();
	
	
}
}

package POM;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Settings_Page {

	AppiumDriver<MobileElement> driver;
	ElementsPath obj=new ElementsPath();
	By control=By.id(obj.control_btn1);
	By menu = By.xpath(obj.main_menu2);
	By setting=By.xpath(obj.setting);
	By set_tile=By.id(obj.set_tile);
	By region=By.id(obj.region);
	By region_name=By.id(obj.region_name);
	By region_sel=By.xpath(obj.region_sel);
	By change_reg=By.id(obj.change_reg);
	By signout=By.id(obj.signout);
	By yesout=By.id(obj.yesout);
	By get_job=By.id(obj.get_job);
	By reset_jobs=By.id(obj.jobs_reset);
	By refine=By.id(obj.refine);
	By region_menu=By.xpath(obj.region_menu);
			
	public Settings_Page(AppiumDriver<MobileElement> driver2)
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

	public void clicksetting()
	{
		driver.findElement(setting).click();
	}
	

	public String getset_tile()
	{
		return driver.findElement(set_tile).getText();
	}
	
	public void clickregion()
	{
		driver.findElement(region).click();
	}
	
	public void clickregion_name()
	{
		driver.findElement(region_name).click();
	}
	

	public void clickregion_sel()
	{
		driver.findElement(region_sel).click();
	}
	

	public void clickchange_reg()
	{
		driver.findElement(change_reg).click();
	}
	
	public void clicksignout()
	{
		driver.findElement(signout).click();
	}
	
	public void clickyes()
	{
		driver.findElement(yesout).click();
	}
	

	
	public void clickrefine()
	{
		driver.findElement(refine).click();
	}
	
	public void region_menu()
	{
		driver.findElement(region_menu).click();
	}
	
	
	public void setting()
	{
	 this.clickcontrol();
	 this.clickmenu();
	 this.clicksetting();
	}
	
}

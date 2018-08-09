package POM;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Logout_Page extends ElementsPath{
	
	
 AppiumDriver<MobileElement> driver;
 ElementsPath obj=new ElementsPath();
 
 By control=By.id(obj.control_btn1);
 By menu = By.xpath(obj.main_menu2);
 By log=By.xpath(obj.log);
 By log_yes=By.id(obj.log_yes);
 By get_refine=By.id(obj.refine);
 By close=By.id(obj.close);
 By cancel=By.xpath(obj.cancel);
 
 public Logout_Page(AppiumDriver<MobileElement> driver2) 
 {
 	this.driver=driver2;
 	
 }
 public void clickcontrol() 
  {
  driver.findElement(control).click();

  }
 
 public void clickcan() 
 {
	 driver.findElement(cancel).click();
 }
 
 
 public void clickmenu() 
 {
	 driver.findElement(menu).click();
 }
 
 public void clicklog() 
 {
	 driver.findElement(log).click();
 }
 
 public void clickyes()
 
 {
	 driver.findElement(log_yes).click();
 }

 public String gettitle()
 {
	 return driver.findElement(get_refine).getText();
 }
 
	public void clickclose()
	{
		driver.findElement(close).click();
		
	}
	
 
 public void logout()
 {
	 this.clickcontrol();
	 this.clickmenu();
	 this.clicklog();
	 this.clickyes();
	 
 }
}

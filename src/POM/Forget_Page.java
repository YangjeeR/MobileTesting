package POM;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class Forget_Page extends Login_Page{
	
	AppiumDriver<MobileElement> driver;
	 ElementsPath obj=new ElementsPath();
	 Login_Page Login_obj;
	 
	 By forget=By.id(obj.forget);
	 By menu=By.xpath(obj.main_menu2);
	 By reset_email=By.id(obj.reset);
	 By reset_til=By.id(obj.reset_til);
	 By reset_ok=By.id(obj.reset_ok);
	 By reset_btn=By.id(obj.reset_btn);
	 By close=By.id(obj.close);
	 By cancel=By.xpath(obj.cancel);
	 
	 
	public Forget_Page(AppiumDriver<MobileElement> driver2) {
		super(driver2);
		this.driver=driver2;
	}
	public void clickforget()
	{
		driver.findElement(forget).click();
	}
	
	public String getForgetTitle()
	{
		return driver.findElement(forget).getText();
	}
	public void reset_email(String email)
	{
		driver.findElement(reset_email).sendKeys(email);
	}
	public String getresettil()
	{
		return driver.findElement(reset_til).getText();
	}
	public void reset_ok()
	{
		driver.findElement(reset_ok).click();
	}
	
	public void reset_btn()
	{
		driver.findElement(reset_btn).click();
		
	}
	
	 public void clickcan() 
	 {
		 driver.findElement(cancel).click();
	 }
	 
	 
	public void clickclose()
	{
		driver.findElement(close).click();
		
	}
	 public void clickmenu2() 
	 {
		 driver.findElement(menu).click();
	 }
	 
	 public void forget(String email)
	 {

			
	 clickcontrol();
	 this.clickmenu2();
	 clickprof();
	 clicklogin();
     this.clickforget();	
	 this.reset_email(email);
	 driver.hideKeyboard();
	 this.reset_btn();
	 }


}

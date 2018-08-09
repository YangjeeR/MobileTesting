package POM;

import org.openqa.selenium.By;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Wallet_Page {
	
	AppiumDriver<MobileElement> driver;
	ElementsPath obj=new ElementsPath();
	By control=By.id(obj.control_btn1);
	By menu = By.xpath(obj.main_menu2);
	By wallet=By.xpath(obj.wallet);
	By wal_til=By.id(obj.wal_til);
	By tab_certy=By.id(obj.tab_certy);
	By add_doc=By.id(obj.add_doc);
	By take_pic=By.id(obj.take_pic);
	By capture=By.id(obj.capture);
	By save=By.id(obj.save);
	By cert_title=By.id(obj.cert_title);
	By doc=By.xpath(obj.doc);
	By wallet_asset=By.xpath(obj.wallet_assest);
	By cer_til=By.id(obj.cer_til);
	
	
	public Wallet_Page(AppiumDriver<MobileElement> driver2)
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

	public void clickwallet()
	{
		driver.findElement(wallet).click();
	}

	public void clickcerty()
	{
		driver.findElement(tab_certy).click();
	}
	
	public String cert_list()
	{
		return driver.findElement(By.xpath("//android.widget.TextView[@text='Monkey westling']")).getText();
	}
	
	
	public void clickadd()
	{
		driver.findElement(add_doc).click();
	}
	
	public void clickpic()
	{
		driver.findElement(take_pic).click();
	}
	
	public void clickcapture()
	{
		driver.findElement(capture).click();
	}
	
	public void clicksave()
	{
		driver.findElement(save).click();
	}
	
	public String gettile()
	{
		return driver.findElement(cert_title).getText();
	}
	
	public String getassets()
	{
		return driver.findElement(cer_til).getText();
	}
	
	public void wallet()
	{
	 this.clickcontrol();
	 this.clickmenu();
	 this.clickwallet();
	}
}

package POM;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Application_Page {
	
AppiumDriver<MobileElement> driver;
ElementsPath obj=new ElementsPath();

	 
By control=By.id(obj.control_btn1);
By menu = By.xpath(obj.main_menu2);
By app=By.xpath(obj.app);
By app_title=By.id(obj.app_title);
By view_now=By.id(obj.view_now);
By cancel_app=By.xpath(obj.cancel_app);
By btn_no=By.id(obj.btn_no);
By tab_app=By.id(obj.tab_app);
By list_app=By.id(obj.list_app);
By app_cancel=By.id(obj.app_cancel);
By appcancel_yes=By.id(obj.appcancel_yes);
By appok=By.id(obj.appok);
By jobsview=By.xpath(obj.app_view);
By app_view_til=By.id(obj.app_view_til);
By app_list=By.id(obj.app_list);
By cover_note=By.id(obj.cover_note);
By after_apply=By.xpath(obj.after_view_apply);
By app_no_mes=By.id(obj.app_no_mes);
By app_note=By.id(obj.add_note);
By send_app=By.id(obj.send_app);
By appclosed=By.id(obj.appclosed);

By int_tab=By.id(obj.int_tab);
By int_tab_con=By.id(obj.int_tab_con);
By int_tab_list=By.id(obj.int_tab_list);
By int_view=By.id(obj.int_view);

By offer_tab=By.id(obj.offer_tab);
By offer_tab_list=By.id(obj.offer_tab_list);
By offer_view=By.id(obj.offer_view);

	 
public Application_Page(AppiumDriver<MobileElement> driver2)
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

public void clickapp()
{
	driver.findElement(app).click();
}


public String gettil()
{
	return driver.findElement(app_title).getText();
}

public String no_mess()
{
	return driver.findElement(app_no_mes).getText();
}



public void clickview()
{
	driver.findElement(jobsview).click();
}

public void clickviewnow()
{
	driver.findElement(view_now).click();
}

public void clickcancel_app()
{
	driver.findElement(cancel_app).click();
}

public void clickbtn_yes()
{
	driver.findElement(btn_no).click();
}

public String getviewtil()
{
	return driver.findElement(app_view_til).getText();
}

public void setnote(String note)
{
	driver.findElement(cover_note).sendKeys(note);
}
public void clickafterapply()
{
	driver.findElement(after_apply).click();
}

public void clickint()
{
	driver.findElement(int_tab).click();
}


public String getclosed()
{
	return driver.findElement(appclosed).getText();
}


public String getinttil()
{
	return driver.findElement(int_tab_con).getText();
}

public void clickoffer()
{
	driver.findElement(offer_tab).click();
}



public String getofftil()
{
	return driver.findElement(offer_view).getText();
}

public void clickapp_cancel()
{
	driver.findElement(app_cancel).click();
}


public void clicksend_app()
{
	driver.findElement(send_app).click();
}

public void clickappyes()
{
	driver.findElement(appcancel_yes).click();
}

public void clickappok()
{
	driver.findElement(appok).click();
}

//back to application
//view your application
//application has three tabs application,interviews,offer
//application tab shows all applied job,click view and apply,application is ready message is poped out and particular application is removed


public void jobs()
{
this.clickcontrol();
this.clickmenu();
this.clickapp();

}


}

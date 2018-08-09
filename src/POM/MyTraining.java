package POM;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MyTraining {
	
	AppiumDriver<MobileElement> driver;
	ElementsPath obj=new ElementsPath();

public MyTraining(AppiumDriver<MobileElement> driver)
{
	this.driver=driver;
	
}

By control=By.id(obj.control_btn1);
By menu = By.xpath(obj.main_menu2);
By my_train=By.xpath(obj.my_train);
By my_til=By.id(obj.my_til);
By train_list=By.id(obj.train_list);
By train_list_first=By.id(obj.train_list_first);
By train_first=By.id(obj.train_first);

public void clickcontrol() 
{
driver.findElement(control).click();

}

public void clickmenu() 
{
	 driver.findElement(menu).click();
}

public void clickmytrain()
{
	driver.findElement(my_train).click();
}

public String getmytil()
{
	return driver.findElement(my_til).getText();
}

public void clicktrain_list_first()
{
	driver.findElement(train_list_first).click();
}

public void mytrain()
{
	this.clickcontrol();
	this.clickmenu();
	this.clickmytrain();
}

}

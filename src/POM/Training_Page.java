package POM;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Training_Page {
	
	
	AppiumDriver<MobileElement> driver;
	ElementsPath obj=new ElementsPath();
	By control=By.id(obj.control_btn1);
	By menu = By.xpath(obj.main_menu2);
	By train=By.xpath(obj.train);
	By train_title=By.id(obj.train_title);
	By course=By.id(obj.course);
	By course_indust=By.id(obj.course_indust);
	By enroll=By.id(obj.enroll);
	By thank_mess=By.id(obj.thank_mes);
	By back_train=By.id(obj.back_train);
	By my_course=By.id(obj.my_course);
	By my_course_list=By.id(obj.my_course_list);
    By unpurchase=By.id(obj.unpurchase);
    By purchase=By.id(obj.purchase);
    By card_num=By.id(obj.card_num);
    By card_date=By.id(obj.card_date);
    By card_cvv=By.id(obj.card_cvv);
    By card_month=By.id(obj.card_month);
    By card_year=By.xpath(obj.card_year);
    By pay=By.id(obj.pay);
    By cancel=By.xpath(obj.cancel);
    By log_yes=By.id(obj.log_yes);
    By price=By.id(obj.price);
    By row_course=By.id(obj.row_course);
    By train_first=By.id(obj.train_first);
    

    
    Training_Page(AppiumDriver<MobileElement> driver2)
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

	public void clicktrain()
	{
		driver.findElement(train).click();
	}
	

	public void clickcourse()
	{
		driver.findElement(course).click();
	}
	
	public void selindus()
	{
		driver.findElement(By.xpath("//android.widget.TextView[@text='Engineering / Manufacturing']")).click();
	}
	
	public void clickcourseindust()
	{
		driver.findElement(course_indust).click();
	}
	
	public String getmess()
	{
		return driver.findElement(thank_mess).getText();
	}
	
	public void clickback()
	{
		driver.findElement(back_train).click();
	}
	
	public void clickenroll()
	{
		driver.findElement(enroll).click();
	}
	
	public void clickmy_course()
	{
		driver.findElement(my_course).click();
		
	}
	
	public void click_purchase() 
	{
		driver.findElement(purchase).click();
	}
	
	public void setcardnum(String num) 
	{
		driver.findElement(card_num).sendKeys(num);
	}
	
	public void clickcarddate() 
	{
		driver.findElement(card_date).click();
	}
	
	public void setcardcvv(String cvv) 
	{
		driver.findElement(card_cvv).sendKeys(cvv);
	}
	public void click_pay() 
	{
		driver.findElement(pay).click();
	}
	
	public void click_ok() 
	{
		driver.findElement(log_yes).click();
	}
	
	public String gettraintil()
	{
		return driver.findElement(train_first).getText();
	}
	public void training()
	{
	 this.clickcontrol();
	 this.clickmenu();
	 this.clicktrain();
	}

}

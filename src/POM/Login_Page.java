package POM;


import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidKeyCode;

public class Login_Page extends ElementsPath {

	AppiumDriver<MobileElement> driver;
	ElementsPath obj=new ElementsPath();

	By control=By.id(obj.control_btn1);
	By menu = By.xpath(obj.main_menu1);
	By menu2 = By.xpath(obj.main_menu2);
	By cancel=By.xpath(obj.cancel);
	By profile= By.xpath(obj.profile);
	By setting=By.xpath(obj.setting);
	By login=By.id(obj.login);
	By email=By.id(obj.email);
	By sign_btn=By.id(obj.sign_btn);
	By pass=By.id(obj.pass);
	By prof_title=By.id(obj.prof_title);
	By sign_in_set=By.xpath(obj.sign_in_set);
	By close=By.id(obj.close);
	By getjob=By.xpath(obj.get_job);

	By main=By.xpath(obj.main);

	public Login_Page(AppiumDriver<MobileElement> driver2) 
	{
		this.driver=driver2;

	}
	
	public void clickcontrol() 
	{
		MobileElement clt=driver.findElement(control);
		clt.click();

	}

	public void clickmenu() 
	{
		driver.findElement(menu).click();
	}

	public void clickmenu2() 
	{
		driver.findElement(menu2).click();
	}

	
	public void clickcan() 
	{
		driver.findElement(cancel).click();
	}

	public void clickprof() 
	{
		driver.findElement(profile).click();
	}

	public void clicklogin() 
	{
		driver.findElement(login).click();
	}

	public void setemail(String user) 
	{
		
	driver.findElement(email).sendKeys(user);
	}

	public void setpass(String pwd) 
	{
		driver.findElement(pass).sendKeys(pwd);
	}

	public void clicksigin() 
	{
		driver.findElement(sign_in_set).click();
	}
	
	public void clicksiginlog() 
	{
		driver.findElement(sign_btn).click();
	}

	public String gettitle() 
	{
		return driver.findElement(prof_title).getText();
	}

	public String getjob()
	{
		return driver.findElement(getjob).getText();
	}

	public void clickclose()
	{
		driver.findElement(close).click();

	}

	public void clicksetting()
	{
		driver.findElement(setting).click();
	}
	
	
	public void loginmain(String user,String pwd) throws InterruptedException
	{
		this.clickcontrol();
		this.clickmenu();
		this.clicksetting();
		this.clicksigin();
		this.clicklogin();
		Thread.sleep(3000);
		this.setemail(user);
		this.setpass(pwd);
		driver.hideKeyboard();
		this.clicksiginlog();
	}
	
	public void prof()
	{
		this.clickcontrol();
		this.clickmenu2();
		this.clickprof();
	}


	public void login_valid(String user,String pwd) throws InterruptedException 
	{
		this.clickcontrol();
		this.clickmenu();
		this.clickprof();
		this.clicklogin();
		Thread.sleep(3000);
		
		this.clicksigin();
		this.setemail(user);
		this.setpass(pwd);
		driver.hideKeyboard();
		this.clicksigin();
	}

}

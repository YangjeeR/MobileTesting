package POM;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidKeyCode;

public class Signup_Page  extends Login_Page {
	
	AppiumDriver<MobileElement> driver;
	 ElementsPath obj=new ElementsPath();
	 Login_Page Login_obj;
	 String label;
	 
	 By forget=By.id(obj.forget);
	 By sign=By.id(obj.sign);
	 By reset_email=By.id(obj.reset);
	 By reset_til=By.id(obj.reset_til);
	 By reset_ok=By.id(obj.reset_ok);
	 By reset_btn=By.id(obj.reset_btn);
	 
	public Signup_Page(AppiumDriver<MobileElement> driver2) {
			super(driver2);
			this.driver=driver2;
	}
	
	public void clicksign()
	{
     driver.findElement(sign).click();
		
	}
	
	public void signup_data() 
	{
		try {
		File src = new File("C:\\Users\\Acer\\Desktop\\selenium\\exceldata\\appiumsignup.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String data0 = null;
		String data6 = null;
		String data7 = null;
		String data8 = null;
		String data9 =null;
		XSSFSheet sheet1=wb.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		for (int i=1;i<=rowcount;i++)
		{
		
		DataFormatter formatter = new DataFormatter();
		 Cell cell = sheet1.getRow(i).getCell(0);
		 data0 = formatter.formatCellValue(cell);
		 Cell cell1 = sheet1.getRow(i).getCell(1);
		 String data1 = formatter.formatCellValue(cell1);
		 Cell cell2 = sheet1.getRow(i).getCell(2);
		 String data2 = formatter.formatCellValue(cell2);
		// System.out.println(data2);
		 Cell cell3 = sheet1.getRow(i).getCell(3);
		 String data3 = formatter.formatCellValue(cell3);
		 Cell cell4 = sheet1.getRow(i).getCell(4);
		 String data4 = formatter.formatCellValue(cell4);
		// System.out.println(data4);
		 Cell cell5 = sheet1.getRow(i).getCell(5);
		 String data5 = formatter.formatCellValue(cell5);
		 Cell cell6 = sheet1.getRow(i).getCell(6);
		 data6 = formatter.formatCellValue(cell6);
		 Cell cell7 = sheet1.getRow(i).getCell(7);
		 data7 = formatter.formatCellValue(cell7);
		 Cell cell8 = sheet1.getRow(i).getCell(8);
		 data8 = formatter.formatCellValue(cell8);
		 Cell cell9 = sheet1.getRow(i).getCell(9);
		 data9 = formatter.formatCellValue(cell9);

		 
		 
		MobileElement email=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/et_sign_up_email_address"));
		email.sendKeys(data0);
		MobileElement email2=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/et_sign_up_confirm_email_address"));
		email2.sendKeys(data1);//confirm email
		((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.ENTER);
		
		MobileElement first=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/et_sign_up_firstname"));
		first.sendKeys(data2);
		((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.ENTER);
		MobileElement last=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/et_sign_up_lastname"));
		last.sendKeys(data3);
		((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.ENTER);
		MobileElement pass=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/et_sign_up_password"));
		pass.sendKeys(data4);
		((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.ENTER);
		MobileElement pass2=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/et_sign_up_confirm_password"));
		pass2.sendKeys(data5);
		driver.hideKeyboard();
		wb.close();
		MobileElement check_box=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/sign_up_agree_checkbox"));
		check_box.click();
		verticalSwipe();
		MobileElement btn=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/bt_continue_sign_up"));
		btn.click();
		Thread.sleep(20000);
		MobileElement num=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/et_validation_number_country_number"));
		num.sendKeys(String.valueOf(data8));
		MobileElement mob=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/et_mobile_number"));
		mob.sendKeys(String.valueOf(data9));
		driver.hideKeyboard();
		Thread.sleep(1000);
		verticalSwipe();
		MobileElement submit=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/submit_button"));
		submit.click();//finish
		
		}
	
		
		Thread.sleep(10000);
		String login=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/tv_user_profile_email_address")).getText();
		if(login.equals(data0))
		{
			System.out.println("Login successful");
			MobileElement edit=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/bt_edit"));
			edit.click();
			MobileElement title=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/et_edit_user_profile_title"));
			title.sendKeys(data6);
			driver.hideKeyboard();
			verticalSwipe();
			Thread.sleep(2000);
			MobileElement about=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/et_user_profile_about_me"));
			about.sendKeys(data7);	
			driver.hideKeyboard();
			Thread.sleep(2000);
			MobileElement save=driver.findElement(By.id("co.olivemedia.hihoandroidwebapp:id/bt_save_edit_profile"));
			save.click();
			label="Pass";
	}
		else
		{
			System.out.println("User cannot be created.Issue in login.");
			label="Fail";
		}
		
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	
	public void verticalSwipe() {
		
		Dimension dim=driver.manage().window().getSize();
		int height=dim.getHeight();
		int width=dim.getWidth();
		int x= width/2;
		int starty=(int)(height*0.80);
		int endy=(int)(height*0.20);
		driver.swipe(x, starty, x, endy, 500);
	}
	 public void SignUp()
	 {
	// clickcontrol();
	// clickmenu();
	 //clickprof();
	 this.clicksign();
	 this.signup_data();
	
	 }
	
	

}

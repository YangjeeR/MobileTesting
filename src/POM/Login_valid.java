package POM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Login_valid {
	
    WebDriver driver;
	String path;

@Test
	public void signup_valid() throws InterruptedException, IOException, TesseractException
	{
		//login form
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		   driver=new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("http://cms.graphenecreative.co.uk/console");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 System.out.println(scrFile);
	  //The below method will save the screen shot in d drive with name "screenshot.png"
	   FileUtils.copyFile(scrFile, new File("C:\\Users\\Acer\\Desktop\\selenium\\screenshot\\screenshot.tiff"));
	 //Image image = ImageIO.read(scrFile);
	   String result=null;
	   ITesseract instance=new Tesseract();
	    result=instance.doOCR(scrFile);
		System.out.println(result);
		Assert.assertTrue(result.contains("Your email or password seems to be incorrect"),"Your email or password seems to be incorrect");

	   

}

}
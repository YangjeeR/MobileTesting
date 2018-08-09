package POM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class excel
{
	  XSSFSheet sheet;
	  XSSFWorkbook book;
	
	@BeforeMethod
	public void read() throws IOException
	{
	
	
	File src=new File("C:\\Users\\Acer\\Desktop\\selenium\\exceldata\\TestData.xlsx");	
			
			  // Load the file

	      FileInputStream fis=new FileInputStream(src);
	      ZipSecureFile.setMinInflateRatio(-1.0d);
	     // load the workbook
	    book=new XSSFWorkbook(fis);
	    
	    sheet= book.getSheetAt(0); 
	    //int row=sh1.getRow(1).getLastCellNum();
	    //System.out.println(sheet.getRow(1).getCell(3).getStringCellValue());
	   
	}
	
 @AfterMethod
public   void write() throws IOException
 {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Acer\\Desktop\\selenium\\exceldata\\TestData.xlsx");                                 
		
		  // finally write content		   
		book.write(fos);
		   
		  // close the file
		   
		   fos.close();
		
 }

}


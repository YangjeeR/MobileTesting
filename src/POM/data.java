package POM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class data {

	@Test
public void test() throws IOException
{
	
File src=new File("C:\\Users\\Acer\\Desktop\\selenium\\exceldata\\test.xlsx");
	
	  // Load the file

FileInputStream fis=new FileInputStream(src);

// load the workbook
XSSFWorkbook book=new XSSFWorkbook(fis);

XSSFSheet sheet = book.getSheetAt(0); 
//int row=sh1.getRow(1).getLastCellNum();
//System.out.println(sheet.getRow(1).getCell(3).getStringCellValue());

sheet.getRow(5).getCell(4).setCellValue("test");

FileOutputStream fos = new FileOutputStream("C:\\Users\\Acer\\Desktop\\selenium\\exceldata\\test.xlsx");                                 

// finally write content		   
book.write(fos);
 
// close the file
 
 fos.close();

}
}

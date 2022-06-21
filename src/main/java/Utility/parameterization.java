      package Utility;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterization {
    	  
     public static String getdata (String name ,int row,int cell) throws EncryptedDocumentException, IOException {
    	  
    	FileInputStream file = new FileInputStream("D:\\programs\\KiteZerodha\\src\\main\\resources\\exceldata.xlsx") ;
    	  
    	 String value = WorkbookFactory.create(file).getSheet(name).getRow(row).getCell(cell).getStringCellValue();
    	  
    	 return value;
    	  
    	
     }
}

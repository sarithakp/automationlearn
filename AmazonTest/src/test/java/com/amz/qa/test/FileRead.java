package com.amz.qa.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileRead {

	public static void main(String[] args) {
		
		try {
			File src=new File("C:\\Users\\sarit\\Documents\\docs\\testdata.xlsx");
			FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
					
			System.out.println(wb.getNumberOfSheets());
			
			XSSFSheet sheet1=wb.getSheetAt(0);
			System.out.println("Name      Phone ");
			for(int i=1;i<5;i++) {
				
					
				
					String name=sheet1.getRow(i).getCell(0).getStringCellValue();
					String phone=sheet1.getRow(i).getCell(1).getRawValue();
					System.out.print(name+"        "+phone);
		
				
				System.out.println();
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	

	}

}

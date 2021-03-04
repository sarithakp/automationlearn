
/*
 * Library for reading excel data
 * 
 */

package libdemoQA;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExceldataConfig(String filepath) {
		File src=new File(filepath);
		try {
			FileInputStream fis=new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public int getRowcount(int sheetindex) {
		
		int rowCt=wb.getSheetAt(sheetindex).getLastRowNum();
		
		System.out.println(" The number of rows is "+(rowCt+1));
		return rowCt+1;
	}
	
	
		public String getSheet(int sheetindex,int row,int col) {
			
			sheet1=wb.getSheetAt(sheetindex);
					
			String data=sheet1.getRow(row).getCell(col).getStringCellValue();
			return data;
			
		}
		
		

}

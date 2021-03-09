package lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelDataConfig(String filepath) {
		File src=new File(filepath);
		try {
			FileInputStream fis=new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public String getString(int sheetindex,int row,int col) {
		String value=wb.getSheetAt(sheetindex).getRow(row).getCell(col).getStringCellValue();
		return value;
	}
	
	public int getRowCount(int sheetindex) {
		return wb.getSheetAt(sheetindex).getLastRowNum();
	}

}

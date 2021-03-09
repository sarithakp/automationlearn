
/*
 * Libraray for reading properties file 
 * for chrome path url and excel path
 */

package lib;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigReader {
	Properties pro;
	public ConfigReader() {
		File src=new File("./config/config.property");
		
		try {
			FileInputStream fis= new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public String getChromepath() {
		return pro.getProperty("Chromepath");
	}
	
	public String getUrl() {
		return pro.getProperty("URL");
	}
	public String getExcelPath() {
		return pro.getProperty("excelpath");
	}


}

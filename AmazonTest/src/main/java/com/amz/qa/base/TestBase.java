package com.amz.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amz.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			
			prop= new Properties();
			FileInputStream ip=new FileInputStream("C:\\test_automation\\code\\AmazonTest\\src\\main\\java\\com\\amz\\qa\\config\\config.properties");
			
			prop.load(ip);
			
			
			}catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
		
		
	}
	
	



	public static void initialization() {
		String browserName=prop.getProperty("browser");
		
		System.out.print("Browser name ... "+ browserName);
		
		if(browserName.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	
	}

}

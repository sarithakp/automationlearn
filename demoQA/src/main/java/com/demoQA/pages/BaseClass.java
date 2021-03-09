package com.demoQA.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeSuite;

import com.demoQA.util.Helper;

import lib.ConfigReader;
import lib.ExcelDataConfig;



public class BaseClass {
	
	public static WebDriver driver;
	public static Logger logger;
	public static ConfigReader config;
	public static ExcelDataConfig exceldata;


	
	public static void initiation() {
		
		System.setProperty("webdriver.chrome.driver",config.getChromepath());
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(config.getUrl());
	}
	@BeforeSuite
	public static void setupSuite() {
		config=new ConfigReader();
		exceldata=new ExcelDataConfig(config.getExcelPath());
		
		
		
	}
	public void refreshPage() {
		driver.navigate().refresh();
	}

	public void teardown() {
		driver.quit();
	}
	@AfterMethod
	public void teardownMethod(ITestResult result) {
		
		if (result.getStatus()==ITestResult.FAILURE) {
			Helper.captureScreenShot(driver);
			System.out.println("Screenshot is taken---");
		}
		
	}


}

package com.demoQA.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportdemo {
	
	@Test
	public void TestReport() {
		
		
		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\test-automation\\drivers\\chromedriver.exe"); WebDriver driver= new
		  ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://demoqa.com/");
		  
		  ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/demoQA.html");
		  ExtentReports extent= new ExtentReports(); extent.attachReporter(reporter);
		  ExtentTest logger1=extent.createTest("Launch page.."); 
		  
		  extent.flush();
		  
		 
		
	}
	

}

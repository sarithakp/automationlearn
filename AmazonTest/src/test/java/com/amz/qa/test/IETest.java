package com.amz.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\test_automation\\drivers\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com");

	}

}

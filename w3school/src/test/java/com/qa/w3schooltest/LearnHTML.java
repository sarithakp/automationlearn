package com.qa.w3schooltest;

import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.logging.log4j.core.config.properties.PropertiesConfigurationBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class LearnHTML {
	
	@Test
	public void multiplewindowHandle() {
		System.setProperty("webdriver.chrome.driver", "C:\\saritha\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/");
		System.out.println(" Title: "+driver.getTitle());
		
		Logger logger=Logger.getLogger("multiplewindowHandle");
		logger.info("Get title passed..");
		
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Learn HTML']")).click();	
		logger.info("Clicked Learn HTML...");
		
		driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();
		logger.info("Clicked Try Button...");
		
		driver.findElement(By.xpath("//button[text()='Submit Answer »']")).click();
		logger.info("Clicked Submit answer button...");
		
		Set<String> allWindows=driver.getWindowHandles();
		
		Iterator<String> itr=allWindows.iterator();
		
		while(itr.hasNext()) {
			String child=itr.next();
			if (!child.equalsIgnoreCase(parent)) {
				
				driver.switchTo().window(child);
				System.out.println("Inside child window ..");
				driver.close(); 
				
				System.out.println("Closed child window ..");
				logger.info("Closed Child Window...");
				driver.switchTo().window(parent);
			}
		}
		
		System.out.println("Active Window is : "+driver.getTitle());

	}

}

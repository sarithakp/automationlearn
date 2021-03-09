package com.demoQA.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass{
	
	HomePage homepage;
	WebElement header;
	
	  public HomePageTest() { 
		  super(); 
	}
	 
	
		
	@BeforeTest
	public void setup() {
		initiation();
		homepage=new HomePage();
	}
	
	@Test(priority=1)
	public void testElementsClick() {
		homepage.getElementsCard();
		System.out.println("The Title is ---: "+driver.getTitle());
		header=driver.findElement(By.className("main-header"));
		System.out.println("The header is ===="+header.getText());
		assertEquals(header.getText(), "Elements");
		
		driver.navigate().back();
		
	}
	@Test(priority=2)
	public void testFormsClick() {
		homepage.getformsCard();
		header=driver.findElement(By.className("main-header"));
		System.out.println("The header is ===="+header.getText());
		assertEquals(header.getText(), "Forms");
		driver.navigate().back();
	}
	@Test(priority=3)
	public void testFrameClick() {
		homepage.getframeCard();
		header=driver.findElement(By.className("main-header"));
		assertEquals(header.getText(), "Alerts, Frame & Windows");
		System.out.println("The header is ===="+header.getText());
		driver.navigate().back();
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}

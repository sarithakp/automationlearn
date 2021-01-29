package com.amz.qa.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.amz.qa.base.TestBase;
import com.amz.qa.pages.HomePage;


public class HomePageTest extends TestBase{
	
	HomePage homepage;
	
	
	public HomePageTest() {
		super();
		}
	
	@BeforeMethod
	public void setup() {
		initialization();
		homepage=new HomePage();
		
	}
	
	@Test(priority=1)
	public void HomePageTitleTest() {
		String title1=homepage.validateHomePageTitle();
		System.out.println(title1);
		//org.testng.Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		assertEquals(title1,"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		
	
	
	}
	
	@Test(priority=2)
	public void searchItem() {
		homepage.searchItem(prop.getProperty("item"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

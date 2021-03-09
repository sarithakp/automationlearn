package com.demoQA.pages;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ElementsCheckBoxTest extends BaseClass{
	
	//static Logger logger;
	
	public ElementsCheckBoxTest() {
		super();
		logger=Logger.getLogger("ElementsCheckBoxTest");
	}
	HomePage homepage;
	ElementsCheckBoxPage elepage;
	
	@BeforeTest
	public void setup() {
		initiation();
		homepage=new HomePage();
		elepage=new ElementsCheckBoxPage();
	}
	
	@Test
	public void verifyCheckBox() {
		
		logger.info("======Home Page =====");
		homepage.getElementsCard();
		logger.info("======Clicked on elements =====");
		elepage.elementsMenu();
		
		
		
		
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}

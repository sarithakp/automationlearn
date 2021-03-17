package com.demoQA.pages;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElementsWebTableTest extends BaseClass {
	
	public ElementsWebTableTest() {
		super();
		
	}
	HomePage homepage;
	ElementsPage elepage;
	ElementsWebTables webtablepage;
	
	@BeforeTest
	public void setup() {
		initiation();
		homepage=new HomePage();
		elepage=new ElementsPage();
		webtablepage=new ElementsWebTables();
	}
	
	@Test
	public void checkName() {
		homepage.getElementsCard();
		elepage.clickElementsMenu();
		elepage.clickMenuItem("webtable");
		webtablepage.editbutton.click();
		webtablepage.fname.clear();
		webtablepage.fname.sendKeys("Cami");
		System.out.println("entered fname..");
		
		webtablepage.submitbutton.click();
		webtablepage.printTable();
		System.out.println(" The name is : "+webtablepage.getfName());
		assertEquals(webtablepage.getfName(), "Cami");
		
	}
	
	@AfterTest
	public void endTest() {
		teardown();
	}


}

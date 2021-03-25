package com.demoQA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoQA.util.Helper;

import lib.ExcelDataConfig;

public class ElementsPageTest extends BaseClass {
	
	public ElementsPageTest() {
		super();
	}
	HomePage homepage;
	ElementsPage elepage;
	
	
	@BeforeTest
	public void setup() {
		initiation();
		homepage=new HomePage();
		elepage=new ElementsPage();
		
	}
	
	@Test
	public void fillText() {
		homepage.getElementsCard();
		elepage.clickElementsMenu();
		elepage.clickMenuItem("textbox");
		String fname="";
		String email="";
		String addr="";
		String permaddr="";	
		int rowCt=exceldata.getRowCount(0);
		System.out.println("Row count --"+rowCt);
		for(int i=1;i<=rowCt;i++) {
			
			
					fname=exceldata.getString(0, i, 0);
					email=exceldata.getString(0, i, 1);
					addr=exceldata.getString(0, i, 2);
					permaddr=exceldata.getString(0, i, 3);
					try {
						elepage.fillTextform(fname,email,addr,permaddr);
					} catch (Exception e) {
						
						e.printStackTrace();
					}
					System.out.println("The data entered--: "+fname+ "  "+email +"  "+addr+" "+permaddr);
					//Helper.captureScreenShot(driver);
					
		}
		

		
	}
	@AfterTest
	public void endTest() {
		teardown();
	}

}

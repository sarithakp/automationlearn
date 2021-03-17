package com.demoQA.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsWebTables extends BaseClass{
	

	@FindBy(xpath="//*[@id='edit-record-1']")
	WebElement editbutton;
	
	@FindBy(id="firstName")
	WebElement fname;
	
	@FindBy(id="submit")
	WebElement submitbutton;
	
	//@FindBy(xpath="//div[@class='rt-tr-group']")
	@FindBy(xpath="//div[@class='rt-tr-group'][1]/div/div")
	List<WebElement> webtable;
	
	
	
	public ElementsWebTables() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void printTable() {
		
		for(int i=0;i<webtable.size();i++) {
			System.out.println(webtable.get(i).getText());
		}
	}
	
	public String getfName() {
		return webtable.get(0).getText();
	}

}

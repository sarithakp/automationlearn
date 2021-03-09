package com.demoQA.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class ElementsPage extends BaseClass {
	
		
	
	@FindBy(xpath="//div[@class='element-group1']")
	WebElement element;
	
	@FindBy(xpath="//span[text()='Text Box']")
	WebElement textboxmenubutton;
	
	
	@FindBy(xpath="//input[@id='userName']")
	WebElement fnameinput;
	
	@FindBy(xpath="//input[@id='userEmail']")
	WebElement emailinput;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	WebElement addrinput;
	
	@FindBy(xpath="//textarea[@id='permanentAddress']")
	WebElement permaddrinput;
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement submitButton;
	
	@FindBy(xpath="//p[@id='name']")
	WebElement outputName;


	@FindBy(xpath = "//p[@id='email']")
	WebElement outputEmail;

	@FindBy(xpath = "//p[@id='currentAddress']")
	WebElement outputAddr;

	@FindBy(xpath = "//p[@id='permanentAddress']")
	WebElement outputpermAddr;
	
	public ElementsPage() {
		PageFactory.initElements(driver, this); 
	}
	 
	
	public void elementsMenu() {
		System.out.println("On Elements Page..");
		
		element.click();
		System.out.println("Clicked Elements....");
		textboxmenubutton.click();
		
	}
	
	public void fillTextform(String fname,String email,String addr,String permAddr) {
		fnameinput.sendKeys(fname);
		emailinput.sendKeys(email);
		addrinput.sendKeys(addr);
		permaddrinput.sendKeys(permAddr);
		submitButton.click();
		refreshPage();
	}
	
	
	public void verifyOutputValue(String fname, String email, String addr, String permAddr) {

		System.out.println("On Verify output method...");

		System.out.println("The title is : " + driver.getTitle());
		
		
		/*
		 * assertEquals(outputName.getText().contains(fname));
		 * 
		 * assertEquals(outputEmail.getText().contains(email));
		 * 
		 * assertEquals(outputAddr.getText().contains(addr));
		 * assertEquals(outputpermAddr.getText().contains(permAddr));
		 */
	}
	

}

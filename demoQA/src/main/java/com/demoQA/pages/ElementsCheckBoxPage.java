package com.demoQA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsCheckBoxPage extends BaseClass {

	
	@FindBy(xpath="//div[@class='element-group']")
	WebElement element;
	
	@FindBy(xpath="//span[text()='Check Box']")
	WebElement checkboxmenubutton;
	
	@FindBy(xpath="//button[@title='Expand all']")
	WebElement expandButton;
	
	public ElementsCheckBoxPage() {
		PageFactory.initElements(driver, this); 
	}
	
	public void elementsMenu() {
		System.out.println("On Elements Page..");
		
		element.click();
		checkboxmenubutton.click();
		expandButton.click();
	}
}

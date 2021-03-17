package com.demoQA.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		WebDriverWait wait= new WebDriverWait(driver,20);
		expandButton= wait.until(ExpectedConditions.visibilityOf(expandButton));
		
		
	}
}

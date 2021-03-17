package com.demoQA.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//test
public class HomePage extends BaseClass {
	
	@FindBy(xpath="//h5[text()='Elements']")
	//@FindBy(xpath="//div[@class='card-body'][1]")
	WebElement elementsCard;
	
	@FindBy(xpath="//h5[text()='Forms']")
	WebElement formsCard;
	
	@FindBy(xpath="//h5[text()='Alerts, Frame & Windows']")
	WebElement frameCard;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void getElementsCard() {
		elementsCard.click();

	}
	public void getformsCard() {
		formsCard.click();
	}
	public void getframeCard() {
		frameCard.click();
	}

}

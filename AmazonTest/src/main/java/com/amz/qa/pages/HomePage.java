package com.amz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amz.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement submitBtn;
	
	@FindBy(xpath="//select[@id='searchDropdownBox']")
	WebElement searchDropdown;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public void searchItem(String item) {
		searchbox.sendKeys(item);
		submitBtn.click();
	}

}


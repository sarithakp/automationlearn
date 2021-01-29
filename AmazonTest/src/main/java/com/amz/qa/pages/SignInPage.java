package com.amz.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amz.qa.base.TestBase;
import com.amz.qa.util.TestUtil;

public class SignInPage extends TestBase{
	
	@FindBy(xpath="//input[@type='email']")
	WebElement username;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement Signinlink;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement ContinueBtn;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement SubmitBtn;
	
	@FindBy(xpath="//label[contains(text(),'Email or mobile phone number')]")
	WebElement EmailLabel;
	
	@FindBy(xpath="//a[contains(text(),'Change')]")
	WebElement ChangeEmailLink;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	WebElement ForgotLink;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']//preceding::span[@class='nav-line-1 nav-progressive-content' and contains(text(),'Hello')]")
	WebElement HelloName;
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void Signin(String un,String pwd) {
		
		System.out.println(" credential..."+un+"   "+pwd);
		Signinlink.click();
		this.VerifyLabel();
	
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		username.sendKeys(un);
		ContinueBtn.click();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		this.VerifyChangelink();
		this.VerifyForgotLink();
		
		password.sendKeys(pwd);
		SubmitBtn.click();
		
		
		
	}
	
	public void VerifyLabel() {
		boolean cond=EmailLabel.isDisplayed();
		if (cond) {
			System.out.println("Label is Displayed.. Success");
			
		}
		
	}
	public void VerifyChangelink() {
		boolean cond=ChangeEmailLink.isDisplayed();
		if(cond) {
			System.out.println("Change Link is Displayed.. Success");
		}
	}
	
	public void VerifyForgotLink() {
		boolean cond=ForgotLink.isDisplayed();
		if (cond) {
			System.out.println("Forgot Link is Displayed.. Success");
		}
	}
	public void VerifyHelloName() {
		boolean cond=HelloName.isDisplayed();
		if (cond) {
			System.out.println("Hello Name is Displayed.. Success");
		}
			
	}

}

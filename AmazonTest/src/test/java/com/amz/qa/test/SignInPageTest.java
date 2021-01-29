package com.amz.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amz.qa.base.TestBase;
import com.amz.qa.pages.SignInPage;

public class SignInPageTest extends TestBase {
	
	SignInPage SignPage;
	
	public SignInPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		SignPage=new SignInPage();
	}
		
	@Test
	public void SigninTest() {
		SignPage.Signin(prop.getProperty("un"), prop.getProperty("pwd"));
		
	}
	
	@Test
	public void postSignIn() {
		
		SignPage.VerifyHelloName();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
		
}

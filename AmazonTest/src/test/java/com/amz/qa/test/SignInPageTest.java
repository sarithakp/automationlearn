package com.amz.qa.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
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
		
		Assert.assertTrue(SignPage.VerifyHelloName());
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
		
}

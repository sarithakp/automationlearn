package demoQA;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VerifyOutput {
	WebDriver driver;

	//@FindBy(xpath = "//*[@id='name']/text()[2]")
	@FindBy(xpath="//p[@id='name']")
	WebElement outputName;

	// @FindBy(xpath="//div[@id='output']/div/p") List<WebElement> outputName;

	@FindBy(xpath = "//p[@id='email']")
	WebElement outputEmail;

	@FindBy(xpath = "//p[@id='currentAddress']")
	WebElement outputAddr;

	@FindBy(xpath = "//p[@id='permanentAddress']")
	WebElement outputpermAddr;

	/*
	 * @FindBy(how = How.ID, using = "output") List<WebElement> output;
	 */

	public VerifyOutput(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyOutputValue(String fname, String email, String addr, String permAddr) {

		System.out.println("On Verify output method...");

		System.out.println("The title is : " + driver.getTitle());

		/*
		 * for(WebElement ele:output) {
		 * 
		 * 
		 * Actions act=new Actions(driver); act.moveToElement(ele).perform();
		 * 
		 * System.out.println("The data is===>"+ele.getText());
		 * 
		 * }
		 */

		Assert.assertEquals(outputName.getText().contains(fname),true);
	
		Assert.assertEquals(outputEmail.getText().contains(email), true);

		Assert.assertEquals(outputAddr.getText().contains(addr), true);
		Assert.assertEquals(outputpermAddr.getText().contains(permAddr), true);

	}

}

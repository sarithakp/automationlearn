package demoQA;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class ElementsPage {
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='element-group'][1]")
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


	
	
	public ElementsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void elementsMenu() {
		System.out.println("On Elements Page..");
		
		element.click();
		textboxmenubutton.click();
		
	}
	
public void fillTextForm(String fname,String email,String addr,String permAddr) throws InterruptedException {
	
	fnameinput.sendKeys(fname);
	emailinput.sendKeys(email);
	addrinput.sendKeys(addr);
	permaddrinput.sendKeys(permAddr);
	
	submitButton.click();
	Thread.sleep(3000);
	
	  VerifyOutput obj=new VerifyOutput(driver);
	  obj.verifyOutputValue(fname,email, addr, permAddr);
	 	
	
		/*
		 * WebDriverWait wait=new WebDriverWait(driver,20); WebElement
		 * ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("output"))
		 * );
		 * 
		 * System.out.println("output is ======"+ele.getText());
		 */
	
	//List<WebElement> output=driver.findElements(By.id("output"));
	
	/*
	 * for(WebElement ele:output) {
	 * System.out.println("The output---"+ele.getText()); }
	 */
	}


	

}

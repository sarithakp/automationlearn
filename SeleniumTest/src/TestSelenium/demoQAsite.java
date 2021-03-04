package TestSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import library.utility;

public class demoQAsite {

	
	@Test
	public void demoQAForms()throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		System.out.println("The title is : "+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(10000);
		List<WebElement> allCards=driver.findElements(By.className("card-body"));
		System.out.println("The number of cards is"+allCards.size());
		for (WebElement ele:allCards) {
			System.out.println(" The card====="+ele.getText()); 
			
		}
		

		
		allCards.get(1).click();
		
		WebElement p=(WebElement) allCards.get(1).getLocation();
		
		System.out.println("Location :"+p.getText());
		 Actions actions = new Actions(driver);
		  actions.moveToElement(p).click().perform();
		
			/*
			 * WebElement ele=allCards.get(1); Actions actions = new Actions(driver);
			 * actions.moveToElement(ele).click().perform();
			 */
		  
		 
		/*		 * try { for (WebElement ele:allCards) {
		 * 
		 * if (ele.getText().equals("Forms")) {
		 * System.out.println(" Found card====="+ele.getText());
		 * utility.captureScreenShot(driver, "forms found"); 
		 * ele.click(); break; } //System.out.println(" The card====="+ele.getText()); }
		 * } catch (InterruptedException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		
		
	}
}

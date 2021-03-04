package testSuiteTrial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	@Test

	public void jcp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\saritha\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.jcpenney.com/");
		System.out.println(" The title is : " +driver.getTitle());
		WebElement element=driver.findElement(By.xpath("//div[text()='Women']"));
		
		Actions act=new Actions(driver);
		/*
		 * act.contextClick(element).perform(); act.doubleClick(element).perform();
		 * act.clickAndHold(element) .moveToElement(element) .release() .build()
		 * .perform(); act.dragAndDrop(element, element)
		 */
		
		act.moveToElement(element).perform();
		Thread.sleep(2000);
		List <WebElement> womenlist=driver.findElements(By.xpath("//ul[@data-automation-id='megaMenuInnerSubCategories']"));
	
		for (int i=0;i<womenlist.size();i++) {
			System.out.println(i+"   the category is -->"+womenlist.get(i).getText());
			
			//System.out.println("the category is -->"+ele.getAttribute("innerHTML"));
		}
		
		act.click(driver.findElement(By.xpath("//a[text()='Skirts']"))).perform();

	}

}

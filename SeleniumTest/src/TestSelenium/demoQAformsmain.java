package TestSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import library.utility;

public class demoQAformsmain {

	public static void main(String[] args){
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		System.out.println("The title is : "+driver.getTitle());
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		List<WebElement> allCards=driver.findElements(By.className("card-body"));
		System.out.println("The number of cards is"+allCards.size());
		
		System.out.println(" Found card====="+allCards.get(1).getText());
		allCards.get(1).click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		
		//driver.quit();
		/*
		 * for (WebElement ele:allCards) {
		 * 
		 * if (ele.getText().equals("Forms")) {
		 * System.out.println(" Found card====="+ele.getText());
		 * //utility.captureScreenShot(driver, "forms found"); ele.click(); break; }
		 * 
		 * }
		 */
}
}

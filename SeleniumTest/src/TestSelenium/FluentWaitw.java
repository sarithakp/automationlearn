/* Fluent wait is a class
 * this will wait until the condition is met
 * default polling period is 250milliseconds and this can be changed
 * ignore if no such element exception is coming
 * fluentwait implements Wait - interface */


package TestSelenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentWaitw {
	@Test
	public void fuentwait() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(50, TimeUnit.SECONDS)
		       .pollingEvery(10, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//p[text()='WebDriver']"));
		     }
		   });
		   System.out.println("Element is displayed"+element.isDisplayed());
		 
	}

}

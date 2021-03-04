//Implicitly waity will check for all webelemnt to be present on the page
//Explicit wait helps to apply condition

package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	@Test
	
	public void explicitwait() {
		System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		//WebElement ele=driver.findElement(By.xpath("//p[text()='WebDriver']"));
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		boolean flag=ele.isDisplayed();
		if (flag) {
			System.out.println("element is displayed");
		}
		else {
			System.out.println("Element is nOt diaplyed");
		}
		
	}

}

package testNGListenerpck;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeboardEventDemoQA {

	@Test
	public void KeboadEvent() {
		System.setProperty("webdriver.chrome.driver", "C:\\saritha\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//h5[text()='Forms']")).click();
		System.out.println(" The title is : " +driver.getTitle());
		driver.findElement(By.xpath("//div[@class='element-group'][2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Saritha");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB)
		.sendKeys("Purayil")
		.sendKeys(Keys.TAB)
		.sendKeys("sarithoo@gmail.com")
		.pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB)
		.click()
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
		.sendKeys("8485843")
		.build().perform();
	}
}

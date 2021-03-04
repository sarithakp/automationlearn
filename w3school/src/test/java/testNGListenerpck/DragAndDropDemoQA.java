package testNGListenerpck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({testNGListenerpck.TestNGListener.class})
public class DragAndDropDemoQA {
	
	@Test
	
	public void VerifyDragAndDrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\saritha\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		WebElement fr=driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(fr);
		Thread.sleep(3000);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
	}


}

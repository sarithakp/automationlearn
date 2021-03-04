

package TestSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemoQA {
	
	@Test
	public void HandleFrame() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		System.out.println("The title is : "+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<WebElement> allCards=driver.findElements(By.className("card-body"));
		System.out.println("The number of cards is: "+allCards.size());
		
		for(WebElement ele:allCards) {
			if(ele.getText().equals("Forms")) {
				ele.click();
				System.out.println("Forms page title: "+driver.getTitle());
				break;
			}
		}
		//to click on Alerts Frames,WIndows from the Menu and expand
		
		List<WebElement> formsList=driver.findElements(By.className("element-group"));
		formsList.get(2).click();
		//To click on Alerts from the Menu
		
		driver.findElement(By.xpath("//div[@class='element-group'][3]/div/ul/li/span[contains(text(),'Alerts')]")).click();
		
		// 2. Click on the alert button which is timed. Accept the alert after 5 sec
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		//3. Click on Alert button and click OK or Cancel
		
		driver.findElement(By.id("confirmButton")).click();
		alt=driver.switchTo().alert();
		//alt.accept();
		alt.dismiss();
		
		//4. Click on prompt button to enter the name
		
		driver.findElement(By.id("promtButton")).click();
		alt=driver.switchTo().alert();
		System.out.println("The Alert Text is : "+alt.getText());
		alt.sendKeys("Saritha");
		alt.accept();
		
		/*
		 * for(WebElement ele:formsList) {
		 * 
		 * //System.out.println("forms has : "+ele.getText());
		 * if(ele.getText().equals("Alerts, Frame & Windows")) {
		 * System.out.println("Clicked Alert menu"); ele.click(); } }
		 */
		/*
		 * formsList=driver.findElements(By.className("menu-list"));
		 * 
		 * for(WebElement ele:formsList) { if(ele.getText().equals("Alerts")) {
		 * ele.click(); }
		 * 
		 * }
		 */
		 
	}

}

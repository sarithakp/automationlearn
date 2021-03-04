
//switch to frame can be done by name or id, Index, WebElement


package TestSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handleFrame {
	
	@Test
	public void HandleFrame(){
		
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
		
		//List of element group - Alerts,frame,windows -
		
		List<WebElement> formsList=driver.findElements(By.className("element-group"));
		formsList.get(2).click();
		
		//To click on Frames from the menu		
		
		driver.findElement(By.xpath("//div[@class='element-group'][3]/div/ul/li/span[contains(text(),'Frames')]")).click();
		//driver.switchTo().frame("frame1");
		WebElement myframe=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(myframe);
		System.out.println("Switched to the Frame 1 ");
		driver.switchTo().defaultContent();
		System.out.println("Back to main window");
	}

}

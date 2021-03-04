
/* Multiple window - Popup handling */

package TestSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multiplewindows {
	@Test
	
	public void multiplewindowhandle() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/default.asp");
		String parent=driver.getWindowHandle();
		//driver.findElement(By.xpath("//a[contains(text(),'LEARN HTML')]")).click();
		driver.findElement(By.xpath("//div[@id='leftmenuinner']/div/a[contains(text(),'HTML Headings')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Try it Yourself »')]")).click();
		Set<String> allWindows=driver.getWindowHandles();
		for (String child:allWindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("On Child window---");
			}
		}
		
		driver.findElement(By.xpath("//button[contains(text(),'Run »')]")).click();
		System.out.println("Clicked Run button");
		driver.close();
		driver.switchTo().window(parent);
		System.out.println("Parent window id : "+driver.getTitle());
		
	}

}

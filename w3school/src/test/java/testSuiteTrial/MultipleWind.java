package testSuiteTrial;

/*handling multiple windows 
 * click to open child windows and close 
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MultipleWind {
	@Test

	public void multiwindowhandle() {
		System.setProperty("webdriver.chrome.driver", "C:\\saritha\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/");
		System.out.println(" Title: "+driver.getTitle());
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Learn HTML']")).click();	
		
		driver.findElement(By.xpath("//a[text()='Try it Yourself �']")).click();
		
		driver.findElement(By.xpath("//button[text()='Submit Answer �']")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		Iterator<String> itr=allWindows.iterator();
		
		while(itr.hasNext()) {
			String child=itr.next();
			if (!child.equalsIgnoreCase(parent)) {
				driver.close(); 
				driver.switchTo().window(parent);
			}
		}
		
		/*ArrayList<String> windowlist=new ArrayList<>(allWindows);
		
	
		 * for(String s:windowlist) { System.out.println("The active windows-->"+s);
		 * 
		 * if (!s.equalsIgnoreCase(parent)) { driver.switchTo().window(s);
		 * driver.close(); driver.switchTo().window(parent); } }
		 */
		
		System.out.println("Active Window is : "+driver.getTitle());

	}

}

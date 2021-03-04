
/* handle alert window - read the text
 * alert is an interface 
 * *
 */
package TestSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alertwindow {
	@Test
	
	public void alerttest() {
		System.setProperty("webdriver.chrome.driver","C:\\test_automation\\drivers\\win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();

		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//WebElement ele=driver.findElement(By.id("corover-deal-icon"))
		
		driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).click();
		//driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div/div/div[2]/div[3]/button")).click();
				
		Alert alt=driver.switchTo().alert();
		String text=alt.getText();
		System.out.println(" The Alert message is :"+text);
		alt.accept();
		
	}

}

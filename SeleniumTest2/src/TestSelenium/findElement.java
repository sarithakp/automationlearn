package TestSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement {
	
	WebDriver driver;
	
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarit\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	public void dropdown() {
		
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']/option[contains(text(),'Books')]")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Java");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		boolean cond=driver.findElement(By.xpath("//span[contains(text(),'java')]")).isDisplayed();
		while (cond){
			System.out.println("Success");
		}
	}

	
	public static void main(String[] args) {
		
		findElement obj=new findElement();
		obj.launch();
		obj.dropdown();
		
	}

}

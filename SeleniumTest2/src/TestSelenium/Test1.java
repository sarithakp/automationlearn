package TestSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test1 {

	WebDriver driver;
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarit\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		
	}
	
	public void search() throws InterruptedException {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tennis shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		String newstr;
		
		newstr=driver.findElement(By.xpath("//span[@class=\"a-color-state a-text-bold\"]")).getText();
		
	}
	public void getlinkcount() {
		
		List <WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println("There are links on the page count"+linklist.size());
		for(int i=0;i<linklist.size();i++) {
			String linktext=linklist.get(i).getText();
			System.out.println(linktext);
		}
		
			
				
	}
	public static void main(String[] args) throws InterruptedException {
		
		Test1 obj=new Test1();
		obj.launch();
		
		obj.getlinkcount();
		obj.search();
		

	}

}

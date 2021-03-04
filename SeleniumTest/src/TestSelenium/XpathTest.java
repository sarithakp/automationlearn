package TestSelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com");
		System.out.println(driver.getTitle());
		
		
		
		  List<WebElement>linkslist=new ArrayList<WebElement>();
		  linkslist=driver.findElements(By.xpath("//a[contains(text(),'Learn')]"));
		  int num=linkslist.size();
		  System.out.println("There are "+num+" links on the page starts with Learn");
		  for(WebElement wb:linkslist) { 
			  System.out.println(wb.getText());
		  
		  }
		  
		 
		
		/*
		 * List <WebElement>linkslist=sidebar.findElements(By.tagName("a"));
		 * 
		 * for(int i=0;i<linkslist.size();i++) {
		 * System.out.println(linkslist.get(i).getText()); }
		 */
		
		driver.close();

	}

}

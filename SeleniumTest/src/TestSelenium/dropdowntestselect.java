// The drop down with Select Class
//find element and create object of select class and use get options to get the options from drop down
//get selectedoption will return the value selected from drop down

package TestSelenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dropdowntestselect {
	@Test
	
	public void test(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("The title is : "+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		WebElement monthdropdown=driver.findElement(By.id("month"));
		Select month_dd=new Select(monthdropdown);
		
		List<WebElement> actual_list=month_dd.getOptions();
		List<String> unsortedList=new ArrayList<>();
		
		for(WebElement ele:actual_list) {
			System.out.println("The value: "+ele.getText());
			
		}
		
		month_dd.selectByIndex(6);
		System.out.println("The value selected is : "+month_dd.getFirstSelectedOption().getText());
		month_dd.selectByValue("8");
		System.out.println("The value selected is : "+month_dd.getFirstSelectedOption().getText());
		
		
	}
	
	
	

}

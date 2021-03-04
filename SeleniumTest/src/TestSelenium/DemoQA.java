package TestSelenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoQA {
	
	@Test

	public static void maintest() {
		System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("The title is : "+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[text()='Forms']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		System.out.println(driver.getTitle());
		WebElement monthdropdown=driver.findElement(By.id("month"));
		Select month_dd=new Select(monthdropdown);
		WebElement selected_value=month_dd.getFirstSelectedOption();
		
		System.out.println("The value selected is : "+selected_value.getText());
		
		month_dd.selectByIndex(5);
		selected_value=month_dd.getFirstSelectedOption();
		
		System.out.println("The value selected is : "+selected_value.getText());
		
	
		List<WebElement> total=month_dd.getOptions();
		
		System.out.println("The total number of options in drop down is : "+total.size());
		for (WebElement ele:total) {
			System.out.println(ele.getText());
			
		
		}
		Assert.assertEquals(total.size(), 12);
		
		
		
		String monthlist[]=new String[12];
		//month[]=("Month","Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec");
		List<String> expected=new ArrayList<>();
		expected.addAll(Arrays.asList("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"));
		System.out.println(total.get(0).getText());
		System.out.println(expected.get(0));
		
		for (int i=0;i<total.size();i++) {
			
			Assert.assertEquals(total.get(i).getText(), expected.get(i));
		}
		

	}

}

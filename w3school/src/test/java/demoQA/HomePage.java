/* Demo QA Site- Click on elements page
 * fill the text form using xls test data
 */

package demoQA;


import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import libdemoQA.ConfigReader;
import libdemoQA.ExceldataConfig;

@Listeners({testNGListenerpck.TestNGListener.class})
public class HomePage {
	
	WebDriver driver;
	Logger logger;
	ConfigReader config;
	
	
	@BeforeMethod
	public void homePagestart() {
		
		logger=Logger.getLogger("HomePage");
		
		config=new ConfigReader();
		
		System.setProperty("webdriver.chrome.driver", config.getChromepath());
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get(config.getUrl());
		
		
	}
	
	@Test(priority=1)
	public void elementsStartcheck() {

		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		logger.info("Clicked on Elements..");
		System.out.println(" The title is : " +driver.getTitle());
		
		
		ElementsPage obj=new ElementsPage(driver);
		logger.info("Elements page obj created..");
		obj.elementsMenu();
							
		ExceldataConfig excel=new ExceldataConfig(config.getExcelPath());
		
		int rowCt=excel.getRowcount(0);
			for(int i=1;i<rowCt;i++) {
				
				
						String fname=excel.getSheet(0, i, 0);
						String email=excel.getSheet(0, i, 1);
						String addr=excel.getSheet(0, i, 2);
						String permaddr=excel.getSheet(0, i, 3);
						try {
							obj.fillTextForm(fname,email,addr,permaddr);
						} catch (Exception e) {
							
							e.printStackTrace();
						}
						logger.info("Entered the  "+i+"th row of values..");
						
						driver.navigate().refresh();
						
			}
			
			
		
			
		
	
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
	

}

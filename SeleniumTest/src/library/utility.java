package library;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.io.FileHandler;

public class utility{
	
	
	public static void captureScreenShot(WebDriver driver, String screenshotName) {
		
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source, new File("./Screenshots/"+screenshotName+".png"));
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	}

}

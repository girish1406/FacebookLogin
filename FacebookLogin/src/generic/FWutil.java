package generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FWutil {
	
       public static void getPhoto(WebDriver driver,String path) {
    	   TakesScreenshot ts=(TakesScreenshot) driver;
    	   File src = ts.getScreenshotAs(OutputType.FILE);
    	   File dst=new File(path);
    	   try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
       }
}

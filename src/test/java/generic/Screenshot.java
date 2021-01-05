package generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public void capture(WebDriver driver,String tcName) {
		String photo_path = System.getProperty("user.dir")+"/defects/"+tcName+System.currentTimeMillis()+".png";
	TakesScreenshot ts=(TakesScreenshot) driver	;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(photo_path);
	
	try {
		FileHandler.copy(src, dest);
	} catch (IOException e) {
		System.out.println("failed to capture screenshot");
	}
	//return photo_path;
	}

}

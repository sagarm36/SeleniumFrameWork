package test.SeleniumFrameWork.screenshoot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takescreenshoot{
	
	public String takeScreenShoot(String testCaseName, WebDriver driver) {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File file = new File(System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png");
	try {
		FileUtils.copyFile(source, file);
	} catch (IOException e) {
		e.printStackTrace();
	}
	return System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	}
}

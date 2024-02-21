package test.SeleniumFrameWork.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test.SeleniumFrameWork.base.BaseTest;

public class ActionHelper {
	WebDriver driver;
	public ActionHelper(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void sendKeys(WebElement element, String data) {
		element.clear();
		element.sendKeys(data);
	}
}

package test.SeleniumFrameWork.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionHelper {
	WebDriver driver;
	public ActionHelper(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void click(WebElement element) {
		element.click();
	}

}

package test.SeleniumFrameWork.actions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	public void waitUntilElementVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void scrollByVisibleElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public void scrollToBottomOfPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}

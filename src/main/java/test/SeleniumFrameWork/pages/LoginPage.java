package test.SeleniumFrameWork.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.SeleniumFrameWork.actions.ActionHelper;

public class LoginPage extends ActionHelper{
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@title='Login']")
	WebElement loginIcon;
	
	@FindBy(name="username")
	WebElement userNameField;
	
	@FindBy(name="password")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;
	
	public void clickOnLoginIcon() {
		waitUntilElementVisible(loginIcon);
		ActionHelper.click(loginIcon);
	}
	
	public void enterLoginCredentials(String userName, String password) {
		waitUntilElementVisible(userNameField);
		ActionHelper.sendKeys(userNameField, userName);
		ActionHelper.sendKeys(passwordField, password);
	}
	
	public void clickOnLoginButton() {
		waitUntilElementVisible(loginButton);
		ActionHelper.click(loginButton);
	}
	
	

}

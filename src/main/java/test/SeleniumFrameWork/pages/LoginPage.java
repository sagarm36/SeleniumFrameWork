package test.SeleniumFrameWork.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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
	
	@FindBy(xpath = "//span[@title=\"Login\"]")
	WebElement loginIcon;
	
	@FindBy(name="username")
	WebElement userNameField;
	
	@FindBy(name="password")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement loginButton;
	
	public void clickOnLoginIcon() {
		ActionHelper.click(loginIcon);
	}
	
	public void enterLoginCredentials(String userName, String password) {
		userNameField.sendKeys(userName);
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		ActionHelper.click(loginButton);
	}
	
	

}

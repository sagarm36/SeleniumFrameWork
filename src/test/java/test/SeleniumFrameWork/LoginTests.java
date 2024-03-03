package test.SeleniumFrameWork;

import org.testng.annotations.Test;

import test.SeleniumFrameWork.base.BaseTest;
import test.SeleniumFrameWork.retry.Retry;

public class LoginTests extends BaseTest{
	
	@Test
	public void clickOnLogin() {
		loginPage.clickOnLoginIcon();
		loginPage.enterLoginCredentials("sagar.muttappanvar@gmail.com", "Sagar");
		//loginPage.clickOnPreviousNavigator();
		loginPage.clickOnLoginButton();
	}
	
	@Test
	public void clickOnLogin2() {
		loginPage.clickOnLoginIcon();
		loginPage.enterLoginCredentials("sagar.muttappanvar@gmail.com", "Sagar");
		loginPage.clickOnLoginButton();
	}
	
	@Test
	public void clickOnLogin3() {
		loginPage.clickOnLoginIcon();
		loginPage.enterLoginCredentials("sagar.muttappanvar@gmail.com", "Sagar");
		loginPage.clickOnLoginButton();
	}
	
	@Test
	public void clickOnLogin4() {
		loginPage.clickOnLoginIcon();
		loginPage.enterLoginCredentials("sagar.muttappanvar@gmail.com", "Sagar");
		loginPage.clickOnLoginButton();
	}
	
	@Test
	public void clickOnLogin5() {
		loginPage.clickOnLoginIcon();
		loginPage.enterLoginCredentials("sagar.muttappanvar@gmail.com", "Sagar");
		loginPage.clickOnLoginButton();
	}
}

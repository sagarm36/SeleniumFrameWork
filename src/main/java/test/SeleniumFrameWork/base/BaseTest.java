package test.SeleniumFrameWork.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import test.SeleniumFrameWork.pages.LoginPage;

public class BaseTest {
	//public static WebDriver driver;
	public LoginPage loginPage;
	
	public static ThreadLocal<WebDriver> local = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		 return local.get();
	}

	public WebDriver initilizeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\test\\SeleniumFrameWork\\resources\\GlobalData.properties");
		prop.load(fileInputStream);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			local.set(new ChromeDriver(chromeOptions));
		}else if(browserName.equalsIgnoreCase("firefox")) {
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			local.set(new FirefoxDriver(firefoxOptions));
		}else if(browserName.equalsIgnoreCase("edge")) {
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			local.set(new EdgeDriver(edgeOptions));
		}else {
			local.set(new ChromeDriver());
		}
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	@BeforeMethod
	public void launchApp() throws IOException {
		initilizeDriver();
		getDriver().get("https://hegmakart.com/");
		loginPage = new LoginPage(getDriver());
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
}

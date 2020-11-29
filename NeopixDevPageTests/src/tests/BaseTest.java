package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import common.Datas;

public class BaseTest {
	
	public WebDriver driver;
	public Properties selectors;
	public WebDriverWait waiter;
	public String myEmail;
	public String myPassword;
	public String wrongPassword;

	@BeforeMethod
	public void setup() throws FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.selectors =  new Properties();
		this.waiter = new WebDriverWait(driver, 5);
		selectors.load(new FileInputStream("config/page.properties"));
		driver.manage().window().maximize();
		myEmail = Datas.MY_EMAIL;
		myPassword = Datas.MY_PASSWORD;
		wrongPassword = Datas.WRONG_PASSWORD;
	}

	@AfterMethod
	public void afterClass() {
		this.driver.close();
	}

}

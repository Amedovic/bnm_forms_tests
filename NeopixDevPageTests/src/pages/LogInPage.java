package pages;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {
	
	public WebDriver driver;
	public Properties selectors;
	public WebDriverWait waiter;


	public LogInPage (WebDriver driver, Properties selectors, WebDriverWait waiter) {
		this.driver = driver;
		this.selectors = selectors;
		this.waiter = waiter;
	}
	
	public WebElement getEmail() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("logInEmail")));
	}
	
	public void setEmail(String email) {
		this.getEmail().sendKeys(email);
	}
	
	public WebElement getPassword() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("logInPassword")));
	}
	
	public void setPassword(String password) {
		this.getPassword().sendKeys(password);
	}
	
	public WebElement getLogInBtn() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("logInBtn")));
	}
	
	public WebElement getRegistrationLink() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("registrationLink")));
	}
	
	public void goToRegistration() {
		this.getRegistrationLink().click();
	}
	
	public void validLogIn(String email, String password) {
		this.setEmail(email);
		this.setPassword(password);
		this.getLogInBtn().click();
	}
	
	public void logOut() {
		if(this.isLogged()) {
			this.driver.findElement(By.xpath(this.selectors.getProperty("menuBtn"))).click();
			this.driver.findElement(By.xpath(this.selectors.getProperty("logOutBtn"))).click();
		}
	}

	public void noPasswordLogIn(String email) {
		this.setEmail(email);
		this.getLogInBtn().click();
	}
	
	public void wrongPasswordLogIn(String email, String wrongPassword) {
		this.setEmail(email);
		this.setPassword(wrongPassword);
		this.getLogInBtn().click();
	}
	
	public boolean regLink() {
		try {
			this.driver.getCurrentUrl().contains("register");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean isLogged() {
		try {
			this.waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectors.getProperty("displayName"))));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean notLogged() {
		try {
			this.waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selectors.getProperty("noPasswordMsg"))));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean isNotLogged() {
		try {
			this.waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selectors.getProperty("wrongPasswordMsg"))));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}

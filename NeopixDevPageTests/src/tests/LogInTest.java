package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import pages.LogInPage;


public class LogInTest extends BaseTest{
	
	LogInPage lp;
	
	@BeforeMethod
	public void setUpForTest() {
		this.driver.navigate().to(this.selectors.getProperty("logInUrl"));
		this.lp = new LogInPage(driver, selectors, waiter);
		lp.logOut();
	}
	
	@Test
	public void validRegLink() throws InterruptedException  {
		lp.goToRegistration();
		Assert.assertTrue(lp.regLink(), "Invalid Link");
	}
	
	@Test
	public void noPasswordLog() throws InterruptedException {
		lp.noPasswordLogIn(myEmail);
		Assert.assertTrue(lp.notLogged(), "Logged In");
	}
	
	@Test
	public void wrongPasswordLog() throws InterruptedException {
		lp.wrongPasswordLogIn(myEmail, wrongPassword);
		Assert.assertTrue(lp.isNotLogged(), "Logged In");
	}
	
	@Test
	public void validLog() throws InterruptedException {
		lp.validLogIn(myEmail, myPassword);
		Assert.assertTrue(lp.isLogged(), "Not Logged");
	}

}

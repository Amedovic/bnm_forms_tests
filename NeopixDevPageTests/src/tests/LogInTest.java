package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
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
		Assert.assertTrue("Invalid Link", lp.regLink());
	}
	
	@Test
	public void noPasswordLog() throws InterruptedException {
		lp.noPasswordLogIn(myEmail);
		Assert.assertTrue("Logged In", lp.notLogged());
	}
	
	@Test
	public void wrongPasswordLog() throws InterruptedException {
		lp.wrongPasswordLogIn(myEmail, wrongPassword);
		Assert.assertTrue("Logged In", lp.isNotLogged());
	}
	
	@Test
	public void validLog() throws InterruptedException {
		lp.validLogIn(myEmail, myPassword);
		Assert.assertTrue("Not Logged", (lp.isLogged()));
	}

}

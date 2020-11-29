package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	private WebDriver driver;
	private Properties selectors;
	private WebDriverWait waiter;
	
    public RegistrationPage (WebDriver driver, Properties selectors, WebDriverWait waiter) {
		this.driver = driver;
		this.selectors = selectors;
		this.waiter = waiter;
	}

    public WebElement getTitle() {
    	return this.driver.findElement(By.xpath(this.selectors.getProperty("titleSelect")));
    }
    
	public void setTitle(String title) {
		this.getTitle().click();;
		Select titles = new Select(this.getTitle());
		titles.selectByVisibleText(title);
	}
	
	public WebElement getFirstName() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("firstName")));
	}
	
	public void setFirstName(String firstName) {
		this.getFirstName().sendKeys(firstName);
	}
	
	public WebElement getLastName() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("lastName")));
	}

	public void setLastName(String lastname) {
		this.getLastName().sendKeys(lastname);
	}
	
	public WebElement getBirthDate() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("birthDate")));
	}
	
	public void setBirthDate(String birthDate) {
		this.getBirthDate().sendKeys(birthDate);
	}
	
	public WebElement getEmail() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("email")));
	}

	public void setEmail(String email) {
		this.getEmail().sendKeys(email);
	}
	
	public WebElement getPassword() {
		return this.driver.findElement(By.xpath(selectors.getProperty("password")));
	}
	
	public void setPassword(String password) {
		this.getPassword().sendKeys(password);
	}
	
	public WebElement getCountryCode() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("countryCode")));
	}
	
	public void setCountryCode(String countryCode) {
		this.getCountryCode().sendKeys(countryCode);
	}
	
	public WebElement getPhone() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("phone")));
	}

	public void setPhone(String phone) {
		this.getPhone().sendKeys(phone);
	}
	
	public WebElement getMyselfBtn() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("myselfBtn")));
	}
	
	public WebElement getSomeoneElse() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("someoneElseBtn")));
	}
	
	public WebElement getBothBtn() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("bothBtn")));
	}
	
	public void setBooking(String option) {
		if(option.equalsIgnoreCase("myself")) {
			this.getMyselfBtn().click();
		}else if(option.equalsIgnoreCase("someone else")) {
			this.getSomeoneElse().click();
		}else if(option.equalsIgnoreCase("both")) {
			this.getBothBtn().click();
		}
	}
	
	public WebElement getNextBtn() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("nextBtn")));
	}
	
	public void next() {
		this.getNextBtn().click();
	}
	
	public WebElement getEhicYesBtn() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("ehicYesBtn")));
	}
	
	public WebElement getEhicNoBtn() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("ehicNoBtn")));
	}
	
	public void setEhic(String ehic) {
		if(ehic.equalsIgnoreCase("yes")) {
			this.getEhicYesBtn().click();
		}else if(ehic.equalsIgnoreCase("no")) {
			this.getEhicNoBtn().click();
		}
	}
	
	public WebElement getYesReqBtn() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("reqYesBtn")));
	}
	
	public WebElement getNoReqBtn() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("reqNoBtn")));
	}
	
	public WebElement getHIVBtn() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("hivBtn")));
	}
	
	public WebElement getHepBBtn() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("hepBBtn")));
	}
	
	public WebElement getHepCBtn() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("hepCBtn")));
	}
	
	public void setSpecReq(String req) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		if(req.equalsIgnoreCase("yes")) {
			this.getYesReqBtn().click();
			jse.executeScript("scroll(0,500);");
			this.getHIVBtn().click();
			this.getHepCBtn().click();
		}else if(req.equalsIgnoreCase("no")) {
			this.getNoReqBtn().click();
		}
	}
	
	public WebElement getHomeClinicName() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("homeClinicName")));
	}
	
	public void setHomeClinicName(String hcn) {
		this.getHomeClinicName().sendKeys(hcn);
	}
	
	public WebElement getHomeClinicCity() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("homeClinicCity")));
	}
	
	public void setHomeClinicCity(String hcc) {
		this.getHomeClinicCity().sendKeys(hcc);
	}
	
	public WebElement getHomeClinicCountryCode() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("clinicCountryCode")));
	}
	
	public void setClinicCountryCode(String hccc) {
		this.getHomeClinicCountryCode().sendKeys(hccc);
	}
	
	public WebElement getHomeClinicPhone() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("clinicPhone")));
	}

	public void setClinicPhone(String clinicPhone) {
		this.getHomeClinicPhone().sendKeys(clinicPhone);
	}
	
	public WebElement getInfoBox() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("infoBox")));
	}
	
	public void checkInfoBox() {
		this.getInfoBox().click();
	}
	
	public WebElement getTermsBtn() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("termsBtn")));
	}
	
	public void agreeToTerms() {
		this.getTermsBtn().click();
	}
	
	public WebElement getRegisterBtn() {
		return this.driver.findElement(By.xpath(this.selectors.getProperty("registerBtn")));
	}
	
	public void register() {
		this.getRegisterBtn().click();
	}
	
	public void fillRegForm (String title, String firstName, String lastName, String birthDate, String email,
			                 String password, String countryCode, String phone, String option, String card,
			                 String req, String hcn, String hcc, String hccc, String clinicPhone) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		this.setTitle(title);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setBirthDate(birthDate);
		this.setEmail(email);
		this.setPassword(password);
		this.setCountryCode(countryCode);
		this.setPhone(phone);
		jse.executeScript("scroll(0,500);");
		this.setBooking(option);
		this.next();
		this.setEhic(card);
		this.setSpecReq(req);
		this.setHomeClinicName(hcn);
		this.setHomeClinicCity(hcc);
		this.setClinicCountryCode(hccc);
		this.setClinicPhone(clinicPhone);
		jse.executeScript("scroll(0,2000);");
		//this.checkInfoBox();
		this.agreeToTerms();
		this.register();
//		jse.executeScript("scroll(0,700);");
//		this.next();
//		this.next();
//		jse.executeScript("scroll(0,2000);");
//		this.register();
   }
	
	public boolean isRegistered() {
		try {
			waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selectors.getProperty("sucessNote"))));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}

package tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import common.Datas;
import pages.RegistrationPage;


public class RegistrationTest extends BaseTest{
	String title = Datas.TITLE;
	String firstName = Datas.FIRST_NAME;
	String lastName = Datas.LAST_NAME;
	String dateOfBirth = Datas.DATE_OF_BIRTH;
	String email = Datas.EMAIL;
	String password = Datas.PASSWORD;
	String countryCode = Datas.COUNTRY_CODE;
	String phone = Datas.PHONE;
	String options = Datas.OPTIONS;
	String ehic = Datas.EHIC;
	String request = Datas.SPECIAL_REQUEST;
	String homeClinicName = Datas.HOME_CLINIC_NAME;
	String homeClinicCity = Datas.HOME_CLINIC_CITY;
	String homeClinicCC = Datas.HOME_CLINIC_COUNTRY_CODE;
	String homeClinicPhone = Datas.HOME_CLINIC_PHONE;
	
	@BeforeMethod
	public void setUpForTest() {
		this.driver.navigate().to(this.selectors.getProperty("registrationUrl"));
	}
	
	
	@Test
	public void registrationTest() throws InterruptedException {
		
		RegistrationPage rp = new RegistrationPage(driver,selectors,waiter);
		rp.fillRegForm(title, firstName, lastName, dateOfBirth, email, password, countryCode, 
				       phone, options, ehic, request, homeClinicName, homeClinicCity, 
				       homeClinicCC, homeClinicPhone);
		rp.isRegistered();

	}

}

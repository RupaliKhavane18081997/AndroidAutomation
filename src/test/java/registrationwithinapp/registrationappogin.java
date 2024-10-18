package registrationwithinapp;

import org.testng.annotations.Test;

import pages.registration.registrationOhioandroidApp;
import utils.VerificationUtils;
import Base.BaseTest;
import Base.UtilsKeys;

public class registrationappogin  extends BaseTest{

	@Test
	public void ohioappregistrationpage() throws Exception {
		
		registrationOhioandroidApp      register = new registrationOhioandroidApp();
		register.clickregisterbutton();
		VerificationUtils.validate("true", register.emailfield(), "Click on Email Field");
		VerificationUtils.validate("true", register.passwordfield(), "Click on password Field");
		VerificationUtils.validate("true", register.signupButton(), "Click on Signup Field");
		register.clickemailfield();
		UtilsKeys.press("qwertyuioplkjhgfdsazxcvbnm");
}

}
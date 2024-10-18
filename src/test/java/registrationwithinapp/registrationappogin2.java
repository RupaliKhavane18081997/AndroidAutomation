package registrationwithinapp;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.registration.registrationOhioandroidApp;
import utils.ConstantsConfig;
import utils.DataUtil;
import utils.VerificationUtils;
import Base.BaseTest;
import utils.*;


public class registrationappogin2  extends BaseTest{
	String testCaseName="CreateIncident_111";
	@Test(dataProvider = "getData")
	public void ohioappregistrationpage(Hashtable <String,String> data)  throws Exception {
		if(!DataUtil.isTestExecutable(xls, testCaseName)||  data.get(ConstantsConfig.RUNMODE_COL).equals("No"))
		{
			test.log(Status.SKIP, "Skipping the test as Runmode is No");
			//throw new SkipException("Skipping the test as Runmode is N");
		}
		else
		{
		registrationOhioandroidApp      register = new registrationOhioandroidApp();
		register.clickregisterbutton();
		VerificationUtils.validate("true", register.emailfield(), "Click on Email Field");
		VerificationUtils.validate("true", register.passwordfield(), "Click on password Field");
		VerificationUtils.validate("true", register.signupButton(), "Click on Signup Field");
		data.get("Browser");
		System.out.println(data.get("Browser"));
}
	}
	
	@DataProvider
	public Object[][] getData(){
		return DataUtil.getData(xls, testCaseName);
		
	}
	
}
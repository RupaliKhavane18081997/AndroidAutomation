package createNew;

import java.util.Hashtable;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.BaseTest;
import pom.check.funct.RegWithAdditionalDepartment;
import pom.createIncident.baseIncident;
import utils.ConstantsConfig;
import utils.DataUtil;



public class RegisterWithAdditionalDepartment extends BaseTest {
	baseIncident   createIncident;
	String testCaseName="RegisterWithAdditionalDepartment";
	@Test(dataProvider = "getData", priority = 1)
	public void TestCase01ohioautomation(Hashtable<String,String> data) throws Exception {
		if(!DataUtil.isTestExecutable(xls, testCaseName) ||  data.get(ConstantsConfig.RUNMODE_COL).equals("No"))
		{
			test.log(Status.SKIP, "Skipping the test as Runmode is No");
			LogManager.getLogger().info("Skipping the test as Runmode is No");
			//throw new SkipException("Skipping the test as Runmode is N");
		}
		else
		{
			createIncident = new baseIncident();
			if(data.get("login_mode").contains("OHID")) {
				createIncident.OhioButton();
				createIncident.loginUserID(data.get("OHID_Chief"));
				createIncident.loginPassword(data.get("OHID_Chief_Password"));
				createIncident.clickloginButton();
					
				}else if(data.get("login_mode").contains("IDM")){
					
					try{
						createIncident.Logout();
						createIncident.LoginWithExistingUser(data.get("IDM_Email_ID"),data.get("IDM_Password"));
					}catch (Exception e) {
					createIncident.LoginWithExistingUser(data.get("IDM_Email_ID"),data.get("IDM_Password"));
					}
				}else {
					System.out.print("No Value is present");
					
				}
			
			
			createIncident = new baseIncident();
			
			RegWithAdditionalDepartment RegisWithAdditionalDepartment  = new RegWithAdditionalDepartment();
		}
	}
	@Test(dataProvider = "getData", priority = 2)
		public void RegisWithAdditionalDepartment(Hashtable<String,String> data)throws Exception {
			if(!DataUtil.isTestExecutable(xls, testCaseName) ||  data.get(ConstantsConfig.RUNMODE_COL).equals("No"))
			{
				test.log(Status.SKIP, "Skipping the test as Runmode is No");
				LogManager.getLogger().info("Skipping the test as Runmode is No");
				//throw new SkipException("Skipping the test as Runmode is N");
			}
			else
			{
				
				createIncident = new baseIncident();
				
				RegWithAdditionalDepartment RegWithAdditionalDepartment  = new RegWithAdditionalDepartment();
				RegWithAdditionalDepartment.RegisWithAdditionalDepartment(data.get("StreetAddress"));
				
			}
			}
	@DataProvider
	public Object[][] getData(){
		return DataUtil.getData(xls, testCaseName);
	}
}




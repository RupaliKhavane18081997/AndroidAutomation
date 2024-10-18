package dermTest;


import java.util.Hashtable;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.BaseTest;
import dermAppJava.DermApp;
import pom.check.funct.DecaleRequest;
import pom.createIncident.baseIncident;
import utils.ConstantsConfig;
import utils.DataUtil;



public class DermTest extends BaseTest {
	baseIncident   createIncident;
	String testCaseName="AddDecaleRequest";
	@Test(dataProvider = "getData", priority = 1)
	public void TestCase01LaunchDermApp(Hashtable<String,String> data) throws Exception {
		if(!DataUtil.isTestExecutable(xls, testCaseName) ||  data.get(ConstantsConfig.RUNMODE_COL).equals("No"))
		{
			test.log(Status.SKIP, "Skipping the test as Runmode is No");
			LogManager.getLogger().info("Skipping the test as Runmode is No");
			//throw new SkipException("Skipping the test as Runmode is N");
		}
		else
		{
			createIncident = new baseIncident();
			//createIncident.Derm();
			
		}
	}
	@Test(dataProvider = "getData", priority = 2)
		public void TestCase02DermMenu(Hashtable<String,String> data)throws Exception {
			if(!DataUtil.isTestExecutable(xls, testCaseName) ||  data.get(ConstantsConfig.RUNMODE_COL).equals("No"))
			{
				test.log(Status.SKIP, "Skipping the test as Runmode is No");
				LogManager.getLogger().info("Skipping the test as Runmode is No");
				//throw new SkipException("Skipping the test as Runmode is N");
			}
			else
			{
				
				createIncident = new baseIncident();
				DermApp DermApp  = new DermApp();
				DermApp.LaunchDermApp(data.get("StreetAddress"));
				
				
			}
			}
	@DataProvider
	public Object[][] getData(){
		return DataUtil.getData(xls, testCaseName);
	}
}




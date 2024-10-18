
package createIncident;

import java.util.Hashtable;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.BaseTest;
import pom.createIncident.*;
import utils.ConstantsConfig;
import utils.DataUtil;
import utils.VerificationUtils;

public class CreateIncident_653 extends BaseTest {
	baseIncident createIncident;
	String testCaseName = "CreateIncident_653";

	@Test(dataProvider = "getData", priority = 1)
	public void TestCase01ohioautomation(Hashtable<String, String> data) throws Exception {
		if (!DataUtil.isTestExecutable(xls, testCaseName) || data.get(ConstantsConfig.RUNMODE_COL).equals("No")) {
			test.log(Status.SKIP, "Skipping the test as Runmode is No");
			LogManager.getLogger().info("Skipping the test as Runmode is No");
			// throw new SkipException("Skipping the test as Runmode is N");
		} else {
			createIncident = new baseIncident();
			if (data.get("login_mode").contains("OHID")) {
				createIncident.OhioButton();
				createIncident.loginUserID(data.get("OHID_Chief"));
				createIncident.loginPassword(data.get("OHID_Chief_Password"));
				createIncident.clickloginButton();

			} else if (data.get("login_mode").contains("IDM")) {

				try {
					createIncident.Logout();
					createIncident.LoginWithExistingUser(data.get("IDM_Email_ID"), data.get("IDM_Password"));
				} catch (Exception e) {
					createIncident.LoginWithExistingUser(data.get("IDM_Email_ID"), data.get("IDM_Password"));
				}
			} else {
				System.out.print("No Value is present");

			}

			createIncident.clickCreateIncidet();
			createIncident.SearchBar(data.get("Incident_Type"));
			createIncident.getkeyandclick(data.get("FDID"));
			createIncident.Date();
			createIncident.Address(data.get("StreetAddress"));
			createIncident.getkeyandclick(data.get("AidGiven"));
			createIncident.nextbutton();
			// E1
		}
	}

	@Test(dataProvider = "getData", priority = 2)
	public void TestCase02CreateNewIncident(Hashtable<String, String> data) throws Exception {
		if (!DataUtil.isTestExecutable(xls, testCaseName) || data.get(ConstantsConfig.RUNMODE_COL).equals("No")) {
			test.log(Status.SKIP, "Skipping the test as Runmode is No");
			LogManager.getLogger().info("Skipping the test as Runmode is No");
			// throw new SkipException("Skipping the test as Runmode is N");
		} else {
			createIncident = new baseIncident();

			createIncident.E1datesandtimes();
			createIncident.nextbutton();
			// E2
			createIncident.nextbutton();
			// E3
			createIncident.nextbutton();
			// F Action Taken
			createIncident.FActiontaken(data.get("BasicActionTaken"));
			createIncident.nextbutton();
			// G1 Resourse
			createIncident.G1Resourse();
			createIncident.nextbutton();
			// G2 Estimated Dollar Losses and values
			createIncident.G2EstimatedDollarLossesandvalues(data.get("PropertyLosses"), data.get("ContentsLosses"));
			createIncident.nextbutton();
			// H1 Casualties
			H1Casualties h1casualties = new H1Casualties();
			h1casualties.Deathenter(data.get("FireServiceDeath"), data.get("FireServiceInjuries"));
			h1casualties.civilian(data.get("CivilianDeath"), data.get("CivilianInjuries"));
			createIncident.nextbutton();
			// H2 Dectector
			h2casualties h2casualties = new h2casualties();
			h2casualties.Detector(data.get("Detector"));
			// H# Hazardous Mateail realease
			h3Hazardousmaterailsrelease h3Hazardousmaterailsrelease = new h3Hazardousmaterailsrelease();
			h3Hazardousmaterailsrelease.HazardousMaterialsRelease(data.get("HazardousMaterialsRelease"));
			// I mixed use Property
			createIncident.nextbutton();
			// J proprty use Structure
			jpropertyusestructure jpropertyusestructure = new jpropertyusestructure();
			jpropertyusestructure.jpropertystuct(data.get("PropertyUseStructure"));
			createIncident.nextbutton();
		}
	}

	@Test(dataProvider = "getData", priority = 3)
	public void TestCase03ApparatusAndPersonnal(Hashtable<String, String> data) throws Exception {
		// k1 - person
		createIncident.nextbutton();
		// k2 - owner
		k2owner k2owner = new k2owner();
		k2owner.k2own();
		createIncident.nextbutton();
		// l remarks
		Lremarks lmark = new Lremarks();
		lmark.lremark(data.get("Remark"));
		// mauthorize
		mauthorization mauthorization = new mauthorization();
		mauthorization.mauthoriz();
		createIncident.nextbutton();
		// Basic end
		// Appratus
		AppratusPersonal AppratusPersonal = new AppratusPersonal();
		AppratusPersonal.apppersonalselect(data.get("ApparatusName"), data.get("Personnel"),
				data.get("RemarkAppratusAndPersonnel"));
		// createIncident.nextbutton();
		try {
			createIncident.nextbutton();
		} catch (Exception e) {
		}

	}


	@Test(dataProvider = "getData", priority = 4)
	public void TestCase04FireSeriveCasuality(Hashtable<String, String> data) throws Exception {

		// FireSeriveCasuality

		FireSeriveCasuality FireSeriveCasuality = new FireSeriveCasuality();
		FireSeriveCasuality.FireCasuality(data.get("FireServiceDeath"), data.get("FireServiceInjuries"),
				data.get("FireCasultyName"), data.get("Age"), data.get("FireCasultySeverity"));
		//createIncident.nextbutton();
		//createIncident.nextbutton();

	}

	
	@Test(priority = 5)
	public void TestCase05Submit_Incident() throws InterruptedException
	{
		Submit_Incident Submit_Incident= new Submit_Incident();
		Submit_Incident.End();
		VerificationUtils.validate("true",Submit_Incident.verifySuccessfulMessage(),"Sucess incodent Created" );

		
	}

	@DataProvider
	public Object[][] getData() {
		return DataUtil.getData(xls, testCaseName);
	}
}

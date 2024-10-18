
package createIncident;

import java.util.Hashtable;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.BaseTest;
import pom.createIncident.H1Casualties;
import pom.createIncident.baseIncident;
import pom.createIncident.h2casualties;
import pom.createIncident.h3Hazardousmaterailsrelease;
import pom.createIncident.*;
import utils.ConstantsConfig;
import utils.DataUtil;
import utils.VerificationUtils;


public class CreateIncident_111 extends BaseTest {
	baseIncident   createIncident;
	String testCaseName="CreateIncident_111";
	@Test(dataProvider="getData",priority = 1)
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
						createIncident.Derm();
						createIncident.LoginWithExistingUser(data.get("IDM_Email_ID"),data.get("IDM_Password"));
					}catch (Exception e) {
					createIncident.LoginWithExistingUser(data.get("IDM_Email_ID"),data.get("IDM_Password"));
					}
				}else {
					System.out.print("No Value is present");
					
				}
			
			
			createIncident.clickCreateIncidet();
			createIncident.SearchBar(data.get("Incident_Type"));
			createIncident.getkeyandclick(data.get("FDID"));
			createIncident.Date();
			createIncident.Address(data.get("StreetAddress"));
			createIncident.getkeyandclick(data.get("AidGiven"));
			createIncident.nextbutton();
			//E1
		}
	}
		@Test(dataProvider="getData", priority = 2	)
		public void TestCase02CreateNewIncident(Hashtable<String,String> data)throws Exception {
			if(!DataUtil.isTestExecutable(xls, testCaseName) ||  data.get(ConstantsConfig.RUNMODE_COL).equals("No"))
			{
				test.log(Status.SKIP, "Skipping the test as Runmode is No");
				LogManager.getLogger().info("Skipping the test as Runmode is No");
				//throw new SkipException("Skipping the test as Runmode is N");
			}
			else
			{
				createIncident = new baseIncident();
				
			createIncident.E1datesandtimes();
			createIncident.nextbutton();
			//E2
			createIncident.nextbutton();
			//E3
			createIncident.nextbutton();
			//F Action Taken
			createIncident.FActiontaken(data.get("BasicActionTaken"));
			createIncident.nextbutton();
			//G1 Resourse
			createIncident.G1Resourse();
			createIncident.nextbutton();
			//G2 Estimated Dollar Losses and values
			createIncident.G2EstimatedDollarLossesandvalues(data.get("PropertyLosses"), data.get("ContentsLosses"));
			createIncident.nextbutton();
			//H1 Casualties
			H1Casualties  h1casualties = new H1Casualties();
			h1casualties.Deathenter(data.get("FireServiceDeath"),data.get("FireServiceInjuries"));
			h1casualties.civilian(data.get("CivilianDeath"),data.get("CivilianInjuries"));
			createIncident.nextbutton();
			//H2 Dectector
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
		
		
		@Test(dataProvider="getData", priority = 3)
		public void TestCase03ApparatusAndPersonnal(Hashtable<String,String> data) throws Exception {
			// k1 - person
			createIncident.nextbutton();
			//k2 - owner
			k2owner k2owner = new k2owner();
			k2owner.k2own();
			createIncident.nextbutton();
			// l remarks
			Lremarks  lmark= new Lremarks();
			lmark.lremark(data.get("Remark"));
			//mauthorize
			mauthorization mauthorization = new mauthorization();
			mauthorization.mauthoriz();
			createIncident.nextbutton();
			// Basic end
			//Appratus
			AppratusPersonal AppratusPersonal = new AppratusPersonal();
			AppratusPersonal.apppersonalselect(data.get("ApparatusName"), data.get("Personnel"), data.get("RemarkAppratusAndPersonnel"));
			//createIncident.nextbutton();
			try { createIncident.nextbutton();}catch(Exception e){}

			
		}
		
		
		@Test(dataProvider="getData", priority = 4)
		public  void TestCase04Fire(Hashtable<String,String> data) throws Exception {
			//Fire
			
			//B1_PrpertyDetails
			B1_PrpertyDetails B1_PrpertyDetails = new B1_PrpertyDetails();
			B1_PrpertyDetails.B1_PropertyDeals();
			createIncident.nextbutton();
			
			
			//C_onSIteMaterials or Product
			
			C_OnSIteMaterialsOrProduct C_OnSIteMaterialsOrProduct  = new C_OnSIteMaterialsOrProduct();
			C_OnSIteMaterialsOrProduct.C_OnSIteMaterials();
			createIncident.nextbutton();
			
			
			//D_Ignition
			D_Ignition D_Ignition = new D_Ignition();
			D_Ignition.D_Igni(data.get("ItemFirstIgnited"),data.get("TypeofMaterialFirstIgnited"));
			createIncident.nextbutton();
			
			//E1_CauseOfIgnition
			
			E1_CauseOfIgnition E1_CauseOfIgnition =new E1_CauseOfIgnition();
			E1_CauseOfIgnition.CauseofIgnition(data.get("CauseofIgnition"));
			createIncident.nextbutton();
			
			
			//E2_FactorsOfIgnition
			
			E2_FactorsOfIgnition E2_FactorsOfIgnition = new E2_FactorsOfIgnition();
			E2_FactorsOfIgnition.FactorsForIginiti(data.get("FactorsContributingtoIgnition"));
			createIncident.nextbutton();
			
			//E3_HumanFactors
			E3_HumanFactors E3_HumanFactors = new E3_HumanFactors();
			E3_HumanFactors.E3_HumanFactorstoInginition(data.get("HumanFactorsContributingtoIgnition"));
			createIncident.nextbutton();
			
			//F1_EquipmentInvolvedinIgnition
			F1_EquipmentInvolvedinIgnition F1_EquipmentInvolvedinIgnition = new F1_EquipmentInvolvedinIgnition();
			F1_EquipmentInvolvedinIgnition.F1EquipmentInvolvedinIgnition(data.get("EquipmentInvolvedinIgnition"));
			createIncident.nextbutton();
			
			
			
			//F2_EquipmentPowerSource
			
			F2_EquipmentPowerSource F2_EquipmentPowerSource = new F2_EquipmentPowerSource();
			F2_EquipmentPowerSource.F2EquipmentPowerSource(data.get("EquipmentPowerSource"));
			createIncident.nextbutton();
			
			//F3_Equipmentortability
			F3_Equipmentortability F3_Equipmentortability= new F3_Equipmentortability();
			F3_Equipmentortability.F3Equipmentortability();
			createIncident.nextbutton();
			
			//G_FireSupression
			G_FireSupression G_FireSupression = new G_FireSupression();
			G_FireSupression.GFireSupression(data.get("FireSuppressionFactors1"));
			createIncident.nextbutton();
			
			//H1MobileProperty
			H1_MobileProperty H1_MobileProperty= new H1_MobileProperty();
			H1_MobileProperty.H1MobileProperty(data.get("MobilePropertyInvolved"));
			createIncident.nextbutton();
			createIncident.nextbutton();
			try{createIncident.nextbutton();}catch (Exception e) {}
		}
		
		@Test(dataProvider="getData", priority = 5)
		public  void TestCase05StructureFire(Hashtable<String,String> data) throws Exception {
			//Structure Started
			//l1StrutureType
			Structuretype Structuretype = new Structuretype();
			Structuretype.Structype(data.get("StructureType"));
			createIncident.nextbutton();
			
			
			
			  //Building Status 
			  I2_BuildingStatus I2_BuildingStatus= new
			  I2_BuildingStatus();
			  I2_BuildingStatus.BuildingStat(data.get("BuildingStatus"));
			  createIncident.nextbutton();
			 
			
			
			
			//Building height
			buildingHeight buildingHeight = new buildingHeight();
			buildingHeight.building(data.get("BuildingHeightAboveGrade"), data.get("BuildingHeightBelowGrade"));
			createIncident.nextbutton();
			// L4 Main Floor Size 
			l4mainfloorsize l4mainfloorsize = new l4mainfloorsize();
			l4mainfloorsize.mainfloor(data.get("TotalSquareFeet"));
			createIncident.nextbutton();
			// j1 FireOrgin
			j1fireorigin j1fireorigin = new j1fireorigin();
			j1fireorigin.origin(data.get("StoryofFireOrigin"));
			createIncident.nextbutton();
			//j2 Fire Spread
			j2firespread j2firespread = new j2firespread();
			j2firespread.firespread(data.get("FireSpread"));
			createIncident.nextbutton();
			//j3 Fire Spread
			createIncident.nextbutton();
			// k type of material contributing Most of flame spread?
			createIncident.nextbutton();
			// L1 Present of Detectors
			l1presentdetectors   l1presentdetectors   = new l1presentdetectors();
			l1presentdetectors.detectorspres();
			createIncident.nextbutton();
			// l2 dec type
			l2dectortype l2dectortype = new l2dectortype();
			l2dectortype.detectorspres();
			createIncident.nextbutton();
			// l3 Dectors Power Suply 
			l3dectorspowersupply l3dectorspowersupply = new l3dectorspowersupply();
			l3dectorspowersupply.powersuppky();
			createIncident.nextbutton();
			//l4 detectors
			l4DetectorOperation l4DetectorOperation = new l4DetectorOperation();
			l4DetectorOperation.detectorops();
			createIncident.nextbutton();
			//M1 Presence of Automatic Extinguishing System
			m1presenceofautomaticsystems m1presenceofautomaticsystems = new m1presenceofautomaticsystems();
			m1presenceofautomaticsystems.systems();
			createIncident.nextbutton();
			// m2 
			createIncident.nextbutton();
			// m3 
			createIncident.nextbutton();
			// m4
			createIncident.nextbutton();
			// m5
			createIncident.nextbutton();
				
			
			createIncident.nextbutton();
			// structure Complete
		}
		
		@Test(dataProvider="getData", priority = 6)
		public  void TestCase06Civillian_FireCasualty(Hashtable<String,String> data) throws Exception {
			//Civillian_FireCasualty
			
			Civillian_FireCasualty Civillian_FireCasualty= new Civillian_FireCasualty();
			Civillian_FireCasualty.CivillianFireCasualty(data.get("CivilianDeath"), data.get("CivilianInjuries"),data.get("VictimFirstName"), data.get("VictimLastName"), data.get("Age"), data.get("Severity"));
			createIncident.nextbutton();
			createIncident.nextbutton();
			try {createIncident.nextbutton();}catch(Exception e ) {}
			
		}
		
		
		@Test(dataProvider="getData", priority = 7)
		public  void TestCase07FireSeriveCasuality(Hashtable<String,String> data) throws Exception {
		
			//FireSeriveCasuality
			
			FireSeriveCasuality FireSeriveCasuality= new FireSeriveCasuality();
			FireSeriveCasuality.FireCasuality(data.get("FireServiceDeath"),data.get("FireServiceInjuries"),data.get("FireCasultyName"),data.get("Age"),data.get("FireCasultySeverity"));
			createIncident.nextbutton();
			createIncident.nextbutton();
		
		}	
			
		

		@Test(dataProvider="getData", priority = 8)
		public  void TestCase08EMS(Hashtable<String,String> data) throws Exception {
			  //EMS
			  
			  EMS EMS = new EMS(); EMS.EMStatus(data.get("ProviderImpAss"),data.get("ProUsed"),data.get("initialArrestRhythm"),data.get("IntLevelOfProvider")); createIncident.nextbutton();
			  createIncident.nextbutton();
			 
		}
		

		@Test(dataProvider="getData", priority = 9)
		public  void TestCase09HazMAt(Hashtable<String,String> data) throws Exception {
			
			//HazMat
			HazMat HazMat = new HazMat();
			HazMat.HazMatDetails();
			HazMat.HazMatchemical(data.get("ChemicalName"),data.get("EstimatedAmountReleased"));
			createIncident.nextbutton();
		}

		@Test(dataProvider="getData", priority = 10)
		public  void TestCase10Arson(Hashtable<String,String> data) throws Exception {
			//Arson
			
			Arson Arson=new Arson();
			Arson.ArsonDetails();
			//VerificationUtils.validate("true",Arson.verifySuccessfulMessage(),"Sucess incodent Created" );
			
		}


	
	@DataProvider
	public Object[][] getData(){
		return DataUtil.getData(xls, testCaseName);
	}
}

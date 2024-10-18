package RelationalEditsVerification;


import java.util.Hashtable;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.BasePage;
import Base.BaseTest;
import RelationalEdits.IncidentType_modulepage;
import pom.createIncident.*;
import utils.ConstantsConfig;
import utils.DataUtil;
import utils.VerificationUtils;
import Base.BaseTest;
import utils.ExcelReader;



public class IncidentType extends BaseTest {
	public static String Incident_Name;
	public static String Basic_Module;
	public static String Fire_Module;
	public static String Structure_Fire_Module;
	public static String Civilian_Fire_Casualty_Module;	
	public static String Fire_Service_Casualty_Module;
	public static String EMS_Module;
	public static String HazMat_Module;
	public static String Wildland_Fire_Module;
	public static String Apparatus_Module;
	public static String Arson_Module;
	baseIncident   createIncident;
	
	//public static int Building_fire = 2;
	IncidentType_modulepage IncidentType_modulepage;
	String testCaseName="IncidentType";
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
			
				ExcelReader ExcelReader = new ExcelReader(System.getProperty("user.dir")+"//data//Data_3DI.xlsx");
				for (int Incident_types = 2; Incident_types<=ExcelReader.getRowCount("Incident Type - Module"); Incident_types++ )
					
				{
				
				Incident_Name = ExcelReader.getCellData("Incident Type - Module",1,Incident_types);
				Basic_Module = ExcelReader.getCellData("Incident Type - Module",5,Incident_types);
				Fire_Module  = ExcelReader.getCellData("Incident Type - Module",6,Incident_types);
				Structure_Fire_Module =  ExcelReader.getCellData("Incident Type - Module",7,Incident_types);
				Civilian_Fire_Casualty_Module = ExcelReader.getCellData("Incident Type - Module",8,Incident_types);
				Fire_Service_Casualty_Module = ExcelReader.getCellData("Incident Type - Module",9,Incident_types);
				EMS_Module = ExcelReader.getCellData("Incident Type - Module",10,Incident_types);
				HazMat_Module =  ExcelReader.getCellData("Incident Type - Module",11,Incident_types);
				Wildland_Fire_Module = ExcelReader.getCellData("Incident Type - Module",12,Incident_types);
				Apparatus_Module = ExcelReader.getCellData("Incident Type - Module",13,Incident_types);
				Arson_Module = ExcelReader.getCellData("Incident Type - Module",15,Incident_types);
				System.out.println(Incident_Name);
				System.out.println(Basic_Module);
				System.out.println(Fire_Module);
				System.out.println(Structure_Fire_Module);
				System.out.println(Civilian_Fire_Casualty_Module);
				System.out.println(Fire_Service_Casualty_Module);
				System.out.println(EMS_Module);
				System.out.println(HazMat_Module);
				System.out.println(Wildland_Fire_Module);
				System.out.println(Apparatus_Module);
				System.out.println(Arson_Module);
				
			
			
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
			
			
			createIncident.clickCreateIncidet();
			createIncident.SearchBar(Incident_Name);
// basic module check 
			if(Basic_Module.contains("Mandatory")) {
				IncidentType_modulepage = new IncidentType_modulepage();
				IncidentType_modulepage.basicmandatorycheck();
					
				}else {
					System.out.print("No Value is present");
					
				}

// appratus module
			if(Apparatus_Module.contains("Mandatory")) {

				IncidentType_modulepage.appratusmandatorycheck();
			}else if(Apparatus_Module.contains("Optional")){
				
				
			}else {
				System.out.print("No Value is present");
				
			}
			
// fire 
			if(Fire_Module.contains("Mandatory")) {
				
				BasePage.SwipetoModule();
				IncidentType_modulepage.FireMandatorycheck();
				
				
			}else if(Fire_Module.contains("Optional")){
				BasePage.SwipetoModule();
				IncidentType_modulepage.FireOptionalcheck();
				
			}else {
				System.out.print("No Value is present");
				
			}
		
			if(Arson_Module.contains("Optional")) {
				IncidentType_modulepage.FireClick();
				createIncident = new baseIncident();
				IncidentType_modulepage.scrolltonext();
				createIncident.nextbutton();
				createIncident.nextbutton();
				createIncident.nextbutton();
				BasePage.SwipetoModule();
				//BasePage.SwipetoModule();
				E1_CauseOfIgnition E1_CauseOfIgnition = new E1_CauseOfIgnition();
				E1_CauseOfIgnition.CauseofIgnition(data.get("CauseofIgnition"));
				//BasePage.SwipetoModule();
				}else {
					System.out.println("Arson is not Optional");
				}
// stucturer fire module 
			
			
			if(Structure_Fire_Module.contains("Mandatory")) {
				Thread.sleep(5000);
				BasePage.SwipetoModule();
				
				
				
			}else if(Structure_Fire_Module.contains("Optional")){
				Thread.sleep(5000);
				BasePage.SwipetoModule();
				IncidentType_modulepage.StructureFireOptionalcheck();
				
			}else {
				System.out.print("No Value is present");
				
			}
// civilian fire casualty Module
			if(Civilian_Fire_Casualty_Module.contains("Mandatory")) {
				Thread.sleep(5000);
				BasePage.SwipetoModule();
				
	
			
		}else if(Civilian_Fire_Casualty_Module.contains("Optional")){
			Thread.sleep(5000);
			BasePage.SwipetoModule();
			IncidentType_modulepage.CivialFireCasualtyOptionalCheck();
			
		}else {
			System.out.print("No Value is present");
			
		}
//Fire_Service_Casualty_Module
			if(Fire_Service_Casualty_Module.contains("Mandatory")) {
				
				
			}else if(Fire_Service_Casualty_Module.contains("Optional")){
				Thread.sleep(5000);
				BasePage.SwipetoModule();
				BasePage.SwipetoModule();
				BasePage.SwipetoModule();
				BasePage.SwipetoModule();
				BasePage.SwipetoModule();
				
				
			}else {
				System.out.print("No Value is present");
				
			}
//EMS_Module
			if(EMS_Module.contains("Mandatory")) {
				
				
			}else if(EMS_Module.contains("Optional")){
				Thread.sleep(5000);
				BasePage.SwipetoModule();
				BasePage.SwipetoModule();
				BasePage.SwipetoModule();
				IncidentType_modulepage.EMSOptionalCheck();
				
			}else {
				System.out.print("No Value is present");
				
			}
//HazMat_Module
			if(HazMat_Module.contains("Mandatory")) {
				

				
			}else if(HazMat_Module.contains("Optional")){
				Thread.sleep(5000);
				BasePage.SwipetoModule();
				IncidentType_modulepage.HazMatOptionalCheck();
				
			}else {
				System.out.print("No Value is present");
				
			}
			
//Wildland_Fire_Module
			if(Wildland_Fire_Module.contains("Mandatory")) {
				

				
			}else if(Wildland_Fire_Module.contains("Optional")){
				IncidentType_modulepage.WindLandOptional();
				
			}else if(Wildland_Fire_Module.contains("Or")){
				IncidentType_modulepage.WindLandOR();
				
			}else {
				System.out.print("No Value is present");
				
			}
//Arson_Module
			if(Arson_Module.contains("Mandatory")) {
				Thread.sleep(5000);
				BasePage.SwipetoModule();
			}else if(Arson_Module.contains("Optional")){
				Thread.sleep(5000);
				BasePage.SwipetoModule();
				IncidentType_modulepage.ArsonOptionalCheck();
				
			}else {
				System.out.print("No Value is present");
				
			}
			
// terminate app
			
	}
		}	}
	
@DataProvider
	public Object[][] getData(){
		return DataUtil.getData(xls, testCaseName);
	}
}

package RelationalEdits;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;
import Base.BaseTest;
import Base.UtilsKeys;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pom.createIncident.baseIncident;
import utils.*;


public class IncidentType_modulepage extends BasePage{

	public IncidentType_modulepage() 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@FindBy(xpath = "//android.widget.TextView[@text='Basic']//..//android.widget.TextView[@resource-id='com.threedi.ohioNFERs.qa:id/txtErrorCount']")
	private AndroidElement ErrorCountBasicMendatory;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Basic']")
	private AndroidElement Basictabname;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Apparatus & Personnel']//..//android.widget.TextView[@resource-id='com.threedi.ohioNFERs.qa:id/txtErrorCount']")
	private AndroidElement Appratuserrorcount;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Apparatus & Personnel']")
	private AndroidElement appratus;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Fire']//..//android.widget.TextView[@resource-id='com.threedi.ohioNFERs.qa:id/txtErrorCount']")
	private AndroidElement FireMandatory;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Fire']")
	private AndroidElement Fire;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Structure Fire']//..//android.widget.TextView[@resource-id='com.threedi.ohioNFERs.qa:id/txtErrorCount']")
	private AndroidElement StructureFireMandatory;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Fire']")
	private AndroidElement StructureFire;

	@FindBy(xpath = "//android.widget.TextView[@text='Civilian Fire Casualty']")
	private AndroidElement CivilianFireCasualty;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Fire Service Casualty']")
	private AndroidElement FireServiceCasualty;
	
	@FindBy(xpath = "//android.widget.TextView[@text='EMS']")
	private AndroidElement EMS;
	
	@FindBy(xpath = "//android.widget.TextView[@text='HazMat']")
	private AndroidElement HazMat;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Arson']")
	private AndroidElement Arson;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Wildland']")
	private AndroidElement Wildland;
	
	@FindBy(id = "com.threedi.ohioNFERs.qa:id/btnNext")
	private AndroidElement btnNext;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Wildland']//..//android.widget.TextView[@resource-id='com.threedi.ohioNFERs.qa:id/txtErrorCount']")
	private AndroidElement WindLanderrorcount;
	
	
	
	
	
	
	
     public void basicmandatorycheck() 
     {
    	 
    	 for(int i = 0; i<=5; i++) {
    			try {
//    		try {
//    			Thread.sleep(3000l);
//    		} catch (Exception e) {}
    	 
	  
	 wLib.waitForElemnetToBeVisible(Basictabname);
	 VerificationUtils.validate("true", present(ErrorCountBasicMendatory), "Mandatory is Present");
	 break;
    			}catch (Exception ser) {}
    	 }
     }
     public void appratusmandatorycheck() 
     {
    	 
     wLib.waitForElemnetToBeVisible(appratus);
	 VerificationUtils.validate("true", present(Appratuserrorcount), "Basic Mandatory is Present");

     }
     
     public void FireMandatorycheck() 
     {
    	 
     wLib.waitForElemnetToBeVisible(Fire);
	 VerificationUtils.validate("true", present(FireMandatory), "Fire Mandatory is Present");

     }
     
     public void FireOptionalcheck()
     {
    	 VerificationUtils.validate("true", present(Fire), "Fire Optional Check");
 
     }
     
     public void StructureFireMandatorycheck() 
     {
    
    // SwipetoModule(); 
     wLib.waitForElemnetToBeVisible(StructureFire);
	 VerificationUtils.validate("true", present(StructureFireMandatory), "Structure Fire Mandatory check");

     }
     public void StructureFireOptionalcheck() 
     {
    
	 VerificationUtils.validate("true", present(StructureFire), "Structure Fire Optional check");

     }
     
     public void CivialFireCasualtyOptionalCheck() 
     {
    
	 VerificationUtils.validate("true", present(CivilianFireCasualty), "Civilian Fire Optional check");

     }
     
     public void FireServiceCasualtyOptionalCheck() 
     {
    
	 VerificationUtils.validate("true", present(FireServiceCasualty), "Fire Service Optional check");

     }
     
     public void EMSOptionalCheck() 
     {
    
	 VerificationUtils.validate("true", present(EMS), "EMS Optional check");

     }
     
     public void HazMatOptionalCheck() 
     {
    
	 VerificationUtils.validate("true", present(HazMat), "Hazmat Optional check");

     }
     
     public void ArsonOptionalCheck() 
     {
    
	 VerificationUtils.validate("true", present(Arson), "Arson Optional check");

     }
     
     public void FireClick() 
     {
    
    	 click(Fire);

     }
     public void WindLandOptional() {
    		VerificationUtils.validate("true", present(Wildland), "Wildland is Present");
    	}

     public void WindLandOR() {
    		VerificationUtils.validate("true", present(WindLanderrorcount), "ArsonErrorCount is Present");
    	}
    	
     public void scrolltonext() throws InterruptedException
     {
    	 Scrolltoelement(btnNext,5,"btnNext");
     }
  
     
}

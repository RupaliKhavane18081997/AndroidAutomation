package createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;
import Base.UtilsKeys;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.testng.annotations.Parameters;

public class CreateIncident111  extends BasePage{
	
	public CreateIncident111()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(id = "com.threedi.ohioNFERs.qa:id/btnOhIdLogin")
	private AndroidElement OhioButton;
	
	@FindBy(xpath="//input[@id='loginUserID']")
	private WebElement loginUserID;
	
	@FindBy(xpath="//input[@id='loginPassword']")
	private WebElement loginPassword;
	
	@FindBy(xpath="//button[@id='loginSubmit']")
	private WebElement clickloginButton;
	
	@FindBy(xpath="//android.widget.TextView[@text='Create Incident']")
	private AndroidElement clickCreateIncidet;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtSearch")
	private AndroidElement SearchBar;
	
	/*
	 * @FindBy(xpath="//android.widget.TextView[@text='11 - Structure Fire']")
	 * private AndroidElement StructureFire;
	 * 
	 */
	@FindBy(xpath="(//android.view.ViewGroup[@index='0'])[3]") private
	 AndroidElement BuilidingFire_111;
	 
	
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement FDID;
	  
//	@FindBy("//android.widget.TextView[@text='"+FDI+"']")
//	private AndroidElement SelectOhid; 

	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	private AndroidElement Done;
	  
	@FindBy(xpath="//android.widget.TextView[@text='MM/DD/YYYY']")
	private AndroidElement Date;
	 
	@FindBy(xpath="//android.view.View[@text='20']")
	private AndroidElement Day;
	
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	private AndroidElement OK;
	
	@FindBy(xpath="//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")
	private AndroidElement NextButton;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtSearch")
	private AndroidElement Address;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/line1")
	private AndroidElement SelectAddressFromSuggestions;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/txtValue")
	private AndroidElement AidGiven;
	
	@FindBy(xpath="//android.widget.TextView[@text='2 - Automatic aid received']")
	private AndroidElement SelectAidGiven;
	
	
	@FindBy(xpath="(//android.widget.ImageView[@index='0'])[2]")
	private AndroidElement Time;
	
	
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	private AndroidElement OKbutton;
	
	@FindBy(xpath="(//android.widget.CheckBox[@resource-id='com.threedi.ohioNFERs.qa:id/chbCustomView'])[1]")
	private AndroidElement Clock1;
	
	
	@FindBy(xpath="(//android.widget.CheckBox[@resource-id='com.threedi.ohioNFERs.qa:id/chbCustomView'])[2]")
	private AndroidElement SameAsAlarm1;
	
	
	
	@FindBy(xpath="(//android.widget.CheckBox[@resource-id=\\\"com.threedi.ohioNFERs.qa:id/chbCustomView\\\"])[2]")
	private AndroidElement SameAsAlarm2;
	
	@FindBy(xpath="(//android.widget.TextView[@text='Select'])[1]")
	private AndroidElement PrimaryAction;
	
	@FindBy(xpath="//android.widget.TextView[@text='10 - Fire control or extinguishment, other']")
	private AndroidElement FireControl;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/chbCustomView")
	private AndroidElement CheckBox;
	
	
	@FindBy(xpath="(//android.widget.CheckBox[@index='0'])[1]")
	private AndroidElement Property;
	
	@FindBy(xpath="(//android.widget.CheckBox[@index='0'])[2]")
	private AndroidElement Contents;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/chbCustomView")
	private AndroidElement NoCasualities;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/chbCustomView")
	private AndroidElement propertyUse;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtValue")
	private AndroidElement LRemarks;
	

	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Apparatus;
	
	@FindBy(xpath="//android.widget.TextView[@text='123-Dozer or plow']")
	private AndroidElement SelectApparatus;
	
	@FindBy(xpath="//android.widget.TextView[@text='MM/DD/YYYY']")
	private AndroidElement AppDate;
	
	@FindBy(xpath="(//android.widget.CheckBox[@resource-id='com.threedi.ohioNFERs.qa:id/chbCustomView'])[3]")
	private AndroidElement SelectCheckBox3;
	
	@FindBy(xpath="(//android.widget.CheckBox[@resource-id='com.threedi.ohioNFERs.qa:id/chbCustomView'])[4]")
	private AndroidElement SelectCheckBox4;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnAdd")
	private AndroidElement Personnel;
	
	@FindBy(xpath="(//android.widget.TextView[@text='Select'])[1]")
	private AndroidElement SelectPersonnel;
	
	@FindBy(xpath="//android.widget.TextView[@text='Pratik Desai']")
	private AndroidElement SelectPersonnelName;
	
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/tvLoginMyService")
	private AndroidElement SelectPersonnelNameSubmit;
		
	
	
	
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	private AndroidElement AppDateOk;
	
	
	
	@FindBy(xpath="//android.widget.RadioButton[@text='Not Residential']")
	private AndroidElement NotResidential;
	
	@FindBy(xpath="//android.widget.RadioButton[@text='Buildings not involved']")
	private AndroidElement Buildings;
	
	@FindBy(xpath="//android.widget.RadioButton[@text='None']")
	private AndroidElement None ;
	
	@FindBy(xpath="//android.widget.RadioButton[@text='No']")
	private AndroidElement OnSiteMAterial;
	
	
	
	@FindBy(xpath="(//android.widget.TextView[@resource-id='com.threedi.ohioNFERs.qa:id/txtValue'])[1]")
	private AndroidElement AreaOfFire;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='01 - Hallway corridor, mall']")
	private AndroidElement Hallway;
	
	@FindBy(xpath="(//android.widget.TextView[@resource-id='com.threedi.ohioNFERs.qa:id/txtValue'])[2]")
	private AndroidElement HeatSource;
	
	
	
	@FindBy(xpath="//android.widget.TextView[@text='10 - Heat from powered equipment, other']")
	private AndroidElement SelectHeatSource;
	
	@FindBy(xpath="//android.widget.TextView[@text='NNN - None']")
	private AndroidElement Equipment1;
	
	@FindBy(xpath="//android.widget.TextView[@text='112 - Heat pump']")
	private AndroidElement EquipmentInvolved;
	
	
	@FindBy(xpath="(//android.widget.TextView[@resource-id='com.threedi.ohioNFERs.qa:id/txtValue'])[3]")
	private AndroidElement ItemFirstIgnited;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='10 - Structural component or finish, other']")
	private AndroidElement SelectItemFirstIgnited;
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement TypeOfMaterial;
	
	@FindBy(xpath="//android.widget.TextView[@text='20 - Flammable or combustible liquid, other']")
	private AndroidElement SelectTypeOfMaterial;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/txtValue")
	private AndroidElement CauseOfIgnition;
	
	@FindBy(xpath="//android.widget.TextView[@text='2 - Unintentional']")
	private AndroidElement SelectCauseOfIgnition;
	
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/chbCustomView")
	private AndroidElement FactorsContributingtoIgnition;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/chbCustomView")
	private AndroidElement HumanFactor;
	
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/chbCustomView")
	private AndroidElement Equipment;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/chbCustomView")
	private AndroidElement FireSupressionFactor;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/chbCustomView")
	private AndroidElement MobileProperty;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/txtValue")
	private AndroidElement L1StructureType;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='2 - Fixed portable or mobile structure']")
	private AndroidElement SelectL1StructureType;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/txtValue")
	private AndroidElement BuildingStatus;
	
	@FindBy(xpath="//android.widget.TextView[@text='1 - Under construction']")
	private AndroidElement SelectBuidilngStatus;
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//android.widget.Button[@text='Submit']")
	private AndroidElement Submit;
	
	
	
	
	
	
	
	public void OhioButton()
	{
		clickScreenshot(OhioButton);
	}
	


	public void loginUserID(String username) throws Exception
	{
		switchToWeb();
		clickonWebElement(loginUserID);
		loginUserID.sendKeys(username);
	}
	
	
	public void loginPassword(String password)
	{
		
		clickonWebElement(loginPassword);
		loginPassword.sendKeys(password);
	}
	
	
	public void clickloginButton() {
		try
		{
		clickonWebElement(clickloginButton);
		clickonWebElement(clickloginButton);
		}
		catch(Exception E)
		{
			
		}
	}

	public void clickCreateIncidet()
	{
		switchToNativeview();
		clickScreenshot(clickCreateIncidet);
	}

	
	public void SearchBar(String Incident_Type) {
		clickScreenshot(SearchBar);
		SearchBar.sendKeys(Incident_Type);
		clickScreenshot(BuilidingFire_111);
		AndroidElement buildFire = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'"+Incident_Type+"')]"));
		buildFire.click();
		
		
	}
	
	
	
	public void FDID(String FDI)
	{
		clickScreenshot(FDID);
//		clickScreenshot(SelectOhid);
		AndroidElement fdkey=driver.findElement(By.xpath("//android.widget.TextView[@text='"+FDI+"']"));
		clickScreenshot(fdkey);
		clickScreenshot(Done);
		
		
	}
	public void Date()
	{
		clickScreenshot(Date);
		clickScreenshot(OK);
		clickScreenshot(NextButton);
			
	}
	public void Address() throws Exception
	{
		clickScreenshot(Address);
		
//		Address.sendKeys("1234 ");
		UtilsKeys.press("1234");
		((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.BACKSPACE);
		((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.KEYCODE_4);
		clickScreenshot(SelectAddressFromSuggestions);
		swipe(528,1913,512,470);
		System.out.println("Swpie Done");
		clickScreenshot(NextButton);
		clickScreenshot(NextButton);
		
	}
	
	
	
	public void AidGiven()
	{
		clickScreenshot(AidGiven);
		//AndroidElement aidgiven=driver.findElement(By.xpath("//android.widget.TextView[@text='"+AidG+"']"));
		//clickScreenshot(aidgiven);
		clickScreenshot(SelectAidGiven);
		clickScreenshot(Done);
		clickScreenshot(NextButton);	
	
		
	}
	
	public void DateAndTime()
	{
		clickScreenshot(Time);
		clickScreenshot(OKbutton);
		clickScreenshot(Clock1);
		clickScreenshot(SameAsAlarm1);
		/*
		 * clickScreenshot(SameAsAlarm2); swipe(529,2017,570,720);
		 * System.out.println("Click Check box");
		 */
		swipe(529,2017,570,720);
		System.out.println("Click Check box");
		clickScreenshot(NextButton);
		clickScreenshot(NextButton);
		clickScreenshot(NextButton);
			
	}
	
	public void FActionTaken()
	{
		clickScreenshot(PrimaryAction);
		clickScreenshot(FireControl);
		clickScreenshot(Done);
		clickScreenshot(NextButton);
		
	}
	
	public void G1_Resources()
	{
		swipe(523,1930,577,1410);
		System.out.println("Click Check box");
		clickScreenshot(CheckBox);
		clickScreenshot(NextButton);
	}
	
	public void G2_EstimatedDollar()
	{
		
		clickScreenshot(Property);
		clickScreenshot(Contents);
		clickScreenshot(NextButton);
	}
	
	public void H1_Casualities()
	{
		clickScreenshot(NoCasualities);
		clickScreenshot(NextButton);
		clickScreenshot(NextButton);
		clickScreenshot(NextButton);
		clickScreenshot(NextButton);
	}

	public void J_PropertyUseStructure()
	{
		clickScreenshot(propertyUse);
		clickScreenshot(NextButton);
		clickScreenshot(NextButton);
		swipe(523,1930,577,1410);
		swipe(523,1930,577,1410);
		System.out.println("Click Check box");
		clickScreenshot(NextButton);
	}

	public void Remarks()
	{
		clickScreenshot(LRemarks);
		LRemarks.sendKeys("abc ");
		driver.hideKeyboard();
		clickScreenshot(NextButton);
		
		
	}
	
	public void M_Authorization()
	{
		swipe(523,1930,577,1410);
		swipe(523,1930,577,1410);
		System.out.println("Click Check box");
		clickScreenshot(NextButton);
		
	}
	
	public void Apparatus()
	{
		clickScreenshot(Apparatus);
		clickScreenshot(SelectApparatus);
		clickScreenshot(Done);
		clickScreenshot(AppDate);
		clickScreenshot(AppDateOk);
		clickScreenshot(Time);
		clickScreenshot(OKbutton);
		swipe(523,1930,577,1410);
		clickScreenshot(SelectCheckBox3);
		clickScreenshot(SelectCheckBox4);
		swipe(523,1930,577,1410);
		swipe(523,1930,577,1410);
		clickScreenshot(Personnel);
		clickScreenshot(SelectPersonnel);
		clickScreenshot(SelectPersonnelName);
		clickScreenshot(Done);
		clickScreenshot(SelectPersonnelNameSubmit);
		swipe(523,1930,577,1410);
		swipe(523,1930,577,1410);
		swipe(523,1930,577,1410);
		clickScreenshot(NextButton);
		
		
	}
	public void B_PropertyDetails()
	{
		clickScreenshot(NotResidential);
		clickScreenshot(Buildings);
		clickScreenshot(None);
		swipe(523,1930,577,1410);
		clickScreenshot(NextButton);
		
	}
	public void OnSiteMAterial()
	{
		clickScreenshot(OnSiteMAterial);
		clickScreenshot(NextButton);
		
	}
	
	public void DIgnition()
	{
		clickScreenshot(AreaOfFire);
		clickScreenshot(Hallway);
		clickScreenshot(Done);
		clickScreenshot(HeatSource);
		clickScreenshot(ItemFirstIgnited);
		clickScreenshot(Done);
		clickScreenshot(ItemFirstIgnited);
		clickScreenshot(SelectItemFirstIgnited);
		clickScreenshot(Done);
		clickScreenshot(TypeOfMaterial);
		clickScreenshot(SelectTypeOfMaterial);
		clickScreenshot(Done);
		
		
		
		
		
		clickScreenshot(NextButton);
	}
	
	public void E1CauseOfIgnition() 
	{
		clickScreenshot(CauseOfIgnition);
		clickScreenshot(SelectCauseOfIgnition);
		clickScreenshot(Done);
		clickScreenshot(NextButton);
		
	}
	
	public void E2Factorscontributing()
	{
		clickScreenshot(FactorsContributingtoIgnition);
		clickScreenshot(NextButton);
	}
	
	public void E3HumanFactors()
	{
		clickScreenshot(HumanFactor);
		clickScreenshot(NextButton);
		
	}
	public void F1Equipment()
	{
		clickScreenshot(Equipment1);
		clickScreenshot(EquipmentInvolved);
		clickScreenshot(Done);
		clickScreenshot(NextButton);
	}
	
	
	public void G1FireFactors()
	{
		clickScreenshot(FireSupressionFactor);
		clickScreenshot(NextButton);
	}
	
	public void H1Mobile()
	{
		clickScreenshot(MobileProperty);
		clickScreenshot(NextButton);
		clickScreenshot(NextButton);
	}
	
	public void L1StructureType()
	{
		clickScreenshot(L1StructureType);
		clickScreenshot(SelectL1StructureType);
		clickScreenshot(Done);
		clickScreenshot(NextButton);
	}
	public void L2BuildingStatus()
	{
		clickScreenshot(BuildingStatus);
		clickScreenshot(SelectBuidilngStatus);
		clickScreenshot(Done);
		clickScreenshot(NextButton);
		
	}
	
	public void Submit()
	{
		clickScreenshot(Submit);
	}
}
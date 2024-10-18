package pom.check.funct;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pom.createIncident.baseIncident;

public class DecaleRequest extends baseIncident {
	public DecaleRequest()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnDrawerToggle")
	private AndroidElement Menu;
	
	@FindBy(xpath="//android.widget.TextView[@text='My FD']")
	private AndroidElement MyFD;
	
	@FindBy(xpath="(//android.widget.ImageView[@index='2'])[1]")
	private AndroidElement clickFirstFireD;
	
	@FindBy(xpath="//android.widget.TextView[@text='Additional Info']")
	private AndroidElement AdditionalInfo;
	
	@FindBy(xpath="//android.widget.TextView[@text='Department Information']")
	private AndroidElement DepartmentInfo;
	

	@FindBy(id="com.threedi.ohioNFERs.qa:id/textFireStaionTitle")
	private AndroidElement textFireStaionTitle;
	
	@FindBy(xpath="//android.widget.ImageButton[@index='2']")
	private AndroidElement AddFireStation;
	
	@FindBy(xpath="(//android.widget.EditText[@text='Enter'])[1]")
	private AndroidElement EnterID;
	
	@FindBy(xpath="//android.widget.AutoCompleteTextView[@text='Enter a location']")
	private AndroidElement ClickEnterLocation;
	
	@FindBy(xpath="(//android.view.ViewGroup[@resource-id='com.threedi.ohioNFERs.qa:id/lytDataEtBody'])[2]")
	private AndroidElement SelectAddressFromSuggestions;
	
	@FindBy(xpath="//android.widget.TextView[@text='Submit']")
	private AndroidElement Submit;
	
	@FindBy(xpath="(//android.widget.EditText[@text='Enter'])[1]")
	private AndroidElement StationName;
	
	@FindBy(xpath="(//android.widget.EditText[@text='Enter'])[1]")
	private AndroidElement Phone;
	
	@FindBy(xpath="(//android.widget.EditText[@text='Enter'])[1]")
	private AndroidElement Email;
	
	@FindBy(xpath="(//android.widget.EditText[@text='Enter'])[1]")
	private AndroidElement Type;
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement SelectOccupied;
	
	@FindBy(xpath="//android.widget.TextView[@text='Yes']")
	private AndroidElement Yes;
	
	
	
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	private AndroidElement OK;
	
	@FindBy(xpath="//android.widget.TextView[@text='Decal Requests']")
	private AndroidElement DecalRequest;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/imgCreateDecalRequest")
	private AndroidElement AddNewDecale;
	
	@FindBy(xpath="//android.widget.TextView[@text='Contact']/..//android.widget.TextView[@text='ADD']")
	private AndroidElement AddVehicleContact;
	
	@FindBy(xpath="//android.widget.EditText[@text='First Name']")
	private AndroidElement FirstName;
	
	@FindBy(xpath="//android.widget.EditText[@text='Last Name']")
	private AndroidElement LastName;
	
	@FindBy(xpath="//android.widget.EditText[@text='Email']")
	private AndroidElement EmailID;
	
	@FindBy(xpath="//android.widget.EditText[@text='Phone Number']")
	private AndroidElement PhoneNumber;
	
	@FindBy(xpath="//android.widget.Button[@text=\"Done\"]")
	private AndroidElement Done;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/loading")
	private AndroidElement IncidentLoader;
	
	@FindBy(xpath="//android.widget.TextView[@text='My Incidents']")
	private AndroidElement MyIncident;
	
	@FindBy(xpath="//android.widget.TextView[@text='Application Details']/..//android.widget.TextView[@text='ADD']")
	private AndroidElement AddApplicationDetails;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/imageViewDownArrowCaseAssigneeDropDown")
	private AndroidElement IssusingYearSelect;
	
	@FindBy(xpath="//android.widget.TextView[@text='2023']")
	private AndroidElement SelectYear;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"Done\"]")
	private AndroidElement DoneText;
	
	@FindBy(xpath="//android.widget.TextView[@text='Vehicle Details']/..//android.widget.TextView[@text='ADD']")
	private AndroidElement AddVehchileDetails;
	
	@FindBy(xpath="//android.widget.TextView[@text='Manufacturing Year *']/../..//android.widget.AutoCompleteTextView[@resource-id='com.threedi.ohioNFERs.qa:id/edtMessage']")
	private AndroidElement VehicleManufacturingYear;
	
	@FindBy(xpath="//android.widget.TextView[@text='Make and Model *']/../..//android.widget.AutoCompleteTextView[@resource-id='com.threedi.ohioNFERs.qa:id/edtMessage']")
	private AndroidElement VehicleMMakeAndModel;
	
	@FindBy(xpath="//android.widget.TextView[@text='License Plate Number *']/../..//android.widget.AutoCompleteTextView[@resource-id='com.threedi.ohioNFERs.qa:id/edtMessage']")
	private AndroidElement LiscensePlateNumber;
	
	@FindBy(xpath="//android.widget.TextView[@text='Date of Inspection *']/../..//android.widget.EditText[@resource-id='com.threedi.ohioNFERs.qa:id/etEditTextDatePicker']")
	private AndroidElement DateofInspection;

	@FindBy(xpath="//android.widget.RadioButton[@text='No']")
	private AndroidElement No;
	
	@FindBy(xpath="//android.widget.TextView[@text='Department Comments']/../..//android.widget.AutoCompleteTextView[@resource-id='com.threedi.ohioNFERs.qa:id/edtMessage']")
	private AndroidElement DeptComment;


	
	public void AddingDecaleRequest(String add) throws Exception {
		Thread.sleep(50000L);
		Thread.sleep(50000L);
		wLib.waitForElemnetToBeVisible(Menu);
		click(Menu, "Menu Button");
		click(MyFD,"My FD Button");
		click(clickFirstFireD,"clickFirstFireD");
		Scrolltoelement(DepartmentInfo,5,"Department Information");
		Scrolltoelement(AdditionalInfo,5,"Additional Information");
		Scrolltoelement(DecalRequest,3,"DecalRequest");
		click(DecalRequest,"Decal Request");
		click(AddNewDecale,"AddNewDecale");
		Thread.sleep(3000);
		click(AddVehicleContact,"Add Vehicle Contact");
		click(FirstName,"FirstName");
		UtilsKeys.press("John");
		click(LastName,"LastName");
		UtilsKeys.press("Tim");
		click(EmailID,"EmailID");
		EmailID.sendKeys("3disystemappium@gmail.com");
		
		try { driver.hideKeyboard();}catch(Exception e){}
		
		click(PhoneNumber,"PhoneNumber");
		UtilsKeys.press("8888888888");
		Scrolltoelement(Done,3,"Done");
		click(Done,"Done");
		
		click(AddApplicationDetails,"AddApplicationDetails");
		click(IssusingYearSelect,"IssusingYearSelect");
		click(SelectYear,"SelectYear");
		click(DoneText,"Done");
		click(Done,"Done");
		
		click(AddVehchileDetails,"AddVehchileDetails");
		click(VehicleManufacturingYear,"VehicleManufacturingYear");
		UtilsKeys.press("2022");
		try { driver.hideKeyboard();}catch(Exception e){}
		click(VehicleMMakeAndModel,"VehicleMMakeAndModel");
		UtilsKeys.press("MSV12");
		try { driver.hideKeyboard();}catch(Exception e){}
		click(LiscensePlateNumber,"LiscensePlateNumber");
		UtilsKeys.press("MH21");
		try { driver.hideKeyboard();}catch(Exception e){}
		click(Done,"Done");
		click(DateofInspection,"DateofInspection");
		click(OK,"Ok");
		click(No,"No");
		click(Done,"Done");
		click(DeptComment,"DeptComment");
		UtilsKeys.press("Test");
		try { driver.hideKeyboard();}catch(Exception e){}
		Scrolltoelement(Submit,3,"Submit");

		
		
		
		
	}
}

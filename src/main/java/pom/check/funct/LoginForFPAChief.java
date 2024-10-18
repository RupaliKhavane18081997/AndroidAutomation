package pom.check.funct;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pom.createIncident.baseIncident;

public class LoginForFPAChief extends baseIncident {
	public LoginForFPAChief()
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
	
	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	private AndroidElement Done;
	
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	private AndroidElement OK;
	
	
	
	
	
	
	
	public void AddingFireStations(String add) throws Exception {
		click(Menu, "Menu Button");
		click(MyFD,"My FD Button");
		click(clickFirstFireD,"clickFirstFireD");
		Scrolltoelement(DepartmentInfo,5,"Department Information");
		Scrolltoelement(AdditionalInfo,5,"Additional Information");
		click(textFireStaionTitle,"textFireStaionTitle");
		click(AddFireStation,"AddFireStation");
		click(EnterID,"EnterID");
		UtilsKeys.press("321");
		click(ClickEnterLocation,"ClickEnterLocation");
		UtilsKeys.press(add);
		Thread.sleep(3000l);
		click(SelectAddressFromSuggestions,"SelectAddressFromSuggestions");
		Thread.sleep(3000l);
		try { driver.hideKeyboard();}catch(Exception e){}
		
		click(StationName,"StationName");
		UtilsKeys.press("Abc321");
		
		click(Phone,"Phone Number");
		UtilsKeys.press("8888888888");
		
		click(Email,"Email ID");
		Email.sendKeys("3disystemappium@gmail.com");
		
		click(Type,"Type");
		UtilsKeys.press("Fire Engine");
		
		click(SelectOccupied,"Select Occupied");
		click(Yes,"Yes Button");
		click(Done,"Done Button");
		
		
		click(Submit,"Submit Button");
		click(OK,"Ok button");
		
		
		
		
		
		
		
	}
}

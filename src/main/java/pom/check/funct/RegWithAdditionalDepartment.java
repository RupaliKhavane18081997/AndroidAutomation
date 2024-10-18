package pom.check.funct;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pom.createIncident.baseIncident;
import utils.Utilitycommon;

public class RegWithAdditionalDepartment extends baseIncident {
	public RegWithAdditionalDepartment()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnDrawerToggle")
	private AndroidElement Menu;
	
	@FindBy(xpath="//android.widget.TextView[@text='My FD']")
	private AndroidElement MyFD;
	
	@FindBy(xpath="//android.widget.TextView[@text='Register with additional department']")
	private AndroidElement Registerwithadditionaldepartment;
	
	@FindBy(xpath="//android.widget.TextView[@text='I am ... *']/../..//android.widget.TextView[@text='Select']")
	private AndroidElement SelectIam;

	@FindBy(xpath="//android.widget.TextView[@text='Fire Chief']")
	private AndroidElement SelectFireChief;
	
	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	private AndroidElement Done;

	@FindBy(xpath="//android.widget.TextView[@text='Type and select County *']/../..//android.widget.AutoCompleteTextView[@text='Search By County Name']")
	private AndroidElement SearchByCountryName;
	
	@FindBy(xpath="//android.widget.TextView[@text='Department Name & FDID *']/../..//android.widget.TextView[@text='Select']")
	private AndroidElement SelectDepartmentName;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='CINCINNATI FIRE DEPARTMENT (Hamilton County) - 31015']")
	private AndroidElement SelectDeptFromList;
	

	@FindBy(xpath="//android.widget.TextView[@text='Email (Official email provided by the FD) *']/../..//android.widget.AutoCompleteTextView[@resource-id='com.threedi.ohioNFERs.qa:id/edtMessage']")
	private AndroidElement ClickMailID;
	
	@FindBy(xpath="(//android.view.ViewGroup[@resource-id='com.threedi.ohioNFERs.qa:id/lytDataEtBody'])[2]")
	private AndroidElement SelectAddressFromSuggestions;
	
	@FindBy(xpath="//android.widget.TextView[@text='DPS Certification Number *']/../..//android.widget.AutoCompleteTextView[@resource-id='com.threedi.ohioNFERs.qa:id/edtMessage']")
	private AndroidElement DPSCertificationNumber;
	
	
	
	@FindBy(xpath="//android.widget.TextView[@text='DPS Certificate Expiration Date *']/../..//android.widget.EditText[@resource-id='com.threedi.ohioNFERs.qa:id/etEditTextDatePicker']")
	private AndroidElement DPSCertificationExpiryDate;
	
	@FindBy(xpath="(//android.widget.EditText[@text='Enter'])[1]")
	private AndroidElement Phone;
	
	@FindBy(xpath="(//android.widget.EditText[@text='Enter'])[1]")
	private AndroidElement Email;
	
	@FindBy(xpath="(//android.widget.EditText[@text='Enter'])[1]")
	private AndroidElement Type;
	
	@FindBy(xpath="//android.widget.TextView[@text='2028']")
	private AndroidElement SelectExpiryYear;
	
	@FindBy(xpath="//android.widget.TextView[@text='2023']")
	private AndroidElement SelectCurrentYear;
	
	@FindBy(xpath="//android.widget.TextView[@text='Yes']")
	private AndroidElement Yes;
	
	
	
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	private AndroidElement OK;
	
	
	
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	private AndroidElement SelectYear;
	
	@FindBy(xpath="//android.widget.Button[@text='Submit']")
	private AndroidElement Submit;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/textSubmitSrNo")
	private AndroidElement ConfirmationNumber;
	
	
	@FindBy(id="com.android.chrome:id/search_box_text")
	private AndroidElement Search;
	
	@FindBy(xpath="(//div[@class='elementor-menu-toggle'])[1]")
	private WebElement MenuButton;
	
	@FindBy(xpath="(//a[text()=\"Register | Sign In\"])[2]")
	private WebElement SignIN;
	
	@FindBy(xpath="//android.widget.Button[@text='Menu Toggle']")
	private AndroidElement MenuToggle;
	
	
	
	
	public void switchToWeb() {
	    Set<String> str = driver.getContextHandles();
	    for (String newsrt : str) {
	      if (newsrt.contains("chrome")) {
	        driver.context(newsrt);
	      }
	     
	    } 
	  }
	
	public void RegisWithAdditionalDepartment(String add) throws Exception {

		click(Menu, "Menu Button");
		click(MyFD,"My FD Button");
		click(Registerwithadditionaldepartment,"Register with additional department");
		click(SelectIam,"Select I am");
		click(SelectFireChief,"Select Fire Chief");
		click(Done,"Done");
		click(SearchByCountryName,"Search By Country Name");
		UtilsKeys.press("Hamilton");
		Utilitycommon Utilitycommon = new Utilitycommon();
		Utilitycommon.tap(driver, 249,1022);
		click(SelectDepartmentName,"SelectDepartmentName");
		click(SelectDeptFromList,"SelectDeptFromList");
		click(Done,"Done");
		click(ClickMailID,"ClickMailID");
		
		ClickMailID.sendKeys("JohnTim@3diemail.com");
		
		try { driver.hideKeyboard();}catch(Exception e){
			
		}
		
		click(DPSCertificationNumber,"DPSCertificationNumber");
		UtilsKeys.press("DPS123");
		try { driver.hideKeyboard();}catch(Exception e){
			
		}
		Scrolltoelement(Submit,5,"Submit");

		click(DPSCertificationExpiryDate,"DPSCertificationExpiryDate");

		click(SelectCurrentYear,"SelectCurrentYear");
		//click(SelectYear,"SelectYear");
		click(SelectExpiryYear,"SelectExpiryYear");
		
		click(OK,"OK");
		Thread.sleep(3000L);
		click(Submit,"Submit");
		
		String comfirm =ConfirmationNumber.getText();
		System.out.println(comfirm);
//		driver.close();
//		fetchOTP();
//	 	driver.activateApp("com.android.chrome");
//	 	//switchToWeb();
//		//System.out.println("This is  click 1");
//		Thread.sleep(2000);
//		
//		driver.get("https://ohiosfm.3diengage.com/");
//		Thread.sleep(500);
//		//click(MenuToggle,"MenuToggle");
//		clickonWebElement(MenuButton);
//		Thread.sleep(200);
//		clickonWebElement(SignIN);
		
		
		
		

	 	
	 	
	 	
		
	
	}
}

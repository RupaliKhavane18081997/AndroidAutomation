package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;
import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.testng.annotations.Parameters;

public class baseIncident  extends BasePage{
	
	public baseIncident()
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
	@FindBy(xpath="(//android.view.ViewGroup[@index='0'])[3]") 
	private AndroidElement BuilidingFire_111;
	 
	
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	
	@FindBy(xpath="(//android.widget.TextView[@text='Select'])[1]")
	private AndroidElement Selecttext1;
	
	@FindBy(xpath="//android.widget.EditText[@text='Search']")
	private AndroidElement Search;
	
	
	@FindBy(xpath="(//android.widget.EditText[@text='Enter'])[1]")
	public  AndroidElement Enterfield1;
	
	@FindBy(xpath="(//android.widget.EditText[@text='Enter'])[2]")
	public AndroidElement Enterfield2;
//	@FindBy("//android.widget.TextView[@text='"+FDI+"']")
//	private AndroidElement SelectOhid; 

	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	public AndroidElement Done;
	  
	@FindBy(xpath="//android.widget.TextView[@text='MM/DD/YYYY']")
	private AndroidElement Date;
	 
	@FindBy(xpath="//android.view.View[@text='20']")
	private AndroidElement Day;
	
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	private AndroidElement OK;
	
	@FindBy(xpath="//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")
	public AndroidElement NextButton;
	
	@FindBy(xpath="//android.widget.AutoCompleteTextView[@text='Enter street address/intersection']")
	private AndroidElement Address;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/line1")
	private AndroidElement SelectAddressFromSuggestions;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/txtValue")
	private AndroidElement AidGiven;
	
	@FindBy(xpath="//android.widget.TextView[@text='HH:MM']")
	private AndroidElement E1datestimes;
	
	@FindBy(xpath = "(//android.widget.CheckBox)[1]")
	public AndroidElement CheckBox1;
	
	@FindBy(id = "com.threedi.ohioNFERs.qa:id/imgSearch")
	public AndroidElement SearchFromAddress;
	
	//Login With Existence User
	 @FindBy(id = "com.threedi.ohioNFERs.qa:id/btn_SignIn")
	 public AndroidElement LoginWithExistenceUser;
	 
	 @FindBy(id = "com.threedi.ohioNFERs.qa:id/editEmail")
	 public AndroidElement EmailID;
	 
	 @FindBy(id = "com.threedi.ohioNFERs.qa:id/editPassword")
	 public AndroidElement EmailPass;
	 
	@FindBy(xpath ="//android.widget.Button[@text='LOGIN']")
	public AndroidElement LoginButton;
	
	@FindBy(id = "com.threedi.ohioNFERs.qa:id/btnSubmit")
	public AndroidElement SubmitButton;
		
		
	@FindBy(xpath = "//android.widget.ImageButton[@index='2']")
	public AndroidElement Menu;
	
	@FindBy(xpath = "(//android.widget.LinearLayout[@resource-id='com.threedi.ohioNFERs.qa:id/ll2'])[8]")
	public AndroidElement Logout;
	
	@FindBy(xpath = "//android.widget.Button[@text='Save']")
	public AndroidElement Save;
		
	@FindBy(id = "com.threedi.ohioNFERs.qa:id/txtValue")
	public AndroidElement Incidenttype911;
		
	@FindBy(xpath = "//android.widget.TextView[@text='541 - Animal problem']")
	public AndroidElement Incidenttype541;
	  
	@FindBy(xpath = "//android.widget.TextView[@text='621 - Wrong location']")
	public AndroidElement Incidenttype621;
	
	@FindBy(xpath="//android.widget.Button[@text='Submit']")
	private AndroidElement Submit;
	
	@FindBy(xpath="(//android.widget.CheckBox[@resource-id='com.threedi.ohioNFERs.qa:id/chbCustomView'])[3]")
	private AndroidElement Lastunit;
	
	public void LoginWithExistingUser(String IDM_Email_ID, String IDM_Password) throws Exception {
		
		click(LoginWithExistenceUser,"LoginWithExistenceUser");
		click(EmailID, "EmailID");
		UtilsKeys.press(IDM_Email_ID);
		//sendKeys(EmailID, IDM_Email_ID);
		//sendKeys(SearchBar,IDM_Email_ID);
		click(EmailPass,"EmailPass");
		sendKeys(EmailPass,IDM_Password);
		click(LoginButton,"LoginButton");
		
	
		
		
		
	}
	
	
	
	
	
	
	public void OhioButton()
	{
//		click(OhioButton, "Ok");
		click(OhioButton);
		
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

	public void clickCreateIncidet() throws InterruptedException
	{
		switchToNativeview();
		Thread.sleep(50000L);
		Thread.sleep(50000L);
		wLib.waitForElemnetToBeVisible(clickCreateIncidet);
		click(clickCreateIncidet ,"Create Incident");
	}

	
	public void SearchBar(String Incident_Type) throws Exception {
		
		click(SearchBar , "Search");
		sendKeys(SearchBar,Incident_Type);
		click(BuilidingFire_111,Incident_Type);
		AndroidElement buildFire = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'"+Incident_Type+"')]"));
		click(buildFire, Incident_Type);
		
		
	}
	
	public void getkeyandclick(String FDI)
	{
		click(Selecttext, "Search");
//		click(SelectOhid);
		AndroidElement fdkey=driver.findElement(By.xpath("//android.widget.TextView[@text='"+FDI+"']"));
		click(fdkey, FDI);
		click(Done, "DONE");
		
		
	}
	public void Date()
	{
		click(Date);
		click(OK);
		click(Save);
		click(OK);
		click(NextButton, "Next");
			
	}
	public void Address(String add) throws Exception
	{
		ScrolltoelementForAddress(SearchFromAddress,5,"SearchFromAddress");
		click(Address);
		UtilsKeys.press(add);
		Thread.sleep(3000l);
		click(SelectAddressFromSuggestions,"SelectAddressFromSuggestions");
		Thread.sleep(3000l);
		try { driver.hideKeyboard();}catch(Exception e){}
		
		
		//swipe(528,1913,51
		//System.out.println("Swpie DOne");
		Scrolltoelement(NextButton, 10, "NextButton");
		click(NextButton , "Next");
		click(NextButton, "Next");
		
	}
	
	
	
	private void scrolltoelement(AndroidElement address2, String string) {
		// TODO Auto-generated method stub
		
	}



	public void AidGiven(String AidG)
	{
		click(AidGiven);
//		click(SelectOhid);
		AndroidElement aidgiven=driver.findElement(By.xpath("//android.widget.TextView[@text='"+AidG+"']"));
		click(aidgiven, AidG);
		click(Done, "Done");
		
		
	}
	public void nextbutton() {
		click(NextButton,"Next");
	}
public void E1datesandtimes() throws InterruptedException {
		click(E1datestimes);
		click(OK);
		click(CheckBox1, "Check box");
		swipe(528,1913,512,470);
		Scrolltoelement(Submit,5,"Submit button");
		click(Lastunit,"Last unit time");
		
}
public void FActiontaken(String FAction) throws Exception {
	click(Selecttext1);
	click(Search);
	//UtilsKeys.press("10");
	String proprty = FAction;
	String[] arrOfStr = proprty.split(" ");
	sendKeys(SearchBar, arrOfStr[0]);
	AndroidElement FActionele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+FAction+"']"));
	click(FActionele, FAction);
	click(Done);
	
	
	
}
public void G1Resourse() throws Exception {
	Thread.sleep(3000l);
	swipe(528,1913,512,470);
	
}
public void G2EstimatedDollarLossesandvalues(String Lossesdates, String valuesdates) throws Exception {
	click(Enterfield1);
	UtilsKeys.press(Lossesdates);
	click(Enterfield1);
	UtilsKeys.press(valuesdates);
	driver.hideKeyboard();
	Scrolltoelement(NextButton, 5, "NextButton");
	//swipe(528,1913,512,470);
	
	
}
public void switchtonappview() {
	switchToNativeview();
}


public void Logout() 
{ 
	  click(Menu,"Menu Button"); 
	  click(Logout,"Logout Button");
	  
}
 

public void IncidentType_911() 
{
	click(Incidenttype911);
}

public void IncidentType_541() 
{
	click(Incidenttype541);
}
public void IncidentType_621() 
{
	click(Incidenttype621);
}

@FindBy(xpath="//android.widget.TextView[@text=\"Sign in With Bioclinica SSO\"]")
private AndroidElement SignIn;

@FindBy(xpath="//android.widget.TextView[@text=\"Project Title One\"]")
private AndroidElement ProjectTitle;

@FindBy(xpath="(//android.widget.TextView[@text=\"Completed\"])[1]")
private AndroidElement Complete;

@FindBy(xpath="(//android.widget.TextView[@text=\"In-Progress\"])[1]")
private AndroidElement InProgress;

@FindBy(xpath="//android.widget.EditText[@text=\"Search for Subject ID, Case ID, etc...\"]")
private AndroidElement SearchSubjectID;

@FindBy(xpath="//android.widget.TextView[@text=\"Back\"]")
private AndroidElement BackArrow;





public void Derm() throws Exception
{
	clickScreenshot(SignIn, "Sign In Button");
	Thread.sleep(1000L);
	tap(200,300);
	SwipetoModule();
	clickScreenshot(ProjectTitle,"Project Title");
	clickScreenshot(Complete,"Complete");
	isDisplayed(InProgress);
	clickScreenshot(SearchSubjectID,"SearchSubjectID");
	UtilsKeys.press("0101");
	driver.hideKeyboard();
	clickScreenshot(BackArrow,"BackArrow");
	
	

	
	
	
}






private void tap(int i, int j) {
	// TODO Auto-generated method stub
	
}

}
package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EMS extends baseIncident {

	
	public EMS()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@FindBy(xpath="//android.widget.TextView[@text='Add Patient(s)']")
	private AndroidElement Add_Patient;
	

	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnAdd")
	private AndroidElement NextButton1;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/txtValue")
	private AndroidElement Selecttext;
	

	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	private AndroidElement Done;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtSearch")
	private AndroidElement SearchBar;

	@FindBy(xpath="//android.widget.TextView[@text='Submit']")
	private AndroidElement Submit;
 
	@FindBy(xpath="//android.widget.TextView[@text='I - Procedures Used']")
	private AndroidElement ProceduresUsed;
	
	@FindBy(xpath="//android.widget.TextView[@text='Procedures Used *']//../android.widget.TextView//..//..//android.widget.TextView[@text='Select']")
	private AndroidElement SelectProceduresUsed;
	
	@FindBy(xpath="//android.widget.TextView[@text='K - Cardiac Arrest *']")
	private AndroidElement CardiacArrest;
		
	@FindBy(xpath="(//android.widget.CheckBox[@resource-id='com.threedi.ohioNFERs.qa:id/rdoSingle'])[1]")
	private AndroidElement PreArriavl;
	
	@FindBy(xpath="//android.widget.TextView[@text='Initial Arrest Rhythm *']//../android.widget.TextView//..//..//android.widget.TextView[@text='Select']")
	private AndroidElement InitialRhytm;
	
	@FindBy(xpath="//android.widget.TextView[@text='Initial Level of Provider *']//../android.widget.TextView//..//..//android.widget.TextView[@text='Select']")
	private AndroidElement selectInitiaProvider;
	
	
	
	
	
	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"Next\"]")
	private AndroidElement AddtoInjury;
	
	@FindBy(xpath="(//android.widget.TextView[@text='Select'])[1]")
	private AndroidElement H1BodySiteInjury ;
		
	@FindBy(xpath="//android.widget.TextView[@text='1 - Head']")
	private AndroidElement SelectBodySiteInjury ;
	
	@FindBy(xpath="(//android.widget.TextView[@text='Select'])[2]")
	private AndroidElement H2BodySiteInjury ;
	
	@FindBy(xpath="//android.widget.TextView[@text='10 - Amputation']")
	private AndroidElement SelectH2BodySiteInjury ;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/txtSingleValue")
	private AndroidElement Cardiac17 ;
	
	@FindBy(xpath="(//android.widget.CheckBox[@resource-id='com.threedi.ohioNFERs.qa:id/rdoSingle'])[1]")
	private AndroidElement PreArrival ;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/rdoSingle")
	private AndroidElement Age ;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtValue")
	private AndroidElement EnterAge ;
	
	
	
	//android.widget.TextView[@text='Procedures Used *']//../android.widget.TextView//..//..//android.widget.TextView[@text='Select']
	
	

	public void EMStatus(String ProviderImpAssion, String ProUsed, String initialArrestRhythm, String selectInitialLevelProvider) throws Exception
	{
		if(Add_Patient.isDisplayed()) {
			click(Add_Patient,"Add_Patient");
		}else {
			baseIncident baseIncident = new baseIncident();
			baseIncident.nextbutton();
		}
		click(NextButton1,"NextButton");
		
		//click(Selecttext,"Select Button");
		
		
		
		//click(SearchBar,"SearchBar");
		//UtilsKeys.press("17");
		//click(Cardiac17,"ProviderImpAssEle");
		//click(Done, "Done");
		
		
		
		
		
		click(Selecttext,"Selecttext");
		click(SearchBar);
		//UtilsKeys.press("16");
		String proprty = ProviderImpAssion;
		String[] arrOfStr = proprty.split(" ");
		sendKeys(SearchBar, arrOfStr[0]);
		AndroidElement ProviderImpAssionele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+ProviderImpAssion+"']"));
		click(ProviderImpAssionele,ProviderImpAssion);
		click(Done);
		
		Scrolltoelement(Age, 5, "Age");
		click(Age);
		click(EnterAge);
		UtilsKeys.press("25");
		driver.hideKeyboard();
		if(driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
	
		Scrolltoelement(SelectProceduresUsed, 10, "H - Procedures Used");
		
		
		click(SelectProceduresUsed,"SelectProceduresUsed");
		click(SearchBar);
		//UtilsKeys.press("6");
		String proprty1 = ProUsed;
		String[] arrOfStr1 = proprty1.split(" ");
		sendKeys(SearchBar, arrOfStr1[0]);
		AndroidElement SelectProceduresele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+ProUsed+"']"));
		click(SelectProceduresele,ProUsed);
		click(Done);
		
		
		
		
		
		
		/*
		 * click(SelectProceduresUsed,"Select");
		 * clickontext("07 - Cardioversion (defib), manual"
		 * ,"07 - Cardioversion (defib), manual"); click(Done, "Done");
		 */
		
		
		Scrolltoelement(Submit, 10, "Submit");
		
		click(PreArrival,"PreArrival");
		
		/*
		 * click(InitialRhytm,"InitialRhytm"); click(SearchBar);
		 */
		
		
		
		
		
		click(InitialRhytm,"InitialRhytm");
		click(SearchBar);
		String proprty2 = initialArrestRhythm;
		String[] arrOfStr2 = proprty2.split(" ");
		sendKeys(SearchBar, arrOfStr2[0]);
		//UtilsKeys.press("6");
		AndroidElement initialArrestRhythmele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+initialArrestRhythm+"']"));
		click(initialArrestRhythmele,initialArrestRhythm);
		click(Done);
		
		
		
		/*
		 * click(selectInitiaProvider,"selectProvider"); click(SearchBar);
		 * //UtilsKeys.press("6"); AndroidElement
		 * selectInitiaProviderele=driver.findElement(By.xpath(
		 * "//android.widget.TextView[@text='"+selectProvider+"']"));
		 * click(selectInitiaProviderele,selectProvider); click(Done);
		 */
		
		
		
		
		
		
		
		
		  click(selectInitiaProvider,"selectInitiaProvider");
		  clickontext("1 - First responder","1 - First responder");
		  click(Done,"Done Button");
		  
		  
		 Scrolltoelement(Submit, 10, "Submit");
		 click(Submit,"Submit");
		
		

	}	
		
		
	}

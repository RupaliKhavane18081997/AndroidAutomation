package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.*;
import Base.UtilsKeys;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class HazMat extends baseIncident {
	

	public HazMat()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="(//android.widget.TextView[@text='Select'])[1]")
	private AndroidElement Select;
	
	@FindBy(xpath="(//android.widget.ImageView[@content-desc=\"Next\"])[2]")
	private AndroidElement AddHazMat;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnAdd")
	private AndroidElement NextButton1;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtSearch")
	private AndroidElement SelectChemical;
	
	@FindBy(xpath="//android.widget.TextView[@text='Estimated Amount Released *']")
	private AndroidElement EstimatedAmount;
	
	@FindBy(xpath="//android.widget.TextView[@text='Estimated Amount Released *']//..//android.widget.TextView//..//..//..//android.widget.EditText[@text='Enter']")
	private AndroidElement SelectEstimatedAmount;
	

	@FindBy(xpath="//android.widget.TextView[@text='Cause of Release *']")
	private AndroidElement CauseofRelease;
	
	@FindBy(xpath="//android.widget.TextView[@text='Cause of Release *']//../android.widget.TextView//..//..//android.widget.TextView[@text='Select']")
	private AndroidElement SelectCauseofRelease;
	
	@FindBy(xpath="//android.widget.TextView[@text='HazMat Disposition *']//../android.widget.TextView//..//..//android.widget.TextView[@text='Select']")
	private AndroidElement SelectHazmatDisposition;
	
	
	
	@FindBy(xpath="//android.widget.TextView[@text='Submit']")
	private AndroidElement Submit;
	
	
	

	
	
	
	public void HazMatDetails() throws Exception {
		clickontext("Add HazMat(s)","Add HazMat(s)");
		click(AddHazMat,"Add button hazMat");
		
	}	
		
		
	public void HazMatchemical(String ChemicalName, String EstimatedAmountReleased) throws Exception {
		
		click(SelectChemical,"SelectChemical");
		UtilsKeys.press(ChemicalName);
		Utilitycommon Utilitycommon = new Utilitycommon();
		Utilitycommon.tap(driver, 299, 730);		
		Scrolltoelement(EstimatedAmount,5,"EstimatedAmount");
		click(SelectEstimatedAmount,"SelectEstimatedAmount");
		sendKeys(SelectEstimatedAmount, EstimatedAmountReleased);
		driver.hideKeyboard();	
		Scrolltoelement(CauseofRelease,5,"CauseofRelease");	
		click(SelectCauseofRelease,"SelectCauseofRelease" );
		clickontext("1 - Intentional","1 - Intentional");
		click(Done,"Done");		
		Scrolltoelement(Submit, 10, "Submit");
		click(SelectHazmatDisposition,"Select Hazmat Disposition");
		clickontext("1 - Completed by fire service only","1 - Completed by fire service only");
		click(Done,"Done");	
		Scrolltoelement(Submit, 10, "Submit");
		click(Submit,"Submit");	
		
	}

}

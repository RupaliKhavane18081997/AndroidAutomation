package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FireSeriveCasuality extends baseIncident {

	public String values = "0";
	public FireSeriveCasuality()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnAddVictim")
	private AndroidElement Add_Casualty;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnAddNew")
	private AndroidElement Add_Button;
	
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnAdd")
	private AndroidElement NextButton1;
	
	@FindBy(xpath="//android.widget.RadioButton[@text='Male']")
	private AndroidElement SelectGender;
	
	@FindBy(xpath="(//android.widget.CheckBox[@resource-id='com.threedi.ohioNFERs.qa:id/rdoSingle'])[1]")
	private AndroidElement SelectAgeFactor;
	

	@FindBy(xpath="(//android.widget.EditText[@text='Enter'])[1]") 
	private AndroidElement Age;
	 
	 @FindBy(xpath="(//android.widget.TextView[@text='Select'])[3]")
	 private AndroidElement Selecttext;
		
	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	private AndroidElement Done;
		
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtSearch")
	private AndroidElement SearchBar;
		
	@FindBy(xpath="//android.widget.TextView[@text='Submit']")
	private AndroidElement Submit;
	 
	@FindBy(xpath="//android.widget.TextView[@text='G4-Taken to']")
	private AndroidElement G4_Takento;
	 
	
	
	//private AndroidElement SearchBar;
	public void FireCasuality(String FireServiceDeath, String FireServiceInjuries, String FireCasultyName,String EnterAge,String FireCasultySeverity) throws Exception
	{
		
		if(FireServiceDeath.equals(values) && FireServiceInjuries.equals(values)) {
			System.out.println("Already Done");
		}else {
			
		
		
		click(Add_Casualty,"Add_Casualty");
		AndroidElement FireCasultyNameEle=driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'3di sim Smith')]"));		
		click(FireCasultyNameEle,"Fire Casulty Name Sam");
		click(Done,"Done");
		click(NextButton1,"NextButton");
		//click(SelectGender,"SelectGender");
		click(SelectGender,"SelectGender");
		click(SelectAgeFactor,"SelectAgeFactor");
		click(Age,"Age");
		UtilsKeys.press("25");
		//UtilsKeys.press(EnterAge);
		driver.hideKeyboard();
		if(driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
		Scrolltoelement(Selecttext, 5, "Select button");
		click(Selecttext,"Select Button");
		
		String proprty = FireCasultySeverity;
		String[] arrOfStr = proprty.split(" ");
		sendKeys(SearchBar, arrOfStr[0]);
		
		AndroidElement FireCasultySeverityEle=driver.findElement(By.xpath("//android.widget.TextView[@text='"+FireCasultySeverity+"']"));
		click(FireCasultySeverityEle,"FireCasultySeverity");
		click(Done,"Done");
		clickAfterScrolling(Submit, 25, "Submit");
		
		
		
			
		
		
	}	
		
		
	}
}


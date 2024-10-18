package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Civillian_FireCasualty extends baseIncident {

	public String values = "0";
	public Civillian_FireCasualty()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnAddVictim")
	private AndroidElement Add_Casualty;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnAddNew")
	private AndroidElement Add_Button;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/etFirstNameValue")
	private AndroidElement FirstName;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/etLastNameValue")
	private AndroidElement Lastname;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnAdd")
	private AndroidElement AddDetailsOfVictim;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnAdd")
	private AndroidElement NextButton;
	
	@FindBy(xpath="//android.widget.RadioButton[@text='Male']")
	private AndroidElement SelectGender;
	
	@FindBy(xpath="(//android.widget.CheckBox[@resource-id='com.threedi.ohioNFERs.qa:id/rdoSingle'])[1]")
	private AndroidElement SelectAgeFactor;
	
	/*
	 * @FindBy(xpath="//android.widget.EditText[@text='Enter']") private
	 * AndroidElement SelectAgeFactor;
	 */
	
	 @FindBy(xpath="(//android.widget.EditText[@text='Enter'])[2]") 
	 private AndroidElement Age;
	 
	 @FindBy(xpath="(//android.widget.TextView[@text='Select'])[4]")
		private AndroidElement Selecttext;
		
		@FindBy(xpath="//android.widget.TextView[@text='Done']")
		private AndroidElement Done;
		
		@FindBy(id="com.threedi.ohioNFERs.qa:id/edtSearch")
		private AndroidElement SearchBar;
		
		@FindBy(xpath="//android.widget.TextView[@text='Submit']")
		private AndroidElement Submit;
	 
		@FindBy(xpath="//android.widget.TextView[@text='H - Severity *']")
		private AndroidElement H_Severity;
		
		@FindBy(xpath="//android.widget.TextView[@text='H - Severity *']//../android.widget.TextView//..//..//android.widget.TextView[@text='Select']")
		private AndroidElement SelectHSeverity;
			
	 
	
		
		
	
	//private AndroidElement SearchBar;
	public void CivillianFireCasualty(String CivilianDeath, String CivilianInjuries,String Firstnsme, String Lastnsme,String EnterAge, String CivillianFireCasualty) throws Exception
	{
		
		if(CivilianDeath.equals(values) && CivilianInjuries.equals(values)) {
			System.out.println("Already Done");
		}else {
			
		
		click(Add_Casualty,"Add_Casualty");
		click(Add_Button,"Add_Button");
		sendKeys(FirstName, Firstnsme);
		sendKeys(Lastname, Lastnsme);
		driver.hideKeyboard();
		click(AddDetailsOfVictim,"AddDetailsOfVictim");
		click(NextButton,"NextButton");
		click(SelectGender,"SelectGender");
		click(SelectAgeFactor,"SelectAgeFactor");
		click(Age,"Age");
		UtilsKeys.press(EnterAge);
		driver.hideKeyboard();
		if(driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
		Scrolltoelement(H_Severity, 5, "H - Severity");
		click(SelectHSeverity,"Select H Severity");
//		click(SearchBar,"Search Bar");
		AndroidElement CivillianFireCasualtyEle=driver.findElement(By.xpath("//android.widget.TextView[@text='"+CivillianFireCasualty+"']"));
		click(CivillianFireCasualtyEle,CivillianFireCasualty);
		click(Done,"Done");
		clickAfterScrolling(Submit, 15, "Submit");
		
		//UtilsKeys.press("Mr");
		
		}
		
		
		
		
		
		
		
		
	}	
		
		
	}

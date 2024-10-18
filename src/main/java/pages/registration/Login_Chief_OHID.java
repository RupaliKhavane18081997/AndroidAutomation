
package pages.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pom.createIncident.baseIncident;

public class Login_Chief_OHID  extends baseIncident {
	public Login_Chief_OHID ()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnOhIdLogin")
	private AndroidElement OhidLogin;
	
	@FindBy(xpath="//button[@id='loginSubmit']")
	private AndroidElement LoginSubmit;
	
	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	private AndroidElement Done;
	
	@FindBy(xpath="//android.widget.TextView[@text='Same as Alarm time']")
	private AndroidElement samealrm;
	
	@FindBy(xpath="//android.widget.TextView[@text='Arrival *']")
	private AndroidElement arrival;
	
	@FindBy(xpath="//android.widget.TextView[@text='Back In Station']")
	private AndroidElement BackInStation;
	
	@FindBy(xpath="(//android.widget.CheckBox)[1]")
	private AndroidElement Checkbox1;
	
	//android.widget.TextView[@text='Dispatch *']//..//..//..
	@FindBy(xpath="(//android.widget.CheckBox)[2]")
	private AndroidElement Checkbox2;
	
	@FindBy(xpath="(//android.widget.CheckBox)[4]")
	private AndroidElement Checkbox4;
	
	@FindBy(xpath="(//android.widget.CheckBox)[5]")
	private AndroidElement Checkbox5;
	
	@FindBy(xpath="//android.widget.TextView[@text='Personnel *']")
	private AndroidElement Personnel;
	
	
	@FindBy(xpath="//android.widget.ImageView[@content-desc='Next']")
	private AndroidElement plubutton;
	
	@FindBy(xpath="//android.widget.EditText[@text='Search']")
	private AndroidElement Search;

	@FindBy(xpath="//android.widget.TextView[@text='Submit']")
	private AndroidElement Submit;
	@FindBy(xpath="//android.widget.TextView[@text='Remark']")
	private AndroidElement Remark;
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtValue")
	private AndroidElement editBox;
	
	@FindBy(xpath = "//android.widget.TextView[@text='HH:MM'])[1]")
	private AndroidElement HHMM1;
	
	@FindBy(xpath = "(//android.widget.TextView[@text='HH:MM'])[2]")
	private AndroidElement HHMM2;
	@FindBy(xpath = "(//android.widget.TextView[@text='HH:MM'])[3]")
	private AndroidElement HHMM3;
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	private AndroidElement OKbutn;
	@FindBy(xpath="//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")
	public AndroidElement NextButton;
	
	@FindBy(xpath="//android.widget.TextView[@text='Dispatch *']")
	public AndroidElement Dispatch;
	
	@FindBy(xpath="//android.widget.TextView[@text='Enroute']")
	public AndroidElement Enroute;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='Dispatch *']//../android.widget.TextView//..//..//android.widget.TextView[@text='MM/DD/YYYY']")
	public AndroidElement DispatchDate;
	
	@FindBy(xpath="//android.widget.TextView[@text='Dispatch *']//../android.widget.TextView//..//..//android.widget.TextView[@text='HH:MM']")
	public AndroidElement DispatchTime;
	
	@FindBy(xpath="//android.widget.TextView[@text='Enroute']//../android.widget.TextView//..//..//android.widget.TextView[@text='HH:MM']")
	public AndroidElement EnrouteTime;
	
	@FindBy(xpath="//android.widget.TextView[@text='Enroute']//../android.widget.TextView//..//..//android.widget.TextView[@text='MM/DD/YYYY']")
	public AndroidElement EnrouteDate;
	
	@FindBy(xpath="//android.widget.TextView[@text='Arrival *']//../android.widget.TextView//..//..//android.widget.TextView[@text='MM/DD/YYYY']")
	public AndroidElement ArrivalDate;
	
	@FindBy(xpath="//android.widget.TextView[@text='Arrival *']//../android.widget.TextView//..//..//android.widget.TextView[@text='HH:MM']")
	public AndroidElement ArrivalTime;
	
	@FindBy(xpath="//android.widget.TextView[@text='Clear *']//../android.widget.TextView//..//..//android.widget.TextView[@text='HH:MM']")
	public AndroidElement ClearTime;
	
	@FindBy(xpath="//android.widget.TextView[@text='Clear *']//../android.widget.TextView//..//..//android.widget.TextView[@text='MM/DD/YYYY']")
	public AndroidElement ClearDate;
	
	
	
	
	public void Login_forChief_OHID() throws Exception {
		click(OhidLogin, "click OHID Button");
		
		
	}
}

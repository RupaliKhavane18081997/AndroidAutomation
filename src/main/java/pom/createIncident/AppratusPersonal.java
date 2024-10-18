package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AppratusPersonal extends baseIncident {
	public AppratusPersonal()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	
	@FindBy(xpath="(//android.widget.TextView[@text='Select'])[1]")
	private AndroidElement PersonalSlector;
	
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
	
	
	
	
	public void apppersonalselect(String Appname, String personname, String Remark) throws Exception {
		click(Selecttext, "Select Button");
		AndroidElement Appnameele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+Appname+"']"));
		click(Appnameele, "Apparatus Name");
		click(Done);
		/*
		 * Scrolltoelement(Dispatch,5,"Dispatch");
		 * 
		 * click(HHMM2,"HHMM"); //Scrolltoelement(Enroute, 4, "Enroute");
		 * Scrolltoelement(samealrm,5,"Same as Alarm Time");
		 * //Scrolltoelement(arrival,5,"Same as Arrival"); click(Checkbox1,
		 * "Same Date as Alarm"); //Scrolltoelement(Enroute, 4, "Enroute");
		 * click(Checkbox2, "Same Time as Alarm");
		 * 
		 * Scrolltoelement(BackInStation,5,"Scrolltoelement");
		 * 
		 * click(Checkbox4, "Same Date as Alarm"); click(HHMM2,"HHMM"); click(OKbutn,
		 * "OK Button"); click(Checkbox5, "Same Time as Alarm"); click(HHMM2,"HHMM");
		 * click(OKbutn, "OK Button"); Scrolltoelement(Personnel, 4, "Back In Station");
		 */
		
		
		Scrolltoelement(Dispatch,5,"Dispatch");
		click(DispatchDate,"Dispatch Date");
		click(OKbutn,"OK Button");
		click(DispatchTime,"Dispatch Time");
		click(OKbutn,"OK Button");
		
		Scrolltoelement(EnrouteTime, 4, "Enroute Time");
		click(EnrouteDate,"Enrout eDate");
		click(OKbutn,"OK Button");
		click(EnrouteTime,"Enroute Time");
		click(OKbutn,"OK Button");
		
		Scrolltoelement(ArrivalTime, 4, "Arrival Time");
		click(ArrivalDate,"Arrival Date");
		click(OKbutn,"OK Button");
		click(ArrivalTime,"Arrival Time");
		click(OKbutn,"OK Button");
		
		Scrolltoelement(ClearDate, 4, "Clear Date");
		click(ClearDate,"Clear Date");
		click(OKbutn,"OK Button");
		click(ClearTime,"Clear Time");
		click(OKbutn,"OK Button");
		
		Scrolltoelement(Personnel, 4, "Personnel");
		
		click(plubutton,"Personal");
		click(PersonalSlector,"Personal select");
		click(Search);
		sendKeys(Search, personname);
		AndroidElement personnameele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+personname+"']"));
		click(personnameele,personname);
		click(Done);
		click(Submit);
		Scrolltoelement(editBox, 5, "Edit Box");
		sendKeys(editBox, Remark );
		Scrolltoelement(NextButton, 5, "Next");
		
	}
}

package pom.check.funct;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pom.createIncident.baseIncident;
import utils.VerificationUtils;

public class Firestationpage extends baseIncident{

	public Firestationpage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	
	@FindBy(xpath = "(//android.widget.TextView[@text='Phone :']//..//android.widget.TextView)[1]")
	private  AndroidElement Firestationame;
	
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Phone :\"]//..//XCUIElementTypeStaticText)[2]")
	private AndroidElement Locationdetails;
	
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Phone :\"]//..//XCUIElementTypeStaticText)[4]")
	private AndroidElement phonenumberdetails;
	
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Phone :\"]//..//XCUIElementTypeStaticText)[4]")
	private AndroidElement typedetails;
	
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Phone :\"]//..//XCUIElementTypeStaticText)[8]")
	private AndroidElement emaildetails;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Type:\"]")
	private AndroidElement type;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Phone :\"]")
	private AndroidElement phone;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email :\"]")
	private AndroidElement Email;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Occupied :\"]")
	private AndroidElement Occupied;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Station ID :\"]")
	private AndroidElement StationID;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"NavBackBtn\"]")
	private AndroidElement backbtnfs;
	
	@FindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"KahunaBaseApp.FireStationView\"]/XCUIElementTypeButton[2]")
	private AndroidElement addfirestaionbtn;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ID\"]")
	private AndroidElement ID;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Address\"]")
	private AndroidElement Address;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Fire Station Name\"]")
	private AndroidElement FirestationName;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Phone\"]")
	private AndroidElement phonefireadd;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email\"]")
	private AndroidElement Emailfireadd;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Type\"]")
	private AndroidElement typefireadd;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"IDTF\"]")
	private AndroidElement IDtextfield;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Address\"]")
	private AndroidElement addressfield;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Fire Station NameTF\"]")
	private AndroidElement firestaiontextfield;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"PhoneTF\"]")
	private AndroidElement phonetextfield;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"EmailTF\"]")
	private AndroidElement emailtextfield;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"TypeTF\"]")
	private AndroidElement typeTF;
	
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Occupied\"])[1]")
	private AndroidElement Occupiedselect;


public void checkdetails() {
	wLib.waitForElemnetToBeVisible(type);
	String details1 = phonenumberdetails.getText();
	String details2 = typedetails.getText();
	String details3 = emaildetails.getText();
	String details4 = Locationdetails.getText();
	click(phone);
	wLib.waitForElemnetToBeVisible(StationID);
	VerificationUtils.validate("true", valuepresent(details1), "phonenumberdetails  is display");
	VerificationUtils.validate("true", valuepresent(details2), "typedetails  is display");
	VerificationUtils.validate("true", valuepresent(details3), "emaildetails  is display");
	VerificationUtils.validate("true", valuepresent(details4), "Locationdetails  is display");
	
}
public void addFirestation() {
	click(addfirestaionbtn);
	
}



public void firestationbackbtn() {
	click(backbtnfs);
}
public static String valuepresent(String elementtxt) {
	
	  AndroidElement element = (AndroidElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@label='"+elementtxt+"']"));
	

		String present = Boolean.toString(isDisplayed(element));
		return present;
	
}
}

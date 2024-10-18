package pom.check.funct;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;
import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pom.createIncident.baseIncident;

public class myFDTab extends BaseTest{

	public myFDTab()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath = "(//XCUIElementTypeTextField[@value = \"(Required)\"])[1]")
	private AndroidElement selectiam;
	@FindBy(xpath = "//XCUIElementTypeTextField[@value = \"Type and select county name\"]")
	private AndroidElement countryEnter;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@value = \"Search by Department Name or FDID\"]")
	private AndroidElement searchdepselect;
	@FindBy(xpath = "//XCUIElementTypeTextField[@value = \"Email\"]")
	private AndroidElement email;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@value = \"DPS certification number\"]")
	private AndroidElement DPSenter;
	@FindBy(xpath = "//XCUIElementTypeTextField[@value = \"DPS Certificate Expiration Date\"]")
	private AndroidElement DPScertificateenter;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Register with additional department\"]//..//..")
	private AndroidElement registeradditional;
	
	@FindBy(xpath = "//XCUIElementTypeNavigationBar[@name = \"KahunaBaseApp.IncidentsDashboardVC\"]/XCUIElementTypeButton[2]")
	private AndroidElement  Menubutton;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My FD\"]")
	private AndroidElement  MyFD;
	
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"FDID\"])[1]")
	private AndroidElement FDID;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Fire Department : \"]")
	private AndroidElement FireDepartment;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Apparatus Info\"]")
	private AndroidElement Apparatusinfo;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"Apparatus List\"]")
	private AndroidElement AppratusList;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"E1\"]")
	private AndroidElement E1;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Engine 1\"]")
	private AndroidElement Engine1;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Suppression\"]")
	private AndroidElement suppression;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Engine\"]")
	private AndroidElement Engine;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Active\"]")
	private AndroidElement Active;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Apparatus Maintenance History\"]")
	private AndroidElement AppratusMaintenancehistory;
	
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\" Add\"])[2]")
	private AndroidElement add;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Edit\"]")
	private AndroidElement Edit;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Inactive\"]")
	private AndroidElement Inactive;
	
	@FindBy(xpath = "//XCUIElementTypeNavigationBar[@name = \"KahunaBaseApp.AparatusInfoListView\"]//XCUIElementTypeButton[2]")
	private AndroidElement addappratus;
	
	@FindBy(xpath = "(//XCUIElementTypeTextField[@name=\"Enter\"])[1]")
	private AndroidElement appratusname;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Apparatus ID\"]//..//XCUIElementTypeTextField[@name=\"Enter\"]")
	private AndroidElement	appratusid;
	
	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Select\"])[1]")
	private AndroidElement appratususe;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Suppression\"]")
	private AndroidElement supp;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
	private AndroidElement done;
	
	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Select\"])[2]")
	private AndroidElement appratustype;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Submit\"]")
	private AndroidElement submit;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Ground fire suppression, other\"]")
	private AndroidElement ground;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Apparatus added successfully\"]")
	private AndroidElement appadded;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
	private AndroidElement okbuttn;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"NavBackBtn\"]")
	private AndroidElement back;
		
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Personnel\"]")
	private AndroidElement personnel;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Decal Requests\"]")
	private AndroidElement Decalrequest;
	
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Decal Request\"]//..//XCUIElementTypeButton)[2]")
	private AndroidElement adddecal;
	
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Personnel List\"]//..//XCUIElementTypeButton)[2]")
	private AndroidElement addpersonal;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Contact\"]")
	private AndroidElement contact;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@value = \"Provide contact details\"]")
	private AndroidElement provide;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Phone Number*\"]//..//XCUIElementTypeTextField")
	private AndroidElement password;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Application Details\"]")
	private AndroidElement appdetails;
	
	@FindBy(xpath = "(//XCUIElementTypeTextField[@value = \"(Required)\"])[1]")
	private AndroidElement required;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Vehicle Details\"]")
	private AndroidElement vehicledetails;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Yes\"]")
	private AndroidElement yes;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Decal Requests\"]")
	private AndroidElement Dacel;
	
	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Done\"])[2]")
	private AndroidElement done2;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Personnel\")]")
	private AndroidElement Personnel;
	
	
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Personnel List\"])[2]")
	private AndroidElement Personnellist;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Fetching Requests...')]")
	private AndroidElement Fetchingrequest;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\" Incident Date:\"]")
	private AndroidElement incodentdate;
	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"You have successfully submitted your case.\")]")
	private AndroidElement requestnumber;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Your Decal Request has been submitted successfully.\"]")
	private AndroidElement Decalrequestsubmit;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@value = \"Select\"]")
	private AndroidElement select;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Engineer\"]")
	private AndroidElement engg;
	
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Existing Contact\"]//..//XCUIElementTypeButton)[1]")
	private AndroidElement Exsisting;
	@FindBy(xpath = "//XCUIElementTypeTextField[@value = \"Type here to search\"]")
	private AndroidElement typesearch;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Select Contact\"]")
	private AndroidElement selectcontact;
	@FindBy(xpath = "(//XCUIElementTypeOther)[2]")
	private AndroidElement allen;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Confirm\"]//..")
	private AndroidElement confrim;
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Company*\"]//..//XCUIElementTypeTextField)[1]")
	private AndroidElement companyname;
	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Ohio OFIRS QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[3]")
	private AndroidElement deptcomments;
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Fire Station\"])[1]")
	private AndroidElement firestation;
	
	
	
	public void myfd(String FDIDn) throws Exception {
		try {
			wLib.waitForElemnetToBeClickable(incodentdate, "incident Date");
		} catch (Exception e) {}
		click(Menubutton);
		click(MyFD);
//		click(FDID);
		wLib.waitForElemnetToBeVisible(FDID);
		AndroidElement Aidselect = (AndroidElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@value='"+FDIDn+"']"));
		click(Aidselect);
		wLib.waitForElemnetToBeVisible(FireDepartment);
		
		
		
	}
	public void scrolldecal() {
		scrollDown(Dacel);
	}
	public void scrollfirestation() {
		scrollDown(firestation);
	}
	public void firestationclick() {
		click(firestation);
	}
	public String verifyE1() {

		String present = Boolean.toString(isDisplayed(E1));
		return present;
	}
	public void appratusfd() {
		click(E1);
		wLib.waitForElemnetToBeVisible(Engine1);
		
	}
	public String verifyEngine() {

		String present = Boolean.toString(isDisplayed(Engine));
		return present;
	}
	
	public String verifyActive() {

		String present = Boolean.toString(isDisplayed(Active));
		return present;
	}
	public String verifyAppratusmaintenancehistory() {

		String present = Boolean.toString(isDisplayed(AppratusMaintenancehistory));
		return present;
	}
	public String verifyadd() {

		String present = Boolean.toString(isDisplayed(add));
		return present;
	}
	public String verifyedit() {

		String present = Boolean.toString(isDisplayed(Edit));
		return present;
	}
	public String verifyInactive() {

		String present = Boolean.toString(isDisplayed(Inactive));
		return present;
	}
	
	public void appratusadd() throws Exception {
		click(addappratus);
		sendKeys(appratusname, "ABC875");
		Thread.sleep(3000l);
		click(appratusid);
		sendKeys(appratusid, "ABC9875");
		click(appratususe);
		click(supp);
		click(done);
		click(appratususe);
		click(ground);
		click(done);
		click(submit);
		wLib.waitForElemnetToBeVisible(appadded);
		click(okbuttn);
//		click(back);
	}
	public void back() {
		click(back);
	}
	public void adddecel(String DPSNO , String ManufacturingYear, String MakeAndModel, String LPNo , String MCrossOption, String DeptComment) {
		click(Dacel);
		wLib.waitForElemnetToBeVisible(Decalrequest);
		click(adddecal);
		click(contact);
		click(provide);
		click(done);
		click(done);
		click(appdetails);
		click(required);
		click(done);
		click(required);
		sendKeys(required, DPSNO);
		click(done);
		click(vehicledetails);
		click(required);
		sendKeys(required, ManufacturingYear);
		click(required);
		sendKeys(required, MakeAndModel);
		click(required);
		sendKeys(required, LPNo);
		click(done2);
		click(required);
		click(done);
		dataclickbutton(MCrossOption);
//		click(yes);
		click(done);
		scrollDown(submit);
		sendKeys(deptcomments, DeptComment);
		click(Done);
		click(submit);
		wLib.waitForElemnetToBeVisible(Decalrequestsubmit);
		click(okbuttn);
		
	}
	
	
	
	public void personnel() {
		click(Personnel);
		wLib.waitForElemnetToBeVisible(Personnellist);
		click(addpersonal);
		click(select);
		click(engg);
		click(done);
		click(Exsisting);
		click(typesearch);
		click(done);
		wLib.waitForElemnetToBeVisible(selectcontact);
		click(allen);
		click(done);
		sendKeys(companyname, "3di");
		click(done);
		click(confrim);
		click(back);
		
	}
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Registration Cases\"]")
	private AndroidElement registration;
	
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Applicant Name\"])[1]")
	private AndroidElement applicationname;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"FDID\"]")
	private AndroidElement FDID1;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Logout\"]")
	private AndroidElement logout;
	
	public void  registrationcases() {
		click(registration);
		click(applicationname);
//		wLib.waitForElemnetToBeClickable(addComments, "add Comments");
		wLib.waitForElemnetToBeVisible(FDID1);
		click(back);
		click(back);
		
	}
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Documents\"])[2]")
	private AndroidElement Documents;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Documents\"]//..")
	private AndroidElement AddDocument;
	
	public void documents() {
		click(Documents);
		wLib.waitForElemnetToBeVisible(AddDocument);
		
	}
	public void logout() {
		click(Menubutton);
		click(logout);
	}
	public void menuclick() {
		click(Menubutton, "Menu Button");
	}
	public void clickmyfd() {
		click(MyFD);
	}
	public void clickregisteradditional() {
		click(registeradditional);
	}
	public void registeradditionaldepartmentform(String IAm, String County, String DeptNameFDID, String FPAChief, String DPSNO) {
		click(selectiam);
		sendKeys(search, IAm);
		AndroidElement IAmselect = (AndroidElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@label='"+IAm+"']"));
		click(IAmselect);
		click(Done);
		
		sendKeys(countryEnter, County);
		AndroidElement countryselect = (AndroidElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@label='"+County+"']"));
		click(countryselect);
		
		click(searchdepselect);
		sendKeys(search, DeptNameFDID);
		AndroidElement DeptNameFDIDselect = (AndroidElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@label='"+DeptNameFDID+"']"));
		click(DeptNameFDIDselect);
		click(Done);
		
		sendKeys(email, FPAChief);
		click(Done);
		
		sendKeys(DPSenter, DPSNO);
		click(Done);
		click(DPScertificateenter);
		click(Done);
		
		click(submitform);
		
		
	}
	public void registeradditionaldepartmentconfirmation() {
		String reguest = requestnumber.getText();
		String requestnumber = extractConfirmationNumber(reguest);
		System.out.println(requestnumber);
	}
}
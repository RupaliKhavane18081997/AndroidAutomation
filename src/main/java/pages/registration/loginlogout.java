package pages.registration;

import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BasePage;
import Base.BaseTest;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.VerificationUtils;

public class loginlogout extends BasePage{
	public loginlogout ()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnOhIdLogin")
	private AndroidElement OhidLogin;
	
	@FindBy(xpath="//button[@id='loginSubmit']")
	private AndroidElement LoginSubmit;
	
	@FindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"KahunaBaseApp.IncidentsDashboardVC\"]/XCUIElementTypeButton[2]")
	private AndroidElement menu;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Logout\"]")
	private AndroidElement logout;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Register\"]")
	private AndroidElement Register;
	

	
}
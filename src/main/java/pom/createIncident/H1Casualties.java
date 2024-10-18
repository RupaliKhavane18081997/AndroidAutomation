package pom.createIncident;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class H1Casualties extends baseIncident {
	public String values = "0";
	public H1Casualties()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@FindBy(xpath="(//android.widget.EditText[@text='Enter'])[1]")
	private AndroidElement Enterfield1;
	
	@FindBy(xpath="(//android.widget.EditText[@text='Enter'])[2]")
	private AndroidElement Enterfield2;
	@FindBy(xpath="//android.widget.CheckBox")
	private AndroidElement None ;
	
	public void Deathenter(String FireServiceDeath, String FireServiceInjuries ) throws Exception {
		
		if(FireServiceDeath.equals(values) && FireServiceInjuries.equals(values)) {
			click(None);
		}else {
		click(Enterfield1);
		UtilsKeys.press(FireServiceDeath);
		if(driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
		if(driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
		
		click(Enterfield1);
		Enterfield1.clear();
		UtilsKeys.press(FireServiceInjuries);
		driver.hideKeyboard();
		}
		if(driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
		if(driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
		
	}
	public void civilian(String CivilianDeath, String CivilianInjuries) throws Exception {
		if(CivilianDeath.equals(values) && CivilianInjuries.equals(values)) {

			List chkBx = driver.findElements(MobileBy.className("android.widget.CheckBox"));
			String a=((RemoteWebElement) chkBx.get(0)).getAttribute("checked");
//			System.out.println("Check box is" + a);
			if(a.equals("true")) {
				LogManager.getLogger().info("Check box is Selected");
			}else{
				click(None);
			}
		}else {
		click(Enterfield1 , "Enter");
		UtilsKeys.press(CivilianDeath);
		driver.hideKeyboard();
		if(driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
		if(driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
		click(Enterfield1 , "Enter");
		Enterfield1.clear();
		UtilsKeys.press(CivilianInjuries);
		driver.hideKeyboard();
		if(driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
		if(driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
		}
	}
	
}

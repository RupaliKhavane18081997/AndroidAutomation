package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class buildingHeight extends baseIncident {
	public buildingHeight()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	
	
	public void building(String abovegrade, String bellowgrade) throws Exception {

		sendKeys(Enterfield1, abovegrade);
		if(driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
		sendKeys(Enterfield1, bellowgrade);
		if(driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
		
		
		
	}
}

package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class j1fireorigin extends baseIncident {
	public j1fireorigin()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	
	
	public void origin(String fireorigin) throws Exception {
		
		
		sendKeys(Enterfield1, fireorigin);
		if(driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
		
		
		
	}
}

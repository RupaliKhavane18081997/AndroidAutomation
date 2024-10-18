package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class l4mainfloorsize extends baseIncident {
	public l4mainfloorsize()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	
	
	public void mainfloor(String TotalSquare) throws Exception {
		
		click(CheckBox1,"Total Square feet Checkbox");
		sendKeys(Enterfield1, TotalSquare);
		if(driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
		
		
		
	}
}

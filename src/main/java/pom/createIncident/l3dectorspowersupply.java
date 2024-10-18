package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class l3dectorspowersupply extends baseIncident {
	public l3dectorspowersupply()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	@FindBy(xpath = "//android.widget.RadioButton[@text='1- Present']")
	private AndroidElement Present;
	@FindBy(xpath="//android.widget.TextView[@text='1 - Battery only']")
	private AndroidElement Batteryonly;
	
	
	public void powersuppky() throws Exception {
		click(Selecttext, "Select");
		click(Batteryonly, "Battery Only");
		click(Done);
		
		
		
	}
}

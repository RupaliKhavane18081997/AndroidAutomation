package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class l4DetectorOperation extends baseIncident {
	public l4DetectorOperation()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	@FindBy(xpath = "//android.widget.RadioButton[@text='1- Present']")
	private AndroidElement Present;
	
	@FindBy(xpath="//android.widget.TextView[@text='1 - Fire too small to activate detector']")
	private AndroidElement Fire_Too_Small;
	
	public void detectorops() throws Exception {
		
		click(Selecttext, "Select");
		click(Fire_Too_Small, "Fire too small to activate detector");
		click(Done);
		
		
		
	}
}

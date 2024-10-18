package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class l2dectortype extends baseIncident {
	public l2dectortype()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	@FindBy(xpath = "//android.widget.RadioButton[@text='1- Present']")
	private AndroidElement Present;
	
	@FindBy(xpath="//android.widget.TextView[@text='1 - Smoke']")
	private AndroidElement Smoke;
	
	public void detectorspres() throws Exception {
		
		click(Selecttext, "Select");
		click(Smoke, "Smoke");
		click(Done);
		
		
		
	}
}

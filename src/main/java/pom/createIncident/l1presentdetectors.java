package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class l1presentdetectors extends baseIncident {
	public l1presentdetectors()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	@FindBy(xpath = "//android.widget.RadioButton[@text='1- Present']")
	private AndroidElement Present;
	
	
	
	public void detectorspres() throws Exception {
		
		click(Present, "Present");
		
		
	}
}

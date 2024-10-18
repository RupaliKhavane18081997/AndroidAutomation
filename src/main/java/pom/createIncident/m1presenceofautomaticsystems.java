package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class m1presenceofautomaticsystems extends baseIncident {
	public m1presenceofautomaticsystems()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	@FindBy(xpath = "//android.widget.RadioButton[@text='1- Present']")
	private AndroidElement Present;
	
	
	
	public void systems() throws Exception {
		
		click(Present, "Present");
		
		
	}
}

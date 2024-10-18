package pom.createIncident;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class B1_PrpertyDetails extends baseIncident {
	
	public B1_PrpertyDetails()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="//android.widget.RadioButton[@text='Not Residential']")
	private AndroidElement NotResidential;
	
	@FindBy(xpath="//android.widget.RadioButton[@text='Buildings not involved']")
	private AndroidElement Buildings;
	
	@FindBy(xpath="//android.widget.RadioButton[@text='None']")
	private AndroidElement None ;
	
	public void B1_PropertyDeals()
	{
		
		click(NotResidential,"NotResidential");
		click(Buildings, "Buildings");
		click(None,"None");
		swipe(528,1913,512,470);
		
	
	}

}

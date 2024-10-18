package pom.createIncident;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class C_OnSIteMaterialsOrProduct extends baseIncident{
	
	public C_OnSIteMaterialsOrProduct()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="//android.widget.RadioButton[@text='No']")
	private AndroidElement OnSiteMAterial;

	
	public void C_OnSIteMaterials()
	{
		click(OnSiteMAterial);
	
	}
}

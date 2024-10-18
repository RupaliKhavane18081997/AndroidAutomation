package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.*;
import Base.UtilsKeys;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class M_Authorization611 extends baseIncident {
	

	public M_Authorization611()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="(//android.widget.TextView[@text='Select'])[1]")
	private AndroidElement Select;
	
	@FindBy(xpath="//android.widget.TextView[@text='3di sim Smith']")
	private AndroidElement SelectOfficier;
	
	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	private AndroidElement Done;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/chbCustomView")
	private AndroidElement CheckBox;
	
	@FindBy(xpath="//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")
	public AndroidElement NextButton;
	
	
	

		
		
	public void M_Authorization611Details() throws Exception {
		
		click(Select,"Select Officier ");
		click(SelectOfficier,"SelectOfficier");
		click(Done,"Done");
		click(CheckBox,"CheckBox");
		
		Scrolltoelement(NextButton, 5, "Next");
		
		
		
	}

}

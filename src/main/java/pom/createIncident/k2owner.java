package pom.createIncident;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class k2owner extends baseIncident  {
	public k2owner()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@FindBy(xpath="//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")
	public AndroidElement NextButton;
	
	
	public void k2own() throws InterruptedException {
		//swipe(528,1913,512,470);
		Scrolltoelement(NextButton, 5, "NextButton");
	}
}

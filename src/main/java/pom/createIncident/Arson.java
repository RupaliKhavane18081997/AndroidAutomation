package pom.createIncident;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Arson extends baseIncident {

	 
	public Arson()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/chbCustomView")
	private AndroidElement None;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnSubmit")
	private AndroidElement Submit;
	@FindBy(xpath = "//android.widget.TextView[@text='Success']")
	private AndroidElement success;
	
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	private AndroidElement OkButtonOFIncidentCreation;
	
	public void ArsonDetails() throws InterruptedException
	{
		click(None,"None");
		
		clickAfterScrolling(Submit, 10, "Submit");
		click(success, "success");
		
		//click(OkButtonOFIncidentCreation,"OkButtonOFIncidentCreation");
		
		
	}
	public String verifySuccessfulMessage(){
		String present = Boolean.toString(success.isDisplayed());
		return present;
	}
}

package pom.createIncident;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Lremarks extends baseIncident {

	
	public Lremarks()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtValue")
	private AndroidElement remarkedit;
	
	public void lremark(String remk) throws Exception {
//		swipe(528,1913,512,470);
		click(remarkedit);
		UtilsKeys.press(remk);
		if(driver.isKeyboardShown()) {
			driver.hideKeyboard();
		}
		click(NextButton , "Next");
		
	}
}

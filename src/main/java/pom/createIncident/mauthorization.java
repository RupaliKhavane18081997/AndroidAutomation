package pom.createIncident;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class mauthorization extends baseIncident {
	
	public mauthorization()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	public void mauthoriz() {
		swipe(528,1913,512,470);
	}
}

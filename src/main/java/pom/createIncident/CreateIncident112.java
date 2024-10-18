package pom.createIncident;

import org.openqa.selenium.support.PageFactory;

import Base.BasePage;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CreateIncident112 extends BasePage{

	
	public CreateIncident112()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
}

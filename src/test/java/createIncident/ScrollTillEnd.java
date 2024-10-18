package createIncident;


import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pom.createIncident.baseIncident;

public class ScrollTillEnd extends baseIncident {

	
	public ScrollTillEnd()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	


	
	//Scrolltoelement(SelectProceduresUsed, 10, "H - Procedures Used");


}

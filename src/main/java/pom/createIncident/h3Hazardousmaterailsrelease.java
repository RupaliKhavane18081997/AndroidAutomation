package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class h3Hazardousmaterailsrelease  extends baseIncident {
	public h3Hazardousmaterailsrelease()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	
	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	private AndroidElement Done;
	
	
	public void HazardousMaterialsRelease(String Hazardous) {
		click(Selecttext);
		AndroidElement Hazardousele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+Hazardous+"']"));
		click(Hazardousele, Hazardous);
		click(Done);
		click(NextButton);
	}
}
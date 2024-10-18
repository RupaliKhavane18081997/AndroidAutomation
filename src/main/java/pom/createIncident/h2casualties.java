package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class h2casualties extends baseIncident  {
	public h2casualties()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	
	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	private AndroidElement Done;
	
	public void Detector(String Detector) {
		click(Selecttext);
		AndroidElement Detectorele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+Detector+"']"));
		click(Detectorele, Detector);
		click(Done , "Done");
		click(NextButton, "Next Button");
		
	}
}

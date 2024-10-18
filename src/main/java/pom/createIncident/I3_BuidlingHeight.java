package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class I3_BuidlingHeight extends baseIncident {
	public I3_BuidlingHeight()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="(//android.widget.EditText[@text='Enter'])[1]")
	private AndroidElement abovegrade;
	
	@FindBy(xpath="//android.widget.EditText[@text='Enter']")
	private AndroidElement belowgrade;
	
	
	
	public void BuildingHeight(String abovegradeheight, String belowgradeheight) throws Exception {
//		swipe(528,1913,512,470);
		click(abovegrade,"above grade");
		AndroidElement abovegradeele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+abovegrade+"']"));
		click(abovegradeele,"above ");
		click(Done);
		
		click(abovegrade,"above grade");
		AndroidElement belowgradeele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+abovegrade+"']"));
		click(belowgradeele,"below grade");
		click(Done);
		
		
	}
	
	

}

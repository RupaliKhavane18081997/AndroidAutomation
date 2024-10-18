package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class I2_BuildingStatus extends baseIncident {
	public I2_BuildingStatus()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	
	
	public void BuildingStat(String BuildingStatus) throws Exception {
//		swipe(528,1913,512,470);
		click(Selecttext,"Select");
		AndroidElement StatusBuildele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+BuildingStatus+"']"));
		click(StatusBuildele,"StatusBuild");
		click(Done);
		
		
	}
	
	

}

package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Structuretype extends baseIncident {
	public Structuretype()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	
	
	public void Structype(String stufire) throws Exception {
//		swipe(528,1913,512,470);
		click(Selecttext,"Select");
		AndroidElement stufireele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+stufire+"']"));
		click(stufireele, stufire);
		click(Done);
		
		
	}
}

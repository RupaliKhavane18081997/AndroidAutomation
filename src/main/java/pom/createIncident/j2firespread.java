package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class j2firespread extends baseIncident {
	public j2firespread()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	
	
	public void firespread(String FireSpread) throws Exception {
		
		
		AndroidElement FireSpreadele=driver.findElement(By.xpath("//android.widget.RadioButton[@text='"+FireSpread+"']"));
		click(FireSpreadele, FireSpread);
		
		
		
	}
}

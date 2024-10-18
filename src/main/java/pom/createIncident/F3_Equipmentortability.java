package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class F3_Equipmentortability extends baseIncident {
	public F3_Equipmentortability()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="(//android.widget.CheckBox[@resource-id='com.threedi.ohioNFERs.qa:id/rdoSingle'])[1]")
	private AndroidElement Portable;
	
	
	
	public void F3Equipmentortability(){
		
		click(Portable , "Check box");
		
	}	
		
}	
	
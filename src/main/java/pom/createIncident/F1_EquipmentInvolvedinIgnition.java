package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class F1_EquipmentInvolvedinIgnition extends baseIncident {
	public F1_EquipmentInvolvedinIgnition()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="(//android.widget.TextView[@text='Select'])[1]")
	private AndroidElement Select;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	private AndroidElement Done;
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtSearch")
	private AndroidElement SearchBar;
	
	public void F1EquipmentInvolvedinIgnition(String EquipmentInvolvedinIgnition) throws Exception {
		clickScreenshot(Select);
		clickScreenshot(SearchBar);
		UtilsKeys.press("124");
		AndroidElement F1EquipmentInvolvedinIgnitionele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+EquipmentInvolvedinIgnition+"']"));
		clickScreenshot(F1EquipmentInvolvedinIgnitionele,EquipmentInvolvedinIgnition);
		click(Done);
		
	}
}

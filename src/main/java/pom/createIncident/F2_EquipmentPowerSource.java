package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class F2_EquipmentPowerSource extends baseIncident {

	
	public F2_EquipmentPowerSource()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	
	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	private AndroidElement Done;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtSearch")
	private AndroidElement SearchBar;
	
	public void F2EquipmentPowerSource(String EquipmentPowerSource) throws Exception {
		click(Selecttext);
		click(SearchBar);
		UtilsKeys.press("22");
		AndroidElement EquipmentPowerSourceele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+EquipmentPowerSource+"']"));
		click(EquipmentPowerSourceele,EquipmentPowerSource);
		click(Done);
		
			
		}
		
		
		
		
	}

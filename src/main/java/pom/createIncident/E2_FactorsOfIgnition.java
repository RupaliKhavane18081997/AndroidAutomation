package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class E2_FactorsOfIgnition extends baseIncident {
	public E2_FactorsOfIgnition()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="(//android.widget.TextView[@text='Select'])[1]")
	private AndroidElement Select;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/chbCustomView")
	private AndroidElement HumanFactor;
	
	
	
	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	private AndroidElement Done;
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtSearch")
	private AndroidElement SearchBar;
	
	public void FactorsForIginiti(String FactorsContributingtoIgnition) throws Exception {
		click(Select);
		click(SearchBar);
		UtilsKeys.press("11");
		AndroidElement FactorsContributingtoIgnitionele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+FactorsContributingtoIgnition+"']"));
		click(FactorsContributingtoIgnitionele,FactorsContributingtoIgnition);
		click(Done);
		
		
		
	}
}


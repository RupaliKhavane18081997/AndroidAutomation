package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class E3_HumanFactors extends baseIncident {
	public E3_HumanFactors()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	
	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	private AndroidElement Done;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtSearch")
	private AndroidElement SearchBar;
	
	
	public void E3_HumanFactorstoInginition(String E3HumanFactors) throws Exception {
		click(Selecttext);
		click(SearchBar);
		UtilsKeys.press("2");
		AndroidElement E3_HumanFactorsele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+E3HumanFactors+"']"));
		click(E3_HumanFactorsele,E3HumanFactors);
		click(Done);
		
		
	}
}

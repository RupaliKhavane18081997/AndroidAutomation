package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class H1_MobileProperty extends baseIncident {
	public H1_MobileProperty()
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
	
	public void H1MobileProperty(String H1Property) throws Exception {
		click(Select);
		click(SearchBar);
		String proprty = H1Property;
		String[] arrOfStr = proprty.split(" ");
		sendKeys(SearchBar, arrOfStr[0]);
		AndroidElement H1MobilePropertyEle=driver.findElement(By.xpath("//android.widget.TextView[@text='"+H1Property+"']"));
		click(H1MobilePropertyEle,H1Property);
		click(Done);
		
		
		
	}
}

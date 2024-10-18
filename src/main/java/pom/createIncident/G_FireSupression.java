package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class G_FireSupression extends baseIncident {
	public G_FireSupression()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnAdd")
	private AndroidElement FireSupression;
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Select;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/chbCustomView")
	private AndroidElement HumanFactor;
	
	
	
	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	private AndroidElement Done;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtSearch")
	private AndroidElement SearchBar;

	@FindBy(xpath="//android.widget.TextView[@text='Submit']")
	private AndroidElement Submit;
	
	public void GFireSupression(String G_FireSupression) throws Exception {
		click(FireSupression);
		click(Select);
		click(SearchBar);
		UtilsKeys.press("185");
		AndroidElement GFireSupressionele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+G_FireSupression+"']"));
		click(GFireSupressionele,G_FireSupression);
		click(Done);
		click(Submit);
		
	}	
		
	}

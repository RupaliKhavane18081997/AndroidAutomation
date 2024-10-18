package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class E1_CauseOfIgnition extends baseIncident {

	
	public E1_CauseOfIgnition()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;
	
	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	private AndroidElement Done;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtSearch")
	private AndroidElement SearchBar;
	
	public void CauseofIgnition(String CauseIgnition) throws Exception {
		click(Selecttext);
		click(SearchBar);
		UtilsKeys.press("1");
		AndroidElement SelectCauseOfIgnition=driver.findElement(By.xpath("//android.widget.TextView[@text='"+CauseIgnition+"']"));
		click(SelectCauseOfIgnition,CauseIgnition);
		click(Done);
		
			
		}
		
		
		
		
	}
	


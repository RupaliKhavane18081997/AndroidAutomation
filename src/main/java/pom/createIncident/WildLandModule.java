

package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WildLandModule extends baseIncident {
	

	public WildLandModule()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	@FindBy(xpath="//android.widget.Button[@text='YES']")
	private AndroidElement YES;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnNext")
	private AndroidElement NextButton;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/txtValue")
	private AndroidElement AreaType;
	
	@FindBy(xpath="//android.widget.TextView[@text='Wildland Fire Cause *']//..//..//android.widget.TextView[@text='Select']")
	private AndroidElement SelectWildlandFireCause;
	
	@FindBy(xpath="//android.widget.TextView[@text='#1']//..//..//android.widget.TextView[@text='Select']")
	private AndroidElement Factorsforfirecontribution1;
	
	@FindBy(xpath="//android.widget.TextView[@text='#2']//..//..//android.widget.TextView[@text='Select']")
	private AndroidElement Factorsforfirecontribution2;
	
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/btnAdd")
	private AndroidElement AddFireSupressionFactor;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/txtValue")
	private AndroidElement SelectFireSupressionFactor;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtSearch")
	private AndroidElement SearchBar;
	

	@FindBy(xpath="//android.widget.TextView[@text='Submit']")
	private AndroidElement Submit;
	
	@FindBy(xpath="//android.widget.TextView[@text='1- Asleep']")
	private AndroidElement Asleep;
	
	public void WildLandModuleDetails(String WildLandAreaType, String WildLandFireCause, String WildLandHumanFactorContributingIgnition, String FactorsContributingToIgnition, String FireSupressionFactor) throws Exception {
		click(YES,"YES Button");
		Scrolltoelement(NextButton,5,"NextButton");
		click(NextButton,"NextButton");
		click(AreaType,"AreaType");
		click(SearchBar);
		AndroidElement WildLandAreaTypeEle=driver.findElement(By.xpath("//android.widget.TextView[@text='"+WildLandAreaType+"']"));
		click(WildLandAreaTypeEle,WildLandAreaType);
		click(Done,"Done");
		click(NextButton,"NextButton");
		click(SelectWildlandFireCause,"SelectWildlandFireCause");
		click(SearchBar);
		AndroidElement WildLandFireCauseEle=driver.findElement(By.xpath("//android.widget.TextView[@text='"+WildLandFireCause+"']"));
		click(WildLandFireCauseEle,WildLandFireCause);
		click(Done,"Done");
		click(NextButton,"NextButton");
		//click(SearchBar);
		/*
		 * AndroidElement
		 * WildLandHumanFactorContributingIgnitionEle=driver.findElement(By.xpath(
		 * "//android.widget.TextView[@text='"+WildLandHumanFactorContributingIgnition+
		 * "']")); click(WildLandHumanFactorContributingIgnitionEle,
		 * WildLandHumanFactorContributingIgnition);
		 */
		
		click(Asleep,"Asleep");
		Scrolltoelement(NextButton,5,"NextButton");
		click(NextButton,"NextButton");
		click(SearchBar);
		click(Factorsforfirecontribution1,"Factorsforfirecontribution1");
		AndroidElement FactorsContributingToIgnitionEle=driver.findElement(By.xpath("//android.widget.TextView[@text='"+FactorsContributingToIgnition+"']"));
		click(FactorsContributingToIgnitionEle,FactorsContributingToIgnition);
		click(Done,"Done");
		click(NextButton,"NextButton");
		click(AddFireSupressionFactor,"AddFireSupressionFactor");
		click(SelectFireSupressionFactor,"SelectFireSupressionFactor");
		click(SearchBar);
		AndroidElement FireSupressionFactorEle=driver.findElement(By.xpath("//android.widget.TextView[@text='"+FireSupressionFactor+"']"));
		click(FireSupressionFactorEle,FireSupressionFactor);
		click(Done,"Done");
		click(Submit,"Submit Button");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
		
		
}
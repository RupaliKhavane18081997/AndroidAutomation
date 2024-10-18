package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class D_Ignition extends baseIncident {

	
	public D_Ignition()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@FindBy(xpath="(//android.widget.TextView[@resource-id='com.threedi.ohioNFERs.qa:id/txtValue'])[1]")
	private AndroidElement AreaOfFire;
	
	@FindBy(xpath="//android.widget.TextView[@text='01 - Hallway corridor, mall']")
	private AndroidElement Hallway;
	
	@FindBy(xpath="//android.widget.TextView[@text='Done']")
	private AndroidElement Done;
	
	
	@FindBy(xpath="(//android.widget.TextView[@resource-id='com.threedi.ohioNFERs.qa:id/txtValue'])[2]")
	private AndroidElement HeatSource;
	
	@FindBy(xpath="//android.widget.TextView[@text='10 - Heat from powered equipment, other']")
	private AndroidElement SelectHeatSource;
	
	
	@FindBy(xpath="(//android.widget.TextView[@resource-id='com.threedi.ohioNFERs.qa:id/txtValue'])[3]")
	private AndroidElement ItemFIgnited;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='10 - Structural component or finish, other']")
	private AndroidElement SelectItemFirstIgnited;
	
	@FindBy(xpath="(//android.widget.TextView[@resource-id='com.threedi.ohioNFERs.qa:id/txtValue'])[4]")
	private AndroidElement TypeofMaterialFirstIgnited;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='20 - Flammable or combustible liquid, other']")
	private AndroidElement SelectTypeofMaterialFirstIgnited;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtSearch")
	private AndroidElement SearchBar;
	
	
	
	//private AndroidElement SearchBar;
	public void D_Igni(String ItemFirstIgnited, String TypeofMaterialFirstlyIgnited) throws Exception
	{
		click(AreaOfFire);
		click(Hallway);
		click(Done);
	
		click(HeatSource);
		click(SelectHeatSource);
		click(Done);
		
		
		
		/*
		 * click(ItemFirstIgnited); click(SelectItemFirstIgnited); click(Done);
		 */
		 
		/*
		 * click(TypeofMaterialFirstIgnited); click(SelectTypeofMaterialFirstIgnited);
		 * click(Done);
		 */
		  
		  
		    click(ItemFIgnited, "ItemFirstIgnited");
			click(SearchBar);
			String proprty = ItemFirstIgnited;
			String[] arrOfStr = proprty.split(" ");
			sendKeys(SearchBar, arrOfStr[0]);
			//sendKeys(SearchBar,ItemFirstIgnited);
			//UtilsKeys.press("1");
			AndroidElement ItemFirstIgnitedele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+ItemFirstIgnited+"']"));
			click(ItemFirstIgnitedele,ItemFirstIgnited);
			click(Done);
			
			
			
			click(TypeofMaterialFirstIgnited,"TypeofMaterialFirstIgnited");
			click(SearchBar);
			String proprty1 = TypeofMaterialFirstlyIgnited;
			String[] arrOfStr1 = proprty1.split(" ");
			sendKeys(SearchBar, arrOfStr1[0]);
			
			//sendKeys(SearchBar,TypeofMaterialFirstlyIgnited);
			AndroidElement TypeofMaterialFirstIgnitedele=driver.findElement(By.xpath("//android.widget.TextView[@text='"+TypeofMaterialFirstlyIgnited+"']"));
			click(TypeofMaterialFirstIgnitedele,ItemFirstIgnited);
			click(Done);
			
			
			
		
			
			
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}

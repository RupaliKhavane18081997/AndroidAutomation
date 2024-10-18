package pom.createIncident;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class D_IgnitionNew extends baseIncident {

	
	public D_IgnitionNew()
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
	private AndroidElement ItemFirstIgnited;
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement Selecttext;

	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/lytSingleSelection")
	private AndroidElement SelectItemFirstIgnited;
	
	@FindBy(id="com.threedi.ohioNFERs.qa:id/edtSearch")
	private AndroidElement SearchBar;
	
	@FindBy(xpath="//android.widget.TextView[@text='Select']")
	private AndroidElement TypeOfMaterial;
	
	@FindBy(xpath="//android.widget.TextView[@text='20 - Flammable or combustible liquid, other']")
	private AndroidElement SelectTypeOfMaterial;
	
	@FindBy(xpath="(//android.widget.TextView[@resource-id='com.threedi.ohioNFERs.qa:id/txtValue'])[4]")
	private AndroidElement TypeofMaterialFirstIgnited;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='20 - Flammable or combustible liquid, other']")
	private AndroidElement SelectTypeofMaterialFirstIgnited;
	
	public void D_IgnitionNewFirstItem() throws Exception {
		
		
		
		
		click(AreaOfFire);
		click(Hallway);
		click(Done);
	
		click(HeatSource);
		click(SelectHeatSource);
		click(Done);
		
		click(ItemFirstIgnited);
		click(SearchBar);
		UtilsKeys.press("96");
		click(SelectItemFirstIgnited);
		click(Done);
		
		click(TypeOfMaterial);
		click(SelectTypeOfMaterial);
		click(Done);
		
		/*
		 * click(TypeofMaterialFirstIgnited); click(SelectTypeofMaterialFirstIgnited);
		 * click(Done);
		 */
		
			
		}
}

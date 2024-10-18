package dermAppJava;


import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.UtilsKeys;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pom.createIncident.baseIncident;

public class DermApp extends baseIncident {
	public DermApp()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

@FindBy(xpath="//android.widget.TextView[@text=\"Sign in With Bioclinica SSO\"]")
private AndroidElement SignIn;

@FindBy(xpath="//android.widget.TextView[@text=\"Project Title One\"]")
private AndroidElement ProjectTitle;

@FindBy(xpath="(//android.widget.TextView[@text=\"Completed\"])[1]")
private AndroidElement Complete;

@FindBy(xpath="(//android.widget.TextView[@text=\"In-Progress\"])[1]")
private AndroidElement InProgress;

@FindBy(xpath="//android.widget.EditText[@text=\"Search for Subject ID, Case ID, etc...\"]")
private AndroidElement SearchSubjectID;

@FindBy(xpath="//android.widget.TextView[@text=\"Back\"]")
private AndroidElement BackArrow;
	
	
	
	
	
	
	public void LaunchDermApp(String add) throws Exception {
		clickScreenshot(SignIn, "Sign In Button");
		Thread.sleep(1000L);
		tap(200,300);
		SwipetoModule();
		clickScreenshot(ProjectTitle,"Project Title");
		clickScreenshot(Complete,"Complete");
		isDisplayed(InProgress);
		clickScreenshot(SearchSubjectID,"SearchSubjectID");
		UtilsKeys.press("0101");
		driver.hideKeyboard();
		clickScreenshot(BackArrow,"BackArrow");
		
		
		
		
		
		
		
		
	}
	

private void tap(int i, int j) {
	// TODO Auto-generated method stub
	
}
}

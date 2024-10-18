package pages.registration;

import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BasePage;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class registrationOhioandroidApp  extends BasePage {

	public registrationOhioandroidApp() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@FindBy(xpath = "//android.widget.Button[@text='Register']")
	private AndroidElement registerbutton;
	@FindBy(id = "com.threedi.ohioNFERs.qa:id/editEmail")
	private AndroidElement emailfield;
	@FindBy(id =  "com.threedi.ohioNFERs.qa:id/editPassword")
	private AndroidElement passwordfield;
	@FindBy(xpath = "//android.widget.Button[@text='Sign Up']")
	private AndroidElement signupButton;
	
	
	
	
	
	public void clickregisterbutton() {
		clickScreenshot(registerbutton);
	}
	public String emailfield(){
		String present = Boolean.toString(isDisplayed(emailfield));
		    return present;
	}
	public String passwordfield(){
		String present = Boolean.toString(isDisplayed(passwordfield));
		    return present;
	}
	public String signupButton(){
		String present = Boolean.toString(isDisplayed(signupButton));
		    return present;
	}
		
	public void clickemailfield() {
		clickScreenshot(emailfield);
	}
	
	
	
	}
	

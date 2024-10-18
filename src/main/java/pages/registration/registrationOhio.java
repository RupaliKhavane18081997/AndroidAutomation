

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.ohio.BaseClassWithDesiredCapablities;
import com.ohio.ConstrainOR;
import com.testing.framework.EmailUtils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.touch.WaitOptions;
import javax.mail.*;
import javax.mail.search.FlagTerm;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;


public class registrationOhio extends BaseClassWithDesiredCapablities {

	@Test(priority = 1)
	public void clickregiter() throws Exception, Exception {
		

		driver.findElement(By.xpath("//android.widget.Button[@text='Register']")).click();
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/editEmail")).isDisplayed();
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/editPassword")).isDisplayed();
		driver.findElement(By.xpath("//android.widget.Button[@text='Sign Up']")).isDisplayed();
		System.out.println("Test Case Register Pass");
	}

	@Test(priority = 2 , dependsOnMethods = {"clickregiter"})
	public void registerpage() throws InterruptedException {
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/editEmail")).click();
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/editEmail")).sendKeys(ConstrainOR.Email_Username);
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/editPassword")).click();
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/editPassword")).sendKeys(ConstrainOR.Password);
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/editConfirmPassword")).click();
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/editConfirmPassword")).sendKeys(ConstrainOR.Password);
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/editFirstName")).click();
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/editFirstName")).sendKeys(ConstrainOR.First_name);
		driver.navigate().back();
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/editLastName")).click();
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/editLastName")).sendKeys(ConstrainOR.Last_name);
		driver.navigate().back();
		driver.findElement(By.xpath("//android.widget.Button[@text='Sign Up']")).isDisplayed();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//android.widget.Button[@text='Sign Up']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		System.out.println("Test Case Registration Credentials Pass");
		

	}

	
  @Test(priority = 3, dependsOnMethods = {"registerpage"})
	public void EmailActivationLink() throws Exception, IOException {
	  
	  fetchemailotp();
	  System.out.println("Valid User !!");
	  
      
}
  @Test(priority=4, dependsOnMethods = {"EmailActivationLink"})
  public void ClickOnLoginButtonWithVerifiedMail()
  {
	  	
	    driver1.findElement(By.xpath("//a[@class='Loginbutton btn btn-primary']")).click();
		driver1.findElement(By.xpath("//input[@id='Username']")).isDisplayed();
		driver1.findElement(By.xpath("//input[@id='Password']")).isDisplayed();
		System.out.println("Test Case Click OnLogin Button With VerifiedMail Pass");
  }
  
  @Test(priority=5, dependsOnMethods = {"ClickOnLoginButtonWithVerifiedMail"})
  public void LoginWithVerified()
  
  {
		driver1.findElement(By.xpath("//input[@id='Username']")).sendKeys(ConstrainOR.Email_Username);
		driver1.findElement(By.xpath("//input[@id='Password']")).sendKeys(ConstrainOR.Password);
		
		
		try
		{
		driver1.findElement(By.xpath("//button[@id='btnLogin']")).click();
		}catch(Exception e)
		{
			
		}
		driver1.findElement(By.xpath("//span[contains(text(),'Welcome to OHIO State Fire Marshal Portal.')]")).isDisplayed();
		driver1.findElement(By.id("PortalUserType_1")).isDisplayed();
		driver1.findElement(By.id("PortalUserType_2")).isDisplayed();
		System.out.println("Test Case Login With Verified Mail Pass");
  }
  
  @Test(priority=6, dependsOnMethods = {"LoginWithVerified"})
  public void AssociatedWithFireDepartment() throws InterruptedException 
  {
	  	WebDriverWait web = new WebDriverWait(driver1, 60);
	  	web.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Fire Department']"))).isDisplayed();
	  	driver1.findElement(By.xpath("//label[text()='Fire Department']")).click();
	  	driver1.findElement(By.xpath("//select[@id='ContactAssnTypeId']")).click();
	  	driver1.context("NATIVE_APP");
	  	driver1.findElement(By.xpath("//android.widget.CheckedTextView[@text='Assistant Fire Chief']")).click();
	  	driver1.context("CHROMIUM");
	  	driver1.findElement(By.xpath("//input[@id='County']")).sendKeys("Union");
	  	driver1.findElement(By.xpath("//span[text()='Union']")).click();
		driver1.findElement(By.xpath("//span[text()='Search by Department Name or FDID']")).click();
		driver1.findElement(By.xpath("//span[text()='ALLEN TOWNSHIP FIRE DEPARTMENT (Union County) - 80215']")).click();
		
		driver1.findElement(By.xpath("//input[@id='Email']")).sendKeys(ConstrainOR.Email_Username);
		
		driver1.findElement(By.xpath("//input[@id='DPSCertificationNumber']")).sendKeys("dps123");
	    driver1.findElement(By.xpath("//input[@id='DPSCertificateExpiryDate']")).click();
	    driver1.findElement(By.xpath("//button[@class='k-input-button k-button k-icon-button k-button-md k-button-solid k-button-solid-base']")).click();
	    driver1.findElement(By.xpath("//a[@class='k-nav-fast k-button k-button-md k-rounded-md k-button-flat k-button-flat-base k-flex']")).click();
	    driver1.findElement(By.xpath("//a[@class='k-nav-next k-button k-button-md k-rounded-md k-button-flat k-button-flat-base k-icon-button']")).click();
	    driver1.findElement(By.xpath("//a[text()='Dec']")).click();
	    driver1.findElement(By.xpath("//a[text()='19']")).click();
		((JavascriptExecutor)driver1).executeScript("arguments[0].scrollIntoView(true);",driver1.findElement(By.xpath("//button[text()='Submit']")));
		((JavascriptExecutor) driver1).executeScript("window.scrollBy(0,1000)");
		JavascriptExecutor js = (JavascriptExecutor) driver1;
		js.executeScript("window.scrollBy(0,1000)"); WebElement element = (WebElement) driver1.findElement(By.xpath("//button[text()='Submit']"));
		element.click();
		driver1.findElement(By.xpath("//button[text()='Ok']")).isDisplayed();
	    driver1.findElement(By.xpath("//button[text()='Ok']")).click();
	    driver1.findElement(By.xpath("//span[contains(text(),'My Service Requests')]")).isDisplayed();
	  
  }
  
}


package com.pom.ohio;

import java.awt.Dimension;
import java.util.Set;

import org.apache.poi.ss.formula.functions.Value;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;

import com.ohio.BaseClassWithDesiredCapablities;







public class CreateNewIncidentWithOhioID extends BaseClassWithDesiredCapablities {
	
	
	public String txt = "1234";
	public String Password = "Ohio@1234";
	
	
	@Test(priority = 1)	
	public void testcaseSignInWith() throws InterruptedException
	{
		driver.resetApp();
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/btnOhIdLogin")).click();
		Thread.sleep(8000L);
		Thread.sleep(8000L);
		
		
		
	}

	public void switchToNativeview() {
	    Set<String> str = driver.getContextHandles();
	    for (String newsrt : str) {
	      if (newsrt.contains("NATIVE")) {
	        driver.context(newsrt);
	      }
	   
	    } 
	  }

	public void switchToWeb() {
	    Set<String> str = driver.getContextHandles();
	    for (String newsrt : str) {
	      if (newsrt.contains("chrome")) {
	        driver.context(newsrt);
	      }
	     
	    } 
	  }
	@Test(priority = 2, dependsOnMethods = {"testcaseSignInWith"})	
	public void loginintoappication() throws InterruptedException
	{
		switchToWeb();
		System.out.println("This is  click 1");
		Thread.sleep(2000L);
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "(//span[text()='Menu'])[2]")));
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//input[@id='loginUserID']")));
		 */
		//driver.findElement(By.xpath("//input[@id='loginUserID']")).click();
		driver.findElement(By.xpath("//input[@id='loginUserID']")).sendKeys("shawn.mac");
		System.out.println("This is click 2");
		driver.findElement(By.xpath("//input[@id=\"loginPassword\"]")).sendKeys(Password);
		driver.navigate().back();
		/*JavascriptExecutor js = (JavascriptExecutor) driver ;
		WebElement Element = driver.findElement(By.xpath("//button[@value='submit']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@value='submit']")));*/
		try {
		driver.findElement(By.xpath("//button[@id='loginSubmit']")).click();
		driver.findElement(By.xpath("//button[@id='loginSubmit']")).click();
		}
		catch(Exception e)
		{
			
		}
	    System.out.println("Login Into Application ");
		

	}
	@Test(priority = 3, dependsOnMethods = {"loginintoappication"})	
	public void createNewIncident() {
		switchToNativeview();
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='My Incidents']")));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Create Incident']")).click();
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='1 - Fire']")));
		driver.findElement(By.xpath("//android.widget.TextView[@text='1 - Fire']")).click();
		System.out.println("Test Case Create New Incident");
		
	}


	@Test(priority = 4, dependsOnMethods = {"createNewIncident"})
	public void createIncidentWithFire ()
	{
		driver.findElement(By.xpath("//android.widget.TextView[@text='11 - Structure Fire']")).click();
		driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[3]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='MM/DD/YYYY']")).isDisplayed();
		System.out.println("Test Case Create NcreateIncidentWithFireew Incident with fire");
		
		
		
	}
	
	@Test(priority = 5, dependsOnMethods = {"createIncidentWithFire"})
	public void BasicInfoToCreateIncident() throws InterruptedException

	{
		driver.findElement(By.xpath("//android.widget.TextView[@text='Select']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Search']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Search']")).sendKeys("02003");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Select']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='02003']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Done']")).click();
		/*
		 * //driver.findElement(By.xpath("/		driver.findElement(By.xpath("//android.
		 * widget.TextView[@text='Done']")).click();
		 * /android.widget.TextView[@text='OH']"));
		 */		driver.findElement(By.xpath("//android.widget.TextView[@text='MM/DD/YYYY']")).click();
		driver.findElement(By.xpath("//android.view.View[@text='20']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();
		driver.findElement(By.xpath("//android.widget.AutoCompleteTextView[@text='Enter street address/intersection']")).click();
		driver.findElement(By.xpath("//android.widget.AutoCompleteTextView[@text='Enter street address/intersection']")).sendKeys("1234");
		((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.BACKSPACE);
		((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.KEYCODE_4);
		
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/line1")).click(); 
		
		
//		AndroidElement element = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.Button\")).scrollIntoView(new UiSelector().text(\"Submit\"));");
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Documents\")));
//		scrollWithUiAutomator("Submit");
		swipe(528,1913,512,470);
		System.out.println("Submit click");
		
		
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().xpath(\"//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']\").instance(0))").click(); //scroll down to the element and click
		
	
		
		/*
		 * AndroidElement mapenter =
		 * driver.findElement(By.xpath("com.threedi.ohioNFERs.qa:id/edtSearch"));
		 * mapenter.sendKeys(txt.substring(0, 1)); for (int i = 1; i < txt.length();
		 * i++) { char c = txt.charAt(i); mapenter.sendKeys(txt.substring(i, i + 1)); //
		 * driver.findElementByXPath("com.threedi.ohioNFERs.qa:id/edtSearch").sendKeys(
		 * txt.substring(i, i + 1)); System.out.println("Entered"); }
		 */
		/*
		 * driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/line1")).click();
		 * 
		 * 
		 * ((JavascriptExecutor)driver).executeScript(
		 * "arguments[0].scrollIntoView(true);",driver.findElement(By.xpath(
		 * "//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']"
		 * ))); ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
		 * JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 * js2.executeScript("window.scrollBy(0,1000)"); WebElement element2 =
		 * (WebElement) driver.findElement(By.xpath(
		 * "//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']"
		 * )); element2.click();
		 */
	
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();
		//driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();

		driver.findElement(By.xpath("//android.widget.TextView[@text='Select']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='1 - Mutual aid received']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Done']")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();
		driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[2]")).click();
		driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"3\"]")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		driver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.threedi.ohioNFERs.qa:id/chbCustomView\"])[1]")).click();
		driver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id=\"com.threedi.ohioNFERs.qa:id/chbCustomView\"])[2]")).click();

		
		swipe(529,2017,570,720);
		System.out.println("Click Check box");
		
		driver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id='com.threedi.ohioNFERs.qa:id/chbCustomView'])[3]")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();
		//driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();
		driver.findElement(By.xpath("(//android.widget.TextView[@text='Select'])[1]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='10 - Fire control or extinguishment, other']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Done']")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();

		
		swipe(523,1930,577,1410);
		System.out.println("Click Check box");
		
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/chbCustomView")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();

		
		driver.findElement(By.xpath("(//android.widget.CheckBox[@index='0'])[1]")).click();
		driver.findElement(By.xpath("(//android.widget.CheckBox[@index='0'])[2]")).click();
		driver.findElement(By.xpath("(//android.widget.CheckBox[@index='0'])[3]")).click();
		
		swipe(523,1930,577,1410);
		System.out.println("Click Check box");
		
		driver.findElement(By.xpath("(//android.widget.CheckBox[@index='0'])[4]")).click();
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();

		
		driver.findElement(By.xpath("(//android.widget.CheckBox[@index='0'])[1]")).click();

		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();

		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();

		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();

		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/txtValue")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='100 - Assembly, other']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Done']")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();
		
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/btnAdd")).click();
		driver.findElement(By.xpath("(//android.widget.EditText[@text='Enter'])[1]")).sendKeys("Abc");
		driver.findElement(By.xpath("(//android.widget.EditText[@text='Enter'])[2]")).sendKeys("9156169089");
		driver.findElement(By.xpath("(//android.widget.TextView[@text='Select'])[1]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='MR']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Done']")).click();
		driver.findElement(By.xpath("(//android.widget.EditText[@text='Enter'])[3]")).sendKeys("John");
		driver.findElement(By.xpath("(//android.widget.EditText[@text='Enter'])[4]")).sendKeys("Tib");
		driver.findElement(By.xpath("(//android.widget.EditText[@text='Enter'])[5]")).sendKeys("Ttt");
		driver.findElement(By.xpath("(//android.widget.TextView[@text='Select'])[2]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='JR']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Done']")).click();
		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/chbCustomView")).click();
		swipe(523,1930,577,1410);
		System.out.println("check Sumbit Button");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();

		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();

		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/chbCustomView")).click();
		
		swipe(523,1930,577,1410);
		System.out.println("check next button");

		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();

		driver.findElement(By.id("com.threedi.ohioNFERs.qa:id/edtValue")).sendKeys("It is major issue");
		driver.navigate().back();
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();

		swipe(523,1930,577,1410);
		System.out.println("check next button");

		

		
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.threedi.ohioNFERs.qa:id/btnNext']")).click();
	

		driver.findElement(By.xpath("//android.widget.Button[@text='Submit']")).click();
		
		System.out.println("Test Case Basic info to crate the Incident");
		
		
	}

	
	
	
	
	
}


package Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

public class AppiumLeftClickExample extends BaseTest {

    public static void clickOnLeftSideOfElement() {
		/*
		 * Point elementLocation = element.getLocation(); Dimension elementSize =
		 * element.getSize();
		 * 
		 * int leftX = elementLocation.getX(); int centerY = elementLocation.getY() +
		 * elementSize.getHeight() / 2;
		 * 
		 * TouchAction touchAction = new TouchAction(driver);
		 * touchAction.press(ElementOption.element(element, leftX, centerY)) .release()
		 * .perform();
		 */
		/*
		 * int elementWidth = element.getSize().getWidth(); int elementHeight =
		 * element.getSize().getHeight(); int elementX = element.getLocation().getX();
		 * int elementY = element.getLocation().getY();
		 * 
		 * int tapX = elementX + (elementWidth / 4); // Adjust the fraction as needed
		 * int tapY = elementY + (elementHeight / 2);
		 * 
		 * TouchAction touchAction = new TouchAction(driver);
		 * touchAction.tap(ElementOption.point(tapX, tapY)).perform();
		 */
    	 AndroidElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='My Incidents']]"));
    	    int targetX = element.getLocation().getX();
    	    int targetY = element.getLocation().getY() + element.getSize().getHeight() / 2;

    	    TouchAction touchAction = new TouchAction(driver);
    	    touchAction.tap(PointOption.point(targetX - 50, targetY))
    	               .perform();
    }

    // Usage example
    @Test
    public  void cgeck() {
        // Initialize your driver and find the element
//
//        MobileElement element = driver.findElementByXPath("//android.widget.TextView[@text='My Incidents']");

        // Click on the left side of the element
        clickOnLeftSideOfElement();
    }
}

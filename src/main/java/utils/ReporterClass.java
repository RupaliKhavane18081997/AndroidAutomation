package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Base.BaseTest;
import io.appium.java_client.android.AndroidElement;

public interface ReporterClass {
	
	public Status info = Status.INFO;
	public Status fail = Status.FAIL;
	public Status pass = Status.PASS;
	public Status warning = Status.WARNING;
	public Status Skip = Status.SKIP;
	
	
	/**
	 * Attach Screenshot to reporter with message and status
	 * @param status
	 * @param message
	 * @throws IOException 
	 */
	
	public static void ReportLoggerScreenshot(Status status, String message){
		BaseTest.test.log(status, message,MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot()).build());
	}
	
	public static void ReportLoggerScreenshot(Status status, String message, AndroidElement element) throws IOException{
		
			BaseTest.test.log(status, message,MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot(element)).build());
//		BaseTest.test.log(status,message,
//				MediaEntityBuilder.createScreenCaptureFromBase64String(((TakesScreenshot) BaseTest.driver)
//						.getScreenshotAs(OutputType.BASE64)).build());
			
	}
	
	public static void ReportLoggerScreenshot(Status status, String message, WebElement element) throws IOException{
		
		BaseTest.test.log(status, message,MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot(element)).build());
//	BaseTest.test.log(status,message,
//			MediaEntityBuilder.createScreenCaptureFromBase64String(((TakesScreenshot) BaseTest.driver)
//					.getScreenshotAs(OutputType.BASE64)).build());
		
}


//	public static void getScreenshot() throws IOException {
//	    
//
//	    // Capture the screenshot
//	    File source = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
//
//	    // Specify the destination path
//	     //destination = System.getProperty("user.dir") + "/Extent Report/" + BaseTest.className + "/Screenshot/" + dateName + ".png";
//	    File finalDestination = new File(destination);
//
//	    try {
//	        // Copy the screenshot file to the destination
//	        Files.copy(source.toPath(), finalDestination.toPath());
//	        System.out.println("Screenshot saved to: " + destination);
//	    } catch (IOException e) {
//	        System.err.println("Error copying screenshot file: " + e.getMessage());
//	    }
//
//	  
//	}
	public static String getScreenshot() {
	    String dateName = new SimpleDateFormat("ddMMyyyyHHmmss").format(new Date());

	    try {
	       
	        File source = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
	        File Destination = new File(System.getProperty("user.dir") + "/Extent Report/"  +BaseTest.dateForReport()+"/"+ BaseTest.className + "/Screenshot/"+ dateName + ".png");
	        String screenshotPath = "./Screenshot/"+ dateName + ".png";
	       
	       // System.out.println("Screenshot saved to: " + screenshotPath);
	        FileUtils.copyFile(source, Destination);       
	        return screenshotPath;
	    } catch (IOException e) {
	        System.err.println("Error capturing and saving screenshot: " + e.getMessage());
	        return null;
	    }
	}
	
	public static String getScreenshot(AndroidElement element) {
	    String dateName = new SimpleDateFormat("ddMMyyyyHHmmss").format(new Date());

	    try {
	       
	        File source = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
	        File Destination = new File(System.getProperty("user.dir") + "/Extent Report/"  +BaseTest.dateForReport()+"/"+ BaseTest.className + "/Screenshot/"+ dateName + ".png");
	        String screenshotPath = "./Screenshot/"+ dateName + ".png";
	        BufferedImage screenshotImage = javax.imageio.ImageIO.read(source);
		    Graphics2D graphics = screenshotImage.createGraphics();
		    int x = element.getLocation().getX();
            int y = element.getLocation().getY();
            int width = element.getSize().getWidth();
            int height = element.getSize().getHeight();

            // Set the border color and draw the rectangle around the element
            graphics.setColor(Color.RED); // You can set the color of the border
            graphics.setStroke(new BasicStroke(10)); // Set the border width
            graphics.drawRect(x, y, width, height);

		    // Save the edited screenshot
		    javax.imageio.ImageIO.write(screenshotImage, "png", source);
		    File editedScreenshotPath = new File( source.getAbsolutePath());
	       // System.out.println("Screenshot saved to: " + screenshotPath);
	        FileUtils.copyFile(editedScreenshotPath, Destination);       
	        return screenshotPath;
	    } catch (IOException e) {
	        System.err.println("Error capturing and saving screenshot: " + e.getMessage());
	        return null;
	    }
	}
	
	public static String getScreenshot(WebElement element) {
	    String dateName = new SimpleDateFormat("ddMMyyyyHHmmss").format(new Date());
	 
	    try {
	        // Capture the entire screen
	        File source = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
	 
	        // Define the destination path for the screenshot
	        File destination = new File(System.getProperty("user.dir") + "/Extent Report/" +
	                BaseTest.dateForReport() + "/" + BaseTest.className + "/Screenshot/" + dateName + ".png");
	 
	        // Define the relative path for the screenshot
	        String screenshotPath = "./Screenshot/" + dateName + ".png";
	 
	        // Get the JavaScript executor
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) BaseTest.driver;

	 
	        // Apply a red border to the element using JavaScript
	        String script = "arguments[0].style.border='2px solid red';";
	        jsExecutor.executeScript(script, element);
	 
	        // Capture the modified screen
	        File editedSource = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
	 
	        // Reset the border style to remove the red border
	        script = "arguments[0].style.border='';";
	        jsExecutor.executeScript(script, element);
	 
	        // Copy the edited screenshot to the specified destination
	        FileUtils.copyFile(editedSource, destination);
	 
	        // Return the relative path to the screenshot
	        return screenshotPath;
	    } catch (IOException e) {
	        System.err.println("Error capturing and saving screenshot: " + e.getMessage());
	        return null;
	    }
	}
	/**
	 * Modify After adding Config.properties
	 * @param message
	 * @param isScreeshotNeeded
	 * @throws Exception 
	 */
	public static void pass(String message, boolean isScreeshotNeeded , AndroidElement element) throws Exception {
			if (isScreeshotNeeded) {
				BaseTest.test.pass( message,MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot(element)).build());
//				BaseTest.test.pass(message,
//					MediaEntityBuilder.createScreenCaptureFromBase64String(((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.BASE64)).build());
		} else {
			BaseTest.test.pass(message);
		}
	}
	
	public static void pass(String message, boolean isScreeshotNeeded , WebElement element) throws Exception {
		if (isScreeshotNeeded) {
			BaseTest.test.pass( message,MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot(element)).build());
//			BaseTest.test.pass(message,
//				MediaEntityBuilder.createScreenCaptureFromBase64String(((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.BASE64)).build());
	} else {
		BaseTest.test.pass(message);
	}
}
	
	
	
	
//	public static void fail(String message, boolean isScreeshotNeeded) throws Exception {
//		
//		if (isScreeshotNeeded) {
//			
////			BaseTest.test.fail( message,MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot()).build());
////			BaseTest.test.fail(message,
////					MediaEntityBuilder.createScreenCaptureFromBase64String(((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.BASE64)).build());
//		} else 
//		{
//			BaseTest.test.fail(message);
//		}
//	}
	
	public static void fail(String message, boolean isScreeshotNeeded) {
		if (isScreeshotNeeded) {
			BaseTest.test.fail( message,MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot()).build());
//			BaseTest.test.fail(message,
//					MediaEntityBuilder.createScreenCaptureFromBase64String(((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.BASE64)).build());
		} else 
		{
			BaseTest.test.fail( message,MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot()).build());
 
			//BaseTest.test.fail(message);
		}
	}
	
	public static void pass(String message, boolean isScreeshotNeeded)  {
		if (isScreeshotNeeded) {
			BaseTest.test.pass( message,MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot()).build());
//			BaseTest.test.fail(message,
//					MediaEntityBuilder.createScreenCaptureFromBase64String(((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.BASE64)).build());
		} else 
		{
			BaseTest.test.pass( message,MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot()).build());
 
			//BaseTest.test.fail(message);
		}
	}
	
	
}

package testpakage;

import java.util.Date;
import org.testng.annotations.Test;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

import org.openqa.selenium.OutputType;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import javax.imageio.ImageIO;
import Base.BaseTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class sikulitest extends BaseTest {
	public static Point2D getCoords(BufferedImage baseImg, String targetImgPath, double minSimilarityValue)
	  {
	    org.sikuli.basics.Settings.MinSimilarity = minSimilarityValue;
	    
	    Finder f = new Finder(baseImg);
	    Point2D coords = new Point2D.Double(-1.0D, -1.0D);
	    
	    f.find(targetImgPath);
	    if (f.hasNext())
	    {
	      Match m = f.next();
	      coords.setLocation(m.getTarget().getX(), m.getTarget().getY());
	    }
	    org.sikuli.basics.Settings.MinSimilarity = 0.8D;
	    return coords;
	  }
	  
	  public static BufferedImage takeScreenshot()
	  {
	    File scrFile = (File)driver.getScreenshotAs(OutputType.FILE);
	    BufferedImage bufferedImage = null;
	    try
	    {
	      bufferedImage = ImageIO.read(scrFile);
	    }
	    catch (IOException e)
	    {
	      e.printStackTrace();
	    }
	    return bufferedImage;
	  }
	  
	  public boolean clickByImage(String targetImgPath)
	  {
	    long startTime = System.currentTimeMillis();
	    long elapsedTime = 0L;
	    boolean flag = false;
	    while (elapsedTime < 90000L)
	    {
	      Point2D coords = getCoords(takeScreenshot(), targetImgPath, 0.6D);
	      if ((coords.getX() >= 0.0D) && (coords.getY() >= 0.0D))
	      {
	    	  new TouchAction(driver).press(PointOption.point((int)coords.getX(), (int)coords.getY())).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).release().perform(); 
	      
	        flag = true;
	        break;
	      }
	      elapsedTime = new Date().getTime() - startTime;
	    }
	    return flag;
	  }
	  
	  public static boolean AssertOnImage(String targetImgPath)
	  {
	    long startTime = System.currentTimeMillis();
	    long elapsedTime = 0L;
	    boolean flag = false;
	    while (elapsedTime < 90000L)
	    {
	      Point2D coords = getCoords(takeScreenshot(), targetImgPath, 0.7D);
	      if ((coords.getX() >= 0.0D) && (coords.getY() >= 0.0D))
	      {
	        flag = true;
	        break;
	      }
	      elapsedTime = new Date().getTime() - startTime;
	    }
	    return flag;
	  }
	@Test
	public void TestCase01ohioautomation() throws Exception {
		Thread.sleep(3000l);
		clickByImage("C:\\Users\\IDC-547\\Desktop\\signbuton.png");
		AssertOnImage("C:\\\\Users\\\\IDC-547\\\\Desktop\\\\login.png");
		clickByImage("C:\\Users\\IDC-547\\Desktop\\login.png");
}
}

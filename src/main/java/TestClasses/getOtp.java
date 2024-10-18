package TestClasses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class getOtp {
	
	
	//  protected static DriverHelper helper = new DriverHelper();
			public static void main(String[] args) {
				String otp1;
				String otp2;

				
				try{
					URL url = new URL("https://msit.intouch.onlinesbi.com/mfp/api/adapters/UtilsAdapter/getOtp/UAT/7400426831");
					HttpURLConnection conn = (HttpURLConnection)url.openConnection(); 
					conn.setRequestMethod("GET"); 
					conn.connect();
					int responsecode = conn.getResponseCode(); 
					String strTemp = "", response = "";
					if(responsecode != 200) {
						System.out.println("Response is not received");
					}
					else
					{
						BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

						while (null != (strTemp = br.readLine())) {
							System.out.println(strTemp);
							response += strTemp;
						}

						System.out.println("Response is " + response);			
						JsonParser parse = new JsonParser();
						JsonObject jobj = (JsonObject)parse.parse(response); 
						JsonArray jsonArray = (JsonArray) jobj.getAsJsonArray("update"); 
						//System.out.println(jsonArray.size());
						JsonObject JsonObject1 = (JsonObject) jsonArray.get(0).getAsJsonObject(); 
						JsonObject JsonObject2 = (JsonObject) JsonObject1.getAsJsonObject("7400426831"); 
						System.out.println("update is " + JsonObject1);				
						JsonElement otp = JsonObject2.get("otp");
						 otp1=otp.toString();
						 otp2 = otp1.substring(1, 7);
						System.out.println("OTP is " + otp2);
						

					}}catch(Exception e){
						
						e.printStackTrace();
						
						
					}
				

			}
			}
			
			
			
			
			

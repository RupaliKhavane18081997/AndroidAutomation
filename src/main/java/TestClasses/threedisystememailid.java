package TestClasses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class threedisystememailid {
	public static String Messageid;
	public static String verificationurl;
	public static String Emailid = "3disystem1@3diemail.com";
	
	public static void main(String[] args) throws Exception {
		getemailmessage();
	}

	


public static  String getMessageID(){
    try{
    	String strTemp = "", response = "";
        URL url = new URL("https://3diemail.3didemo.com/mailServer/rest/parseEmail/v1/get_selected_email_contents");
        HttpURLConnection getMessageIDconnection = (HttpURLConnection) url.openConnection();
        getMessageIDconnection.setRequestMethod("POST");
        getMessageIDconnection.setDoOutput(true);
        String payload = "{\"pageNumber\":1,\"pageSize\":10,\"email\":\""+ Emailid +"\"}"; 
        byte[] out = payload.getBytes(StandardCharsets.UTF_8);
        OutputStream stream = getMessageIDconnection.getOutputStream();
        stream.write(out);
//        System.out.println(connection.getResponseCode() + " " + connection.getResponseMessage());  
        BufferedReader bf = new BufferedReader(new InputStreamReader(getMessageIDconnection.getInputStream()));
        while (null != (strTemp = bf.readLine())) {
			response += strTemp;
		}
//        System.out.println(response.toString());
        JsonParser parse = new JsonParser();
		JsonObject jobj = (JsonObject) parse.parse(response);
		JsonArray Listofvalues = (JsonArray) jobj.getAsJsonArray("list");
		JsonObject Arrayvaluesoflist = (JsonObject) Listofvalues.get(0).getAsJsonObject();
		JsonElement Message = Arrayvaluesoflist.get("id");
//		System.out.println(Message);
		Messageid = Message.toString().replace("\"", "");
		getMessageIDconnection.disconnect();
   
    }catch (Exception e){
        System.out.println(e);
        System.out.println("Failed successfully");
    }
	return Messageid;
}

public static void emaildelete() {
	try{
    	String strTemp = "", deleteresponse = "";
        URL url = new URL("https://3diemail.3didemo.com/mailServer/rest/parseEmail/v1/delete_email_contents");
        HttpURLConnection emaildeleteconnection = (HttpURLConnection) url.openConnection();
        emaildeleteconnection.setRequestMethod("POST");
        emaildeleteconnection.setDoOutput(true);
        String payload = "{\"ids\":[\""+ Messageid +"\"],\"email\":\""+ Emailid +"\"}"; 
        byte[] out = payload.getBytes(StandardCharsets.UTF_8);
        OutputStream stream = emaildeleteconnection.getOutputStream();
        stream.write(out);
//        System.out.println(connection.getResponseCode() + " " + connection.getResponseMessage());  
        BufferedReader bf = new BufferedReader(new InputStreamReader(emaildeleteconnection.getInputStream()));
        while (null != (strTemp = bf.readLine())) {
        	deleteresponse += strTemp;
		}
//        System.out.println("Response is " + deleteresponse);
	}catch (Exception e) {
		  System.out.println(e);
	        System.out.println("Failed to Delete successfully");
	}
}

public static String getemailmessage() {
	try{
		getMessageID();
    	String emailStrtemp = "", emailResponse = "";
        URL url = new URL("https://3diemail.3didemo.com/mailServer/rest/parseEmail/v1/get_email_contents_id/"+ Messageid);
        HttpURLConnection getemailmessageconnection = (HttpURLConnection) url.openConnection();
        getemailmessageconnection.setRequestMethod("GET");
        getemailmessageconnection.setDoOutput(true);
        BufferedReader bf = new BufferedReader(new InputStreamReader(getemailmessageconnection.getInputStream()));
        while (null != (emailStrtemp = bf.readLine())) {
        	emailResponse += emailStrtemp;
		}
//        System.out.println("Response is " + emailResponse);
        JsonParser parse = new JsonParser();
		JsonObject jobOj = (JsonObject) parse.parse(emailResponse);
		JsonObject emailContentsObject = jobOj.getAsJsonObject().getAsJsonObject("emailContents");
		String contentHtml = emailContentsObject.get("contentHtml").getAsString();
		Pattern pattern = Pattern.compile("href=\"(.*?)\"");
        Matcher matcher = pattern.matcher(contentHtml);
        if (matcher.find()) {
            verificationurl = matcher.group(1);
            System.out.println(verificationurl);
        }
        
        emaildelete();
        
}catch (Exception e) {
	 System.out.println(e);
     System.out.println("Verification Email Not Found");
}
	return verificationurl;
	
}

}

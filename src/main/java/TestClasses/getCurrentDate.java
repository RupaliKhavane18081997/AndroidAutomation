package TestClasses;

import java.util.Calendar;

public class getCurrentDate {
	
	static int Date;
	
	//public static void main(String[] args)
	public int selectBeforeDate(){
	
	    Calendar calendar = Calendar.getInstance();
		System.out.println("Current Date is : " + calendar.getTime());
		calendar.add(Calendar.DATE, -2);
		System.out.println("Two days Before : " + calendar.get(calendar.DATE));
		Date = calendar.get(calendar.DATE);
		System.out.println(Date);
		return Date;
	}
	
	public int selectAfterDate(){
		
	    Calendar calendar = Calendar.getInstance();
		System.out.println("Current Date is : " + calendar.getTime());
		calendar.add(Calendar.DATE, +2);
		System.out.println("Two days Later : " + calendar.get(calendar.DATE));
		Date = calendar.get(calendar.DATE);
		System.out.println(Date);
		return Date;
	}
	 

}

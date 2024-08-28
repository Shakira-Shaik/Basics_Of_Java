package automationbatch44;

import java.util.Date;

public class Time_PCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //  Date d1=new Date();
 //   System.out.println(d1.getTime());
    Date d2=new Date();
    System.out.println(d2);
    String Time=d2.toString();
    String month=Time.substring(4, 7);
    System.out.println(month);
    String date=Time.substring(8, 10);
    System.out.println(date);
    String year=Time.substring(Time.length()-4);
    System.out.println(year);
    String Dateformat=date.concat("/").concat(month).concat("/").concat(year);
    System.out.println(Dateformat);
	}

}

package automationbatch44;

import java.util.Scanner;

public class Trapezium {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner S=new Scanner(System.in);
	     System.out.println("Enter the value of a");
	     int a=S.nextInt();
	     System.out.println("Enter the value of b");
	     int b=S.nextInt();
	     System.out.println("Enter the value of h");
	     int h=S.nextInt();
	     int area =((a+b)*h)/2;
	  System.out.println("The Area of Trapezium is " + area); 
	       S.close();
	}
 
}

package automationbatch44;

import java.util.Scanner;

public class Circumference_Circle {
	 final static double Pi= 3.14;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	 Scanner S=new Scanner(System.in); 
	// System.out.println("enter the value of r");
		int r=S.nextInt();
		double Circumference = 2*Pi*r;
System.out.println("The Circumference of circle is " +  Circumference); 
	    S.close(); 
	}

}

package automationbatch44;

import java.util.Scanner;

public class Circumference_Rectangle {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 Scanner S=new Scanner(System.in);
	     System.out.println("Enter the value of a");
	     int a=S.nextInt();
	     System.out.println("Enter the value of b");
	     int b=S.nextInt();
	     int Circumference=2*(a+b);
	  System.out.println("The Circumference of Rectangle is  "+  Circumference); 
	       S.close();
	}

}

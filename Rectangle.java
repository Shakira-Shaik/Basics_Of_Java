package automationbatch44;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
	     System.out.println("Enter the length value");
	     float L=S.nextFloat();
	     System.out.println("Enter the breadth value");
	     float B=S.nextFloat();
	     double area=L*B;
	  System.out.println("The area of Rectangle is " + area);
	     S.close();
	}

}

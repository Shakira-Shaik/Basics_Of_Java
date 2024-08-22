package automationbatch44;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     Scanner S=new Scanner(System.in);
     System.out.println("Enter the breadth value");
     float b=S.nextFloat();
     System.out.println("Enter the height value");
     float h=S.nextFloat();
     double area=(b*h)/2;
     System.out.println("The area of triangle is " + area);
     S.close();
	}

}

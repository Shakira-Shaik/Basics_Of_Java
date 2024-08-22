package automationbatch44;

import java.util.Scanner;

public class Circle {

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	   final double Pi= 3.14;
       Scanner S=new Scanner(System.in); 
       System.out.println("enter the value of r");
		    int r=S.nextInt();
		    double area = Pi*r*r;
		    System.out.println("The area of circle is " +  area); 
		    S.close();
	} 
        
	} 



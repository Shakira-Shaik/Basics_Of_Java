package automationbatch44;

import java.util.Scanner;

public class Arthemetic_Operators {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	    Scanner S = new Scanner(System.in);
		System.out.println("enter the value of a"); 
		    int a = S.nextInt();
		    System.out.println("enter the value of b"); 
		     int b = S.nextInt();
		    int sum= a+b;
		   System.out.println("The sum of two numbers is"+ sum);
		   int sub=a-b;
		   System.out.println("The subtraction of two numbers is"+ sub);
		   int mul=a*b;
		   System.out.println("The multiplication of two numbers is"+ mul);
		   int div=a/b;
		   System.out.println("The Division of two numbers is"+ div);
		   int mod=a%b;
		   System.out.println("The modulus of two numbers is"+ mod);
		   S.close();
	}
	}
	 



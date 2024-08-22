package automationbatch44;

import java.util.Scanner;

public class Even_Odd 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       Scanner S=new Scanner(System.in);
       System.out.println("Enter the value");
       int num=S.nextInt();
       if(num % 2==0)
       {
    	  System.out.println("This is even number");
       }
       else
       {
    	   System.out.println("This is odd number");
       }
       S.close();
     }
	

}

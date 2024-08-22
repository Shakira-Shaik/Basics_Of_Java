package stringandarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      double ESalary[]= new double[3];
      Scanner S1=new Scanner(System.in);
      System.out.println("Enter the Employee Salaries: ");
      for(int i=0;i<ESalary.length;i++)
      {
    	  ESalary[i]=S1.nextDouble();
      }
     System.out.println("The Array of employee salary is "+Arrays.toString(ESalary));
	  S1.close(); 
	}  

}  

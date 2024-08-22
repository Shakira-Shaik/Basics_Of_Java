package automationbatch44;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Array Size: ");
	    Scanner S1=new Scanner(System.in);
	    try {
	    int Size=S1.nextInt();
	      int num[]=new int[Size];
	 System.out.println("Enter array values");
       
  for(int i=0;i<Size;i++)   
	  { 
	       Scanner S2=new Scanner(System.in);
	    	num[i] = S2.nextInt();
	    } 
	   
	    for(int k=0; k<Size+1; k++)
	    {
	    	System.out.println(num[k]);
	    }
	    }
	    
	    catch(InputMismatchException A1){
	    	System.out.println("Handled InputMismatchException");
	    }
	    
	    catch(ArrayIndexOutOfBoundsException A2){
	    	System.out.println("Handled ArrayIndexOutOfBoundsException");
	    }
	    
		
          
	}

}

package automationbatch44;
import java.util.Scanner;

public class Try_catch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner S1=new Scanner(System.in); 
	     System.out.println("Enter the string value");
	      String Name=S1.next(); 
	  Scanner S2=new Scanner(System.in);
	  System.out.println("Enter the index value");  
	  try {
	    int i=S2.nextInt();
	   System.out.println(Name.charAt(i)); 
	}
	  catch(StringIndexOutOfBoundsException a)
	  {
		System.out.println("Handled string index out of bound exception");
	  }
	  }
}

package Inheritance;

public class This_Calling 
{
	This_Calling (int a)
   {
		
    System.out.println("Parameterized constructor with 1 parameter");
   }
	This_Calling (int a,String n) 
	{
		 this(12);
		 System.out.println("Parameterized constructor with 2 parameters");	
	}
	This_Calling ()
	{     
		 this(10,"shakira");
		 System.out.println("Non parameterized constructor");	
	}
	public static void main(String[] args)
	{
	 new This_Calling();
	}
	
}

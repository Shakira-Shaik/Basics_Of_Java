package automationbatch44;

public class If_else_IfBlock {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       char Gender='M';
       int age =50;
       if (Gender=='F')
       {
    	   System.out.println("Travelling is free");
       }
       else
       {
    	   if(age<=12)
    	   {
    	    System.out.println("Half ticket");
    	   }
    	   else if(age>=12 && age<=59)
    	   {
    		System.out.println("Full ticket");
    	   }
          else 
           {
    	   System.out.println("Senior Citizen");
           }
       }
     
	}
}



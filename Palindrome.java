package stringandarrays;

public class Palindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       String input="KAYAK";
       String output="";
       for(int i=input.length()-1;i>=0;i--)
       {
    	   char c1=input.charAt(i);
    	   output=output+c1;
     }
       System.out.println("The reverse of the string is "+output);
       if(input.equals(output)) 
       {
    	   System.out.println("The given string is palindrome");
       }
	  else
	  {
		   System.out.println("The given string is not a palindrome");
	   }
	}	

}

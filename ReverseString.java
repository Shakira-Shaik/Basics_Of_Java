package stringandarrays;

public class ReverseString 
{
  public static void main(String[] args)
  {
	String input="Shakira";
	String output="";
	for(int i=input.length()-1;i>=0;i--)
	{
		char c1= input.charAt(i);
		output=output+c1;
	}
	System.out.println("The original string is  "+input);
	System.out.println("The reverse of the string is " +output); 
	
  }
}

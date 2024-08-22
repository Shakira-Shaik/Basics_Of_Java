package stringandarrays;

import java.util.Arrays;

public class ArraysE 
{
	public static void main(String[] args)
	{
		String Name[]=new String[3];
		String Name1[]=new String[3];
		Name[0]="Uma";
	    Name[1]="Shakira";
	    Name[2]="Siri";
		Name1[0]="Uma";
		Name1[1]="Shakira";
		Name1[2]="Siri";
	 boolean B= Arrays.equals(Name,Name1);   
	 System.out.println(B);  
	}
}

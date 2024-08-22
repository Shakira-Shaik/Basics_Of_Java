package stringandarrays;

import java.util.Arrays;

public class Array_GivenNumber 
{
public static void main(String[] args)
{
	int rollno[]=new int[4];
	rollno[0]=100;
    rollno[1]=200;
    rollno[2]=300;
    rollno[3]=400;
    int Given_Number=300; 
    System.out.println("The array is: " +Arrays.toString(rollno));
    for(int i=0;i<rollno.length;i++) 
    {
       if(Given_Number==rollno[i])
        {
    		System.out.println("The Given number is a part of array at the index position  "+i);
    	}
    	else
    	{
    		System.out.println("Sorry Not found");
    	}
       }
    }
}

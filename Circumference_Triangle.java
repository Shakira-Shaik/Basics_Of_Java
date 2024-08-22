package automationbatch44;

import java.util.Scanner;

public class Circumference_Triangle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Scanner S=new Scanner(System.in);
     System.out.println("Enter the value of a");
     int a=S.nextInt();
     System.out.println("Enter the value of b");
     int b=S.nextInt();
     System.out.println("Enter the value of c");
     int c=S.nextInt();
     int Circumference=a+b+c;
  System.out.println("The Circumference of Triangle is " +  Circumference); 
       S.close();
	}

}

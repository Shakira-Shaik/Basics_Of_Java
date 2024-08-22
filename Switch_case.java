package Inheritance;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	  Scanner S = new Scanner(System.in); // taking input at run time
	  System.out.println("Enter 1 for Chrome browser");
	  System.out.println("Enter 2 for Firefox browser");
	  System.out.println("Enter 3 for Edge browser");
	  int browser_selection=S.nextInt(); 
      switch (browser_selection)
      { 
      case 1:System.out.println("Launch chrome browser");
      break;
      case 2:System.out.println("Launch Firefox browser");
      break;
      case 3:System.out.println("Launch Edge browser");
      break;
      default:System.out.println("Sorry Your selection was wrong");
      S.close();
      }
	}

}

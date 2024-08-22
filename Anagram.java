package automationbatch44;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String Name1="listen";
      String Name2="silent";
      char[] c1=Name1.toCharArray(); //[l,i,s,t,e,n]
      char[] c2=Name2.toCharArray(); //[s,i,l,e,n,t]
      Arrays.sort(c1);
      Arrays.sort(c2);
      System.out.println("The array of first string after sorting " + Arrays.toString(c1));  
      System.out.println("The array of second string after sorting " + Arrays.toString(c2));   
      if(Arrays.equals(c1, c2)==true)
      {
    	  System.out.println("Two strings are anagram of each other");
      }
      else 
      {
    	  System.out.println("Two strings are not anagram of each other"); 
	  }
}
}

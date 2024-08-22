package automationbatch44;

import java.util.Arrays;

public class String_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		String S1="Shakira";
		System.out.println(S1.length());
		System.out.println(S1.toLowerCase());
		System.out.println(S1.toUpperCase());
		System.out.println(S1.indexOf('k'));
		System.out.println(S1.trim());
		String S2="Ghouse Mohammad";
		System.out.println(S1.equals(S2));
		System.out.println(S1.concat(" Shaik"));
		String S3="SHAKIA";
		System.out.println(S1.equalsIgnoreCase(S3)); 
		System.out.println(S1.charAt(3)); 
		System.out.println(S1.substring(2));
		System.out.println(S1.substring(1,4));
		char [] c1=S1.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println(S1.matches("S(.*)"));
		System.out.println(S1.matches("...."));
		System.out.println(S1.matches("(.*)a"));
		System.out.println(S1.matches("(.*)k(.*)"));
		System.out.println(S2.replace("Mo", "A"));
		System.out.println(S2.replace(" ", ""));
		System.out.println(S2.replace("Mo", "A"));
		System.out.println(S3.replaceAll("[0-9]", ""));  
		System.out.println(S2.contains("Mohammad")); 
		System.out.println(S2.repeat(2));
		System.out.println(S2.endsWith("d")); 
		System.out.println(S3.isEmpty()); 
	    String[] name=S2.split(" ",2);
		System.out.println(Arrays.toString(name)); 
		String str="hello";
		str.concat("world");
		System.out.println(str);
		System.out.println(S1==S2);
		
	}
				
}

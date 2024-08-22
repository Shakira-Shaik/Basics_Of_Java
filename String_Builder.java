package stringandarrays;

public class String_Builder
{
	public static void main(String[] args)
	{
		StringBuilder S= new StringBuilder("Bradford");
	     S.append(" good place");
	      System.out.println(S); 
	     System.out.println(S.insert(9, " is a "));
	     System.out.println(S.replace(14, 19, " Beautiful"));
	     StringBuilder S1= new StringBuilder("Shakira Shaik");   
	     System.out.println(S1.substring(8));
	     System.out.println(S1.substring(0,7));
	      S1.delete(8, 13);
	     System.out.println(S1);
	     S1.reverse();
		  System.out.println(S1);
		  System.out.println(S.charAt(1));
		  System.out.println(S.length());
		  
	}
}

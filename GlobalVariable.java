package automationbatch44;

public class GlobalVariable 
{
    static double pi=3.14;//initialization
    static boolean a;
    static String s;
    int leap_year=366;//non static
    static int b=25;
    static int c=4;
    static void global()
    {
       System.out.println(a);
       System.out.println(s);
    }
    static void division()
    {
    	System.out.println(b/c);  
    }
    static void mod()
    {
    	System.out.println(b%c); 
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(pi);
		GlobalVariable G=new GlobalVariable();
		System.out.println(G.leap_year);//global variable is non static
        G.leap_year=365; //non static variable updated
        System.out.println(G.leap_year);
        global();
        division(); 
        mod();
	} 
 
}  

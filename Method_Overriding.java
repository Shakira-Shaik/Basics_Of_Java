package Inheritance;
class Addition
{
	void add()
	{
		 int a=10;
		 int b=25;
		 int sum =a+b;
		 System.out.println("The addition of two numbers is " + sum);
	}
}
public class Method_Overriding extends Addition
{
	void add()
	{
		 int a=90;
		 int b=25;
		 int sum =a+b;
		 super.add();   // Super keyword
		 System.out.println("The addition of two numbers is " + sum);
	  }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Method_Overriding M=new  Method_Overriding();
		 M.add();
	}

}
 
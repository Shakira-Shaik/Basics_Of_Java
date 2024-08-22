package Inheritance;
class one
{
 static void add()
 {
	 int a=10;
	 int b=25;
	 int sum =a+b;
	 System.out.println("The addition of two numbers is " + sum);
 }
}
class two extends one{
 static void sub()
	{
	 int a=38; 
	 int b=20;
	 int sub =a-b;
	 System.out.println("The subtraction of two numbers is " + sub);
	}
}
public class Multi_Inheritance extends two{
  static void mul()
   {
	  int a=6;
	  int b=8;
	  int mul=a*b;
	  System.out.println("The multiplication of two numbers is " + mul);
   }
   public static void main(String[] args) {
       add();
	   sub();
	   mul();
   }
}

package Inheritance;
class youtube
{
	youtube(int a) // Parameterized constructor
	{ 
		System.out.println("You tube");
	}
}
class Google extends youtube
{
  Google() // non Parameterized constructor
  {
	super(10); // we can call parameterized constructor explicitly
	           // By super calling statement
	System.out.println("Google");
  }
}
public class Flipcart extends Google
{ 
 Flipcart()
 {  
	 //super(); // we can call non parameterized constructor implicitly or explicitly
	 System.out.println("Flipcart");
 }
 public static void main(String args[])
 {
	 new Flipcart();
 }
 
}

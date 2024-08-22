package automationbatch44;
class Parent{
	static void Add() {
	System.out.println("Addition method");
	}
	static void Sub() {
	System.out.println("Subtraction method");
	}
	 void mul() {
	 System.out.println("multiplication method");
	}
	 void div() {
	 System.out.println("division method");
	}
}
public class Up_DownCasting extends Parent{
	 static void login() {
	    System.out.println("Login method");
		}
		static void logout() {
		System.out.println("Logout method");
		}
		 void Registration(){
		System.out.println("Registration method");
		}
		 void Checkout(){
		System.out.println("checkout method");
		}
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Parent P = new Up_DownCasting();  //Up casting
		     Add();
		     Sub();
		     P.mul();
		     P.div();
		     Up_DownCasting C=(Up_DownCasting)P; //Down casting  
		       C.Checkout();
		       C.Registration();
		       C.div();
		       C.mul();
		       }
}

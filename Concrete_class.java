package automationbatch44;
abstract class Abstraction {   // Abstract class
 abstract void add();
 abstract  void sub();
}
public class Concrete_class extends Abstraction{ // Concrete class
    @Override
	void add() {
		// TODO Auto-generated method stub 
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("The addition is " + c); 
			}
	@Override
	void sub() {
	   // TODO Auto-generated method stub
		int a=40;
		int b=20;
		int c=a-b;
		System.out.println("The Subtraction is " + c);  
	}	
	static void mul(){
	   int a=10;
		int b=20;
		int c=a*b; 
		System.out.println("The Multiplication  is " + c); 
		}
	public static void main(String[]args){
	Concrete_class C1=new Concrete_class();
		  C1.add();
		  C1.sub();
		  mul();
	}
}

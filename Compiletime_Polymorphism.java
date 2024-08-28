package automationbatch44;

public class Compiletime_Polymorphism {
	  void add()
	 {
		 System.out.println("addition method");
	 }
	 void add(int a, int b,int c)
	 {
		 a=10;
		 b=4;
		 c=a+b;
		 System.out.println("The addition is: " + c);
		 } 
	
	 void add(String m)
	 {
		 System.out.println("Compiletime polymorphism");
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compiletime_Polymorphism C1=new Compiletime_Polymorphism(); 
		   C1.add();
		   C1.add("Msg");
	       C1.add(1,1,1);
	}

}

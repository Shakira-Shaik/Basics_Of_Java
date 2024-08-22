package automationbatch44;

public class LocalVariable 
{
 static void local()
 {
	int age;
	age=45;
	age=30; // local variable updated
	String name="Ravi";
	System.out.println(name);
	System.out.println(age);
	  
 }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int age;
		age=50;
		System.out.println(age); 
	    local();
	}
 
}

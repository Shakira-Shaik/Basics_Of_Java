package Inheritance;

public class This_Keyword {

	String name; //non static global variable default value null
	int age;    // 0 for integer
	double salary; // 0.0 for double
	void details(String name,int age,double salary)//("Ram",26,8432.32)
	{
		System.out.println("Employee details");
		this.name=name; //this.global_variable=local_variable; syntax
	    this.age=age;   // this keyword
		this.salary=salary;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      This_Keyword T=new This_Keyword();
      T.details("Ram", 26, 8432.32);
      System.out.println("Emp name is " + T.name);
      System.out.println("Age is " + T.age); 
      System.out.println("Salary is " + T.salary);
	}  
}

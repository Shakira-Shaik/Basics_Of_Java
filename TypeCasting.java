package Inheritance;
class parent
{
	static void name()
	{
		System.out.println("UP Casting");
	}
	static void name1()
	{
		
	}
	void name2()
	{
		
	}
	void name3()
	{
		
	}
}
public class TypeCasting extends parent{
	static void name4()
	{
		
	}
	static void name5()
	{
		
	}
	void name6()
	{ 
		
	}
	void name7()
	{
		System.out.println("Down casting");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parent P = new TypeCasting();  //up casting implicitly
		name();
		name1();
		P.name2();
		P.name3();
		
	TypeCasting T = (TypeCasting)P; //down Casting explicitly
		T.name2();
		T.name3();
		 name4();
		 name5(); 
		T.name6();
		T.name7();
		
	}

}

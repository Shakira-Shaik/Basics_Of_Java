package automationbatch44;
interface Triangle_Area
{
	void Area();           
	void Circumference();
}
public class Abstract_Class implements Triangle_Area
{
@Override
public void Area() {
	// TODO Auto-generated method stub
	 double breadth =12.5;
	 double height=11.5;
	 double Area=(breadth*height)/2;
	 System.out.println("The area of triangle is " + Area); 
}

@Override
public void Circumference() {
	// TODO Auto-generated method stub
	int a=15;
	int b=24;
	int c=12;
	int circumference=a+b+c;
	System.out.println("The Circumference of triangle is  " + circumference); 
}
	public static void main(String[]args)
	{
		Abstract_Class A1=new Abstract_Class();
		A1.Area();
		A1.Circumference();
		
	}



}
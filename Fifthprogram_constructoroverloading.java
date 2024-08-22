package automationbatch44;

public class Fifthprogram_constructoroverloading 
{
	Fifthprogram_constructoroverloading()
	{
		System.out.println("Constructor");
	}
	Fifthprogram_constructoroverloading(int a)
	{
		System.out.println("Constructor with parameter");
	}
    Fifthprogram_constructoroverloading(int a,double b)
    {
    	System.out.println("Constructor with 2 parameters");
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub 
	
       new Fifthprogram_constructoroverloading();
       new Fifthprogram_constructoroverloading(12);
       new Fifthprogram_constructoroverloading(19,2.56);
       
	}

}
 

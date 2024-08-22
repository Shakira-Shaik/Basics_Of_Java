package automationbatch44;

public class FinalVariable
{
    final static double b=3.85;// can not be modified with in the class
    void rectangle()
    {
    	final int a=4;//can not be modified with in the method
    	double area=a*b;
    	System.out.println("Area of rectangle is"+ area);
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
  
     final int h=5; // can not be modified with in this method
     double area=(b*h)/2;
     System.out.println("Area of trianle is"+ area);
    FinalVariable F=new FinalVariable(); //calling non static method 
     F.rectangle();
    	   
	}

}

package automationbatch44;

public class Secondprogram_nonstatic
{
  void addition(int a ,int b)
  {
	   
	  
	  int sum=a+b;
	  System.out.println(sum); 
  }
  void subtraction()
  {
	  int a=40;
	  int b=20;
	  int sub=a-b;
	  System.out.println(sub);
	  
	  } 
  void multiplication()
  {
	  int a=5;
	  int b=8;
	  int mul=a*b;
	  System.out.println(mul);
  }
  
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      Secondprogram_nonstatic N = new Secondprogram_nonstatic();
      System.out.println ("main method");
      N.addition(10,20);
      N.subtraction();
      N.multiplication();
      
	}

}

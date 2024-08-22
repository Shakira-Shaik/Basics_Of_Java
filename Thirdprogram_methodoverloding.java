package automationbatch44;
public class Thirdprogram_methodoverloding {
 static void add()
 {
	 System.out.println("addition method");
 }
 static void add(int a, int b,int c)
 {
	 a=10;
	 b=4;
	 c=a+b;
	 System.out.println(c);
	 } 
 void add(boolean a)
 {
	 System.out.println(a);
 }
 void sub()
 {
	 System.out.println("subtration method");
	  }
 void sub(int a,int b,int c)
 {
	 a=10;
	 b=5;
	 c=a-b;
	 System.out.println(c);
	 }
 static void sub(String m)
 {
	 System.out.println("Method overloading");
	  }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     add();
     add(1,1,1);
     Thirdprogram_methodoverloding P=new Thirdprogram_methodoverloding();
     P.add(true);
     P.sub();
     P.sub(2,2,2);
     sub("shakira");
}
}

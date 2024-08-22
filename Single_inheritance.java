package Inheritance;
class Amazon
{
   static void loginwithmobile()
   {
	   System.out.println("Mobile no");
   }
   void registration()
   {
	   System.out.println("Registration no");
   }
}
public class Single_inheritance extends Amazon
{
	static void loginwithemailid()
	{ 
		System.out.println("Email id");
	}
	void logout()
	{
		System.out.println("Logout");
	}
	public static void main(String[] args)
	{
		loginwithmobile();
		Single_inheritance S=new Single_inheritance();
		 S.registration();
		 loginwithemailid();
		 S.logout();
		 
	}
}

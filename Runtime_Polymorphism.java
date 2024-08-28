package automationbatch44;
class Polymorphism
{
	void login()
	{
		System.out.println("Login with mobile");
	}
}
public class Runtime_Polymorphism extends Polymorphism  {
	void login()
	{
		System.out.println("Login with emailid");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Polymorphism P1=new Polymorphism();
        P1.login(); */
     new Polymorphism().login(); 
	}

}

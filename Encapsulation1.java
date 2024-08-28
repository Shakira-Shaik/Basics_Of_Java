package automationbatch44;
class Program2
{
	 private int Age=35; //sensitive information

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	 }

 public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Program2 P1=new Program2(); 
	      P1.setAge(25);
	     System.out.println("Age is " + P1.getAge());
	}

}

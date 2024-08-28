package automationbatch44;
class Program1
{
   private String user_name	="contact@grotechminds.com "; //sensitive information
   private String password="Abc@1234";
    public String getUsername() 
    { 
    	return user_name; // the returntype of 'return' should be string for string data type
    }
    public void setUsername(String user_name)  //  first set the value and  then get the value 
                                               // setting is always in parameterized manner
    {
    	this.user_name=user_name;//updating the value of local variable to global variable
    }
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) { 
		this.password = password;
	}
    
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Program1 P1=new Program1(); 
      P1.setUsername("emailtoshakira@gmail.com"); 
       System.out.println(P1.getUsername());
      P1.setPassword("SSgtm@1213@");
      System.out.println(P1.getPassword());
	}

}

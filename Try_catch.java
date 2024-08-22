package automationbatch44;
public class Try_catch {
public static void main(String[] args)
{
	int rollno[] =new int [4]; 
	rollno[0]=85;
	rollno[1]=26;
	rollno[2]=35;
	rollno[3]=45;
	try {
	rollno[4]=42;
	}
	catch(ArrayIndexOutOfBoundsException a1)
	{
		System.out.println("Handled Array Index OutOf Bounds Exception");
	}
}
}

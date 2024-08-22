package stringandarrays;

public class Array_Average 
{
public static void main(String args[])
{
    int Nos[]=new int[4];
      Nos[0]=12;
      Nos[1]=20;
      Nos[2]=14;
      Nos[3]=24;
      double Sum=0;
    for(int i=0;i<Nos.length;i++)
    {
    	Sum=Sum+Nos[i];
    }
     double Average= Sum/4;
    System.out.println("The average of an array is: "+ Average); 
}
}
 
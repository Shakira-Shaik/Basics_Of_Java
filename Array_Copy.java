package stringandarrays;

import java.util.Arrays;

public class Array_Copy {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      double Esalary[]=new double[3];
           Esalary[0]=8945.56;
           Esalary[1]=9856.45;
           Esalary[2]=7568.89;
      double Msalary[]=new double[3];
     for(int i=0;i<Esalary.length;i++)
     {
    	  Msalary[i]=Esalary[i];
     }
     System.out.println("The Old array is:  "+ Arrays.toString(Esalary)); 
     System.out.println("The New array after copying:  "+Arrays.toString(Msalary));
	}

}

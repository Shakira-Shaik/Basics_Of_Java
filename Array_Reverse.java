package stringandarrays;

import java.util.Arrays;

public class Array_Reverse {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      int Old_Array[]=new int[3];
        Old_Array[0]=56;
        Old_Array[1]=72;
        Old_Array[2]=64;
      int Reverse_Array[]=new int[3];
      for (int i=0,k=Reverse_Array.length-1;i<Old_Array.length;i++,k--) 
      {
    	  Reverse_Array[k]=Old_Array[i];
      }
      System.out.println("The old array is: "+Arrays.toString(Old_Array));
      System.out.println("The reverse array is: "+ Arrays.toString(Reverse_Array));
	}

}

package automationbatch44;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Hashset_Properties { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet H=new HashSet();
       H.add(45);
       H.add(32);
       H.add(12);
       H.add(15);
      H.add("rose");
       H.add("rose");
       H.add(null);
       H.add(null);
    System.out.println(H); 
   /* HashSet H1=new HashSet();
    H1.add(45);
    H1.add(32);
    H1.add(12);
    H1.add(15); 
    Collections.sort(H1);*/
    Iterator i1=H.iterator();    // iterator
    System.out.println("Iterator");
     while(i1.hasNext()) {
    	System.out.println(i1.next());
     }
  /*   ListIterator L1=H.listIterator(); // forward iteration ListIterator
     System.out.println("Forward Iteration using ListIterator");  
     while(L1.hasNext()) 
     {
    	System.out.println(L1.next());  
     }
     System.out.println("Backward Iteration using ListIterator");  
     while (L1.hasPrevious())  {         // backward iteration ListIterator
      System.out.println(L1.previous());  */
    	  }
  
	}



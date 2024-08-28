package automationbatch44;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList a1=new ArrayList();
     a1.add("book");
     a1.add("school");
     a1.add("pencil");
     a1.add(12);
     a1.add(10);
	a1.add(8);
	a1.add(9);
	a1.add(15);
	a1.add("book");
	a1.add(null);
	a1.add(null);
	System.out.println(a1); 
	 ArrayList a2=new ArrayList();
	 a2.add(12);
     a2.add(10);
	a2.add(8);
	a2.add(9);
	a2.add(15);
	Collections.sort(a2); 
	System.out.println(a2);
	Iterator i1=a1.iterator();    // iterator
    System.out.println("Iterator");
     while(i1.hasNext()) {
    	System.out.println(i1.next());
     }
      ListIterator L1=a1.listIterator(); // forward iteration ListIterator
     System.out.println("Forward Iteration using ListIterator");  
     while(L1.hasNext()) 
     {
    	System.out.println(L1.next());  
     }
     System.out.println("Backward Iteration using ListIterator");  
     while (L1.hasPrevious())  {         // backward iteration ListIterator
      System.out.println(L1.previous());  
    	  }
	}
}

package automationbatch44;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vector V=new Vector();
         V.add(12);
         V.add(6);
         V.add(18);
         V.add(36);
         V.add(22);
      V.add("Shakira");
      //  V.add(null);
     //  V.add(null);
       // V.add("Shakira");
       // Collections.sort(V); 
         System.out.println(V);
         Iterator i1=V.iterator();    // iterator
        System.out.println("Iterator");
         while(i1.hasNext())
         {
        	System.out.println(i1.next());
         }
         
         ListIterator L1=V.listIterator(); // forward iteration ListIterator
         System.out.println("Forward Iteration using ListIterator");  
         while(L1.hasNext()) 
         {
        	System.out.println(L1.next());  
         }
         System.out.println("Backward Iteration using ListIterator");  
         while (L1.hasPrevious())           // backward iteration ListIterator
         {
        	 System.out.println(L1.previous());  
        	 
         }
         Enumeration E = V.elements();
         System.out.println("Enumeration");  
         while(E.hasMoreElements())
         {
        	 System.out.println(E.nextElement());
         }
	}

}

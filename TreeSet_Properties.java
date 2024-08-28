package automationbatch44;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSet_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> T=new TreeSet<Integer>(); 
           T.add(10);
           T.add(8);
           T.add(2);
           T.add(1);
           T.add(25); 
           T.add(25); 
          // Collections.sort(T); 
    	System.out.println(T);
    	Iterator i1=T.iterator();    // iterator
        System.out.println("Iterator");
         while(i1.hasNext()) {
        	System.out.println(i1.next());
         }
      /*  ListIterator L1=T.listIterator(); // forward iteration ListIterator
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



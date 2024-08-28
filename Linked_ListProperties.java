package automationbatch44;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_ListProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LinkedList L1=new LinkedList();
            L1.add(19); 
           L1.add(10);
            L1.add(30);
           L1.add("Shakira");
           L1.add(null);
            L1.add(null);
            L1.add("Shakira");
            L1.add("Rose");
            System.out.println(L1); 
            LinkedList L2=new LinkedList();
            L2.add(19);
            L2.add(36);
            L2.add(25); 
            L2.add(10);
            L2.add(30);
           Collections.sort(L2); 
           System.out.println(L2);  
        Iterator i1=L1.iterator();    // iterator 
        System.out.println("Iterator");
         while(i1.hasNext()) {
        	System.out.println(i1.next());
         } 
          ListIterator T=L1.listIterator(); // forward iteration ListIterator
         System.out.println("Forward Iteration using ListIterator");  
         while(T.hasNext()) 
         {
        	System.out.println(T.next());  
         }
         System.out.println("Backward Iteration using ListIterator");  
         while (T.hasPrevious())  {         // backward iteration ListIterator
          System.out.println(T.previous());  
        	  }   
	}

}

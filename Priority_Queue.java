package automationbatch44;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PriorityQueue<Integer> P=new PriorityQueue<Integer>();
     P.add(85);
     P.add(45);
     P.add(36);
     P.add(24);
     P.add(26);
     P.add(10);
     P.add(55);
     P.add(10);
     P.add(55);
   // Collections.sort(P);
    System.out.println(P);
    Iterator i1=P.iterator();    // iterator
    System.out.println("Iterator");
     while(i1.hasNext()) {
    	System.out.println(i1.next());
     }
   /*   ListIterator L1=P.listIterator(); // forward iteration ListIterator
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

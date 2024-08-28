package automationbatch44;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Stack_Properties {

public static void main(String[] args) {
	Stack S=new Stack();
	S.add(56);
	S.add(12);
	S.add(26);
	S.add("bag");
	S.add(44);
    S.add("bag");
	S.add(null);
    S.add(null);
	Stack S1=new Stack();
	S1.add(52);
	S1.add(10);
	S1.add(15);
	S1.add(60);
	Collections.sort(S1); 
 System.out.println(S);	
 System.out.println(S1);
 Iterator i1=S.iterator();    // iterator
 System.out.println("Iterator");
  while(i1.hasNext()) {
 	System.out.println(i1.next());
  }
   ListIterator L1=S.listIterator(); // forward iteration ListIterator
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

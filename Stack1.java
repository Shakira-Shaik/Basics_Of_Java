package automationbatch44;

import java.util.Collections;
import java.util.Stack;

public class Stack1 {

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
	
	//Collections.sort(S); 
 System.out.println(S);	
}
}
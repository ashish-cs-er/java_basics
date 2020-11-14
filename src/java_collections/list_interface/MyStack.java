package java_collections.list_interface;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Stack is used to create LIFO system. It is a linear data structure");
		System.out.println("Stack has two main operations: push and pop");
		System.out.println("Push: inserts an element into stack");
		System.out.println("Pop: gets first element from the stack");
		System.out.println("Stack is also synchronized");
		
		System.out.println("Lets start creating Stack");
		//lets start creating stack
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println("Stack is: "+s);
		System.out.println("Fetching the element of stack: "+s.pop());
	}

}
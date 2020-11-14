package java_collections.dequeue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyArrayDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("It implements both Queue and Dequeue interface");
		System.out.println("Its resizeable from both sides");
		System.out.println("Also known as Array Double Ended Queue and ArrayDeck");
		System.out.println("It can be used as a Stack and as a Queue");
		System.out.println("It is also thread safe");
		
		//lets see this in action
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		dq.offerFirst(12);
		dq.offer(10);
		dq.offerLast(20);
		System.out.println("The deque is: "+dq);
	}

}

package java_collections.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class MyLinkedListQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In a Linked Queue, each node consists of two parts: data part and the link part");
		System.out.println("Each element points to next element");
		System.out.println("It allows null elements");
		System.out.println("It is not thread safe and so can not be used for concurrent operations");
		
		System.out.println("Lets see this in action");
		
		Queue<String> q1 = new LinkedList<String>();
		q1.offer("A");
		q1.offer("B");
		q1.offer("N");
		q1.offer("L");
		
		System.out.println("The queue is: "+q1);
		System.out.println("using peek : "+q1.peek());
		System.out.println("Using Poll: "+q1.poll());
		System.out.println("Queue after poll is: "+q1);
	}

}

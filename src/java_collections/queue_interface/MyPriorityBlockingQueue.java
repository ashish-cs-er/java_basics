package java_collections.queue_interface;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class MyPriorityBlockingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("It implements AbstractQueue, BlockingQueue");
		System.out.println("This is thread safe");
		System.out.println("Because it is thread safe it may sometimes give errors like Out Of Memory exception");
		
		Queue<String> q1 = new PriorityBlockingQueue<String>();
		q1.offer("I");
		q1.offer("Am");
		q1.offer("Testing");
		System.out.println("Queue is: "+q1);
	}
}

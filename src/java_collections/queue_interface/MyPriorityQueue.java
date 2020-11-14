package java_collections.queue_interface;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PriorityQueue class implements Queue interface");
		System.out.println("Provides us a way to process the objects based on priority");
		System.out.println("This implementation is not thread safe");
		System.out.println("Does not Allow to store null values");
		System.out.println("It provides O(log(n)) time for add and poll methods");
		System.out.println("It inherits methods from AbstractQueue, AbstractCollection, Collection and Object class");
		System.out.println("We can’t create PriorityQueue of Objects that are non-comparable");
		System.out.println("PriorityQueue are unbound queues");
		System.out.println("No order is guaranteed. Only when dequeue operation is performed, the priority is decided.");
		
		System.out.println("Lets check the priority queue in action");
		
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		pq1.offer("Well");
		pq1.offer("Is");
		pq1.offer("All");
		pq1.offer("Very");
		System.out.println("Printing initial priority queue: "+pq1);
		System.out.println("Checking peek method: "+pq1.peek());
		
		//checking integer priorityqueue
		Queue<Integer> q1 = new PriorityQueue<Integer>();
		q1.offer(50);
		q1.offer(20);
		q1.offer(10);
		q1.offer(40);
		q1.offer(30);
		System.out.println("Integer PriorityQueue is: "+q1);
		System.out.println(q1.peek());
		Iterator<Integer> itr = q1.iterator();
		while(itr.hasNext()) {
			System.out.println("List Elements: "+itr.next());
		}
		
		System.out.println("Removing the element from the front: "+q1.poll());
		System.out.println("Priority Queue after removal: "+q1);
	}

}

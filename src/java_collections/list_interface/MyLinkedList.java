package java_collections.list_interface;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Linked List: implements the List interface");
		System.out.println("Faster manipulation because no shifting has to occur");
		System.out.println("Can be used as List Queue Stack");
		
		//declaring the linked list
		LinkedList<String> ll = new LinkedList<String>();
		
		//adding elements to linked list
		ll.add("Second");
		ll.add("Third");
		ll.add("First");
		
		//printing the linked list
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//using addAll method to add previous declared linked list to current one
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.addAll(ll);
		for(String msg: ll1) {
			System.out.println(msg);
		}
		
		//Sorting the Linked List
		
		
		//Removing the element from the LinkedList
		System.out.println("Removing the element from the LinkedList");
		//removing with value
		ll1.remove("Third");
		System.out.println("After removing: "+ll1);
		ll1.add("Third");
		System.out.println("List printed again: "+ll1);
		//removing with index
		ll1.remove(0);
		System.out.println("After removing with index: "+ll1);
		ll1.add("Second");
		System.out.println("after addition: "+ll1);
		//other functions are removeFirst, removeLast, peek, pop, 
	}

}

package java_collections.set_interface;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class MyLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LinkedHashSet is a combination of Hashtable and LinkedList");
		System.out.println("It is non synchronized and maintains insertion order");
		
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>(Arrays.asList(new Integer[]{1,3,7,3,5,6}));
		System.out.println("THe LinkedHashSet is: "+lhs1);
	}

}

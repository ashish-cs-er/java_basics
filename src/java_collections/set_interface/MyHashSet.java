package java_collections.set_interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Set is a type of collection that does not allow duplicate elements");
		System.out.println("Elements are not stored in order");
		System.out.println("HashSet extends AbstractSet and is most widely used Set implementation");
		System.out.println("HashSet is not synchronized");
		System.out.println("Lets see HashSet in detail");
		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs1.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
		hs2.addAll(Arrays.asList(new Integer[] {1,3,5,7,9}));
		
		//checking Union
		Set<Integer> union = new HashSet<Integer>(hs1);
		union.addAll(hs2);
		System.out.println("Union of Two sets is: "+union);
		
		//finding intersection
		Set<Integer> intersect = new HashSet<Integer>(hs1);
		intersect.retainAll(hs2);
		System.out.println("Intersection of two sets is: "+intersect);
	}

}

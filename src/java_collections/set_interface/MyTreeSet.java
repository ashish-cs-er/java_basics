package java_collections.set_interface;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is about TreeSet implementation");
		System.out.println("Contains unique elements");
		System.out.println("Does not allow null values");
		System.out.println("Maintains ascending order");
		System.out.println("Tree set is non synchronized");
		System.out.println("The TreeSet class extends AbstractSet and implements NavigableSet interface which further implements SortedSet, Collection, Set, Iterable interface");
		System.out.println("In this set we can get the first and last element");
		
		Set<Integer> s1 = new TreeSet<Integer>(Arrays.asList(new Integer [] {2,5,6,7,8,1}));
		System.out.println("Set after creation gets automatically sorted in asc order. "+s1);
	}
	
}

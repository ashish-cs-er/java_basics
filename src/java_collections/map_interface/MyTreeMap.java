package java_collections.map_interface;

import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("It is a Sorted Map according to natural ordering of keys");
		System.out.println("TreeMap is not synchronized");
		System.out.println("Contains unique values");
		
		Map<Integer, String> m = new TreeMap<Integer, String>();
		m.put(1, "Testing1");
		m.put(2, "Testing2");
		m.put(3, "Testing3");
		
		System.out.println("Map is: "+m);
	}
}
package java_collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A HashMap stores objects in key-value pairs and does not maintain any order");
		System.out.println("Allows to store null elements as well");
		System.out.println("Does not allow duplicate keys but allows duplicate values");
		System.out.println("Uses a technique Hashing. HashSet also uses HashMap in background");
		System.out.println("It is non synchronized.");
		
		//lets see this in action
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("Test1", 25);
		m.put("Test2", 30);
		m.put("Test3", 35);
		m.put("Test4", 32);
		
		//traversing through a HashSet
		for (Map.Entry<String, Integer> e : m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue()); 
    	} 
	}

}

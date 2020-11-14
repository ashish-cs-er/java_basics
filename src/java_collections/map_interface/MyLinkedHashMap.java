package java_collections.map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is similar to HashMap but maintains insertion order");
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		m.put("Test1", 10);
		m.put("Test2", 20);
		m.put("Test3", 30);
		m.put("Test4", 40);
		System.out.println("Map with insertion order is: "+m);
		
		for(Map.Entry<String, Integer> e: m.entrySet()){
			System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
		}
	}

}

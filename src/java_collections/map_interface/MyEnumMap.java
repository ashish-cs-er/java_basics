package java_collections.map_interface;

import java.util.EnumMap;
import java.util.Map;

public class MyEnumMap {

	public enum Games{HOCKEY,CRICKET,FOOTBALL,TENNIS,KHOKHO}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Special map for enum types");
		System.out.println("Does not allow null keys");
		System.out.println("This is non synchronized map");
		System.out.println("Lets see this in action");
		
		Map<Games, String> m = new EnumMap<Games, String>(Games.class);
		m.put(Games.CRICKET, "Gentlemen Game");
		m.put(Games.FOOTBALL, "Aggressive Game");
		
		for(Map.Entry<Games, String> e : m.entrySet()) {
			System.out.println(e.getKey()+": "+e.getValue());
		}
	}

}

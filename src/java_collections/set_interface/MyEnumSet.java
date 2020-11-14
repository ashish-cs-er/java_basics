package java_collections.set_interface;

import java.util.EnumSet;

public class MyEnumSet {

	enum Game { CRICKET, HOCKEY, TENNIS , FOOTBALL, KABADDI }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EnumSet is a special type of Set designed to work with Enums");
		System.out.println("EnumSet is not synchronized");
		System.out.println("High Performance Set Implementation");
		System.out.println("Extends AbstractSet and implements Set interface");
		System.out.println("Does not allow null values");
		
		EnumSet<Game> es1 = EnumSet.allOf(Game.class);
		System.out.println("EnumSet is: "+es1);
	}

}

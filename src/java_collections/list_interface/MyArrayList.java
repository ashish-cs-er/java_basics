package java_collections.list_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


class Person{
	String name;
	String address;
	String profession;
	int age;
	
	Person(String name, int age, String address, String pro){
		this.name = name;
		this.age = age;
		this.address = address;
		this.profession = pro;
	}
}

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("It is a dynamic array. Maintains insertion order internally.");
		System.out.println("Can have duplicate values. It is non synchronized");
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("All");
		al.add("The");
		al.add("Very");
		al.add("Best");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String msg:al) {
			System.out.println(msg);
		}
		
		System.out.println("Accessing element of arraylist using get method");
		System.out.println(al.get(1));
		System.out.println("Using set to update value at a specific index");
		al.set(1, "The The");
		for(String msg:al) {
			System.out.println(msg);
		}
		
		
		//sorting in asc and desc order using sort and reverse
		System.out.println("Using the sort method to sort array list");
		ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(5,8,3,10));
		Collections.sort(al1);
		for(int a:al1) {
			System.out.println(a);
		}
		
		System.out.println("Sorting in reverse order using collections.reverse");
		//Collections.reverse(al1);
		Collections.sort(al1, Collections.reverseOrder());
		for(int a:al1) {
			System.out.println(a);
		}
		System.out.println("Creating arraylist of objects");
		Person p1 = new Person("First Test", 30, "Chandigarh", "Tester");
		Person p2 = new Person("Second Test", 40, "Punjab", "Developer");
		Person p3 = new Person("Third Test", 50, "Haryana", "Designer");
		
		ArrayList<Person> al2 = new ArrayList<Person>();
		al2.add(p1);
		al2.add(p2);
		al2.add(p3);
		
		for(Person p:al2) {
			System.out.println("Name: "+p.name+" Age: "+p.age+" Address: "+p.address+" Profession: "+p.profession);
		}
	}

}

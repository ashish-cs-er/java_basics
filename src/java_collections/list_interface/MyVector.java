package java_collections.list_interface;

import java.util.Vector;

public class MyVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("It is a type of collection that can either grow or shrink in its size");
		System.out.println("THere is no capping on size of Vector");
		System.out.println("It is often advised to use Vector in thread-safe environment");
		System.out.println("Java Vectors are synchronized. The iterators returned by the Vectors are fail fast.");
		System.out.println("In case of concurrent modification, it gives ConcurrentModificationException");
		
		//creating a vector
		System.out.println("Lets c the Vector in action");
		
		Vector<String> v = new Vector<String>();
		
		//using add method provided by the List interface
		v.add("Trying");
		v.add("Out");
		v.add("Vector");
		System.out.println("printing the freshly created Vector: "+v);
		v.addElement("This");
		v.addElement("is");
		v.addElement("New");
		v.addElement("Vector");
		System.out.println("Printing the Vector elements added with addElement method: "+v);
		//checking the size of vector
		System.out.println("Vector size: "+v.size());
		//checking size with capacity method
		System.out.println("Capacity of Vector: "+v.capacity());
		
		//checking if a vector contains a specific element
		if(v.contains("is")) {
			System.out.println("Vector contains element");
		}
		else {
			System.out.println("Vector does not contain the element");
		}
	}

}

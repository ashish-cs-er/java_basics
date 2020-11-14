package java_collections;

public class CollectionsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Collection represents a group of objects forming a single unit");
		System.out.println("The Collections framework contains interfaces, their implementation in classes, algorithms for performing various operations on objects");
		System.out.println("The Collection Interface is the root of the collections framework.");
		System.out.println("The Collection Framework includes the collection interface, Map interface and Iterator Interface");
		System.out.println("The collection interface further has sub-interfaces like List, Set, Queue, Dequeue");
		System.out.println("The sub-interfaces are further implemented in classes like ArrayList, LinkedList, Vector, HashSet, Treeset, LinkedHashSet, SortedSet, PriorityQueue, Stack");
		
		System.out.println("1. The List Interface");
		System.out.println("The list interface is sub-interface of collections interface");
		System.out.println("It extends the AbstractList class and implements the Collections and Iterator interface");
		System.out.println("The list interface is further implemented by 1. ArrayList, 2. LinkedList, 3. Vector, 4. Stack classes");
		System.out.println("The list represents an ordered sequence of objects");
		System.out.println("Elements inside a list can be added, updated, accessed and removed as required");
		System.out.println("The list can be non generic which makes it possible to use any data type or generic which makes it usable for a particular data type only");
		
		
		System.out.println("2. The Set Interface");
		System.out.println("Is is a sub-interface of Collections interface");
		System.out.println("The Set represents a collection of unique objects");
		System.out.println("The Set interface does not guarantee any order of the items added");
		System.out.println("The set interface is further implemented by EnumSet, HashSet, LinkedHashSet, TreeSet");
	
		System.out.println("3. The Queue Interface");
		System.out.println("Queue is basically FIFO system");
		System.out.println("The various implementations of Queue are  1. PriorityQueue 2. LinkedList 3. PriorityBlockingQueue 4. ArrayDequeue");
		
		System.out.println("4. The Dequeue Interface");
		System.out.println("It stands for double ended queue");
		System.out.println("It extends the Java Queue interface and can be used both as a Queue and a Stack");
		System.out.println("The interface is further implemented by classes: 1. LinkedList 2. ArrayDequeue");
		
		System.out.println("This was all about the basic sub-interfaces of collections interface");
		
		System.out.println("1. Map Interface");
		System.out.println("It is not direct descendant of Collections interface and so behaves differently");
		System.out.println("Stores the objects using key value pairs");
		System.out.println("Various impl of Map interfaces are: 1. HashMap 2. Hashtable 3. EnumMap 4. IdentityHashMap 5. LinkedHashMap 6. Properties 7. TreeMap 8. WeakHashMap");
	}

}

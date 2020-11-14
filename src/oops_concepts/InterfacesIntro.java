package oops_concepts;

interface Shape{
	public void area();
}
class Circle implements Shape{
	private int r;
	
	Circle(int radius){
		r = radius;
	}
	
	public void area(){
		System.out.println("Area of Circle is: "+(3.14*r*r));
	}
}

public class InterfacesIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("These were designed to attain total abstraction");
		System.out.println("Data variables in interface are public final static by default");
		System.out.println("Interfaces define what needs to be done but not how. The implementation should be there in the class extending the interface");
		System.out.println("All methods inside interface must be empty");
		System.out.println("The class implementing the interface must provide body for every method of interface and if it does not do so, the class must be declared as abstract");
		System.out.println("An interface with no methods is called TAGGING interface");
		System.out.println("An interface cannot have a constructor and it cannot be instantiated. We cannot create object for an interface");
		System.out.println("Since java 8 and 9 we can have default, static and private methods in interfaces");
		System.out.println("Static methods inside interfaces cannot be redefined or overriden in child class");
		Shape s = new Circle(10);
		s.area();
	}
}
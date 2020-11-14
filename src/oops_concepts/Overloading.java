package oops_concepts;

class MyClass1{
	void display(int a) {
		System.out.println("Value of Integer a is: "+a);
	}
	
	void display(float b) {
		System.out.println("Value of float b is: "+b);
	}
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass1 obj = new MyClass1();
		obj.display(10);
		obj.display(10.2f);
	}

}

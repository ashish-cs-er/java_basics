package oops_concepts;
class MyClass2{
	void disp() {
		System.out.println("This is parent class");
	}
}

class MyClass3 extends MyClass2{
	void disp() {
		System.out.println("This is child class");
	}
}
public class Overriding  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static methods cannot be overridden");
		System.out.println("Static belongs to Class Area whereas instance belongs to heap area");
		MyClass3 obj = new MyClass3();
		obj.disp();
	}

}

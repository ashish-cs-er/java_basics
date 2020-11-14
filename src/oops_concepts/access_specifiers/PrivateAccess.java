package oops_concepts.access_specifiers;

class CheckAccess {
	private int a;

	CheckAccess() {
		this.a = 1;
	}

	public void printVar() {
		System.out.println("Value of private var is: " + this.a);
	}
}

public class PrivateAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckAccess obj = new CheckAccess();
		// object has been created.
		System.out.println(
				"If i try to access the private var a it will give error that the field is not visible because it is private");
		// System.out.println("Value of private var a is: "+obj.a);
		System.out.println("Printing the value of private var through public function");
		obj.printVar();
	}

}

package oops_concepts.access_modifiers1;
import oops_concepts.access_specifiers.AccessModifiersTypes;

public class PublicAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiersTypes obj2 = new AccessModifiersTypes();
		obj2.m=50;
		obj2.n = 60;
		System.out.println("The public variables are visible outside the package without inheritance throughout the code");
		System.out.println("Value of public vars m and n is: "+obj2.m+" "+obj2.n);
	}

}

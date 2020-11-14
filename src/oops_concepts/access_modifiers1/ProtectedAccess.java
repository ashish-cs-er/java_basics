package oops_concepts.access_modifiers1;
import oops_concepts.access_specifiers.AccessModifiersTypes;

public class ProtectedAccess extends AccessModifiersTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedAccess obj = new ProtectedAccess();
		obj.k=30;
		obj.l = 40;
		System.out.println("value of protected var k and l is: "+obj.k+" "+obj.l);
	}

}

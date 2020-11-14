package oops_concepts.access_specifiers;

public class AccessModifiersTypes {

	// with no access specifiers, default is chosen which has visibility inside
	// class and package
	int i, j;

	protected int k, l;

	public int m, n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("There are four types of access specifiers:");
		System.out.println("Private: Available directly inside class only.");
		System.out.println(
				"Default: when no access specifier is present, it is assumed as default access specifier. Available directly under class and package");
		System.out.println("Protected: Available inside class, package and outside package through inheritance");
		System.out
				.println("Public: Available directly throughout the code irrespective of class, package, inheritance");
	}
}
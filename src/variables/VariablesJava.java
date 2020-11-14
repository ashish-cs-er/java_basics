package variables;

public class VariablesJava {
	
	String myVar = "Original Instance Variable";
	static String myStaticVar = "Static Variable";
	
	public void myMethod(){
		String myVar = "Local Variable";
		System.out.println(myVar);
	}
	
	public static void main(String[] args) {
		System.out.println("There are three types of variables in java.\n"
				+ "1. Local Var. 2. Instance Variable 3. Class Variable");
		
		System.out.println("Lets check local variable first. We have same var named myVar as instance var "
				+ "and local var. Lets call the method and see what gets printed.");
		VariablesJava vj1 = new VariablesJava();
		vj1.myMethod();
		VariablesJava vj2 = new VariablesJava();
		System.out.println(vj1.myVar);
		vj2.myVar = "Changed Instance Variable";
		System.out.println(vj2.myVar);
		System.out.println("We can see that the myVar is holding different values for"
				+ "vj1 instance and vj2 instance");
		
		System.out.println("Now we check the static variable which share the same copy"
				+ "and value across different instances");
		vj2.myStaticVar = "Changed Static Variable";
		System.out.println(vj1.myStaticVar);
		System.out.println(vj2.myStaticVar);
	}
}

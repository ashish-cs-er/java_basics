package oops_concepts.inheritance;

interface A1{
	void logA1();
}

interface B1{
	void logB1();
}

public class MultipleInheritance implements A1, B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance mobj = new MultipleInheritance();
		mobj.logA1();
		mobj.logB1();
	}

	public void logA1(){
		System.out.println("Hello there from logA1 impl");
	}
	public void logB1(){
		System.out.println("Hello there from logB1 impl");
	}
}
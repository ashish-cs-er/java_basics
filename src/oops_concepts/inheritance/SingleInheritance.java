package oops_concepts.inheritance;

class A{
	int i,j;
	
	A(){
		System.out.println("Base Class Const Called");
	}
	
	public void showij(){
		System.out.println("I and J are: "+i+" "+j);
	}
}

class B extends A{
	int k;
	
	B(){
		System.out.println("Child class const called");
	}
	
	public void showk(){
		System.out.println("K is: "+k);
	}
	
	public void sum(){
		System.out.println("The sum in child class is: "+(i+j+k));
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("It represents IS-A relationship");
		System.out.println("The const of parent class is automatically called when object of child class is created");
		A superOb = new A();
		B subOb  = new B();
		superOb.i=10;
		superOb.j=20;
		System.out.println("I and J from Super Class are: ");
		superOb.showij();
		subOb.i = 1;
		subOb.j = 2;
		subOb.k = 3;
		System.out.println("I j and K in sub class are: ");
		subOb.showij();
		subOb.showk();
		subOb.sum();
	}

}

package oops_concepts;

public class ConstructorIntro {
	
	//instance variables
	int a,b,c;
	//simple constructor
	public ConstructorIntro(){
		//if no values are provided, default values are used
		System.out.println("Default Contructor Called");
		this.a=10;
		this.b=20;
		this.c=30;
	}
	//parametrized const
	public ConstructorIntro(int a, int b, int c){
		System.out.println("Parameterized Constructor Called");
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void display(){
		System.out.println("a b and c are: "+this.a+": "+this.b+": "+this.c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Contructor is similar to method but its not a method");
		System.out.println("It is used to initialize the instance variables when object are created using the new mehtod");
		System.out.println("A constructor in Java can not be abstract, final, static and Synchronized");
		System.out.println("Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor");
		System.out.println("Lets see the implementation");
		ConstructorIntro ob1 = new ConstructorIntro();
		ob1.display();
		ConstructorIntro ob2 = new ConstructorIntro(40,50,60);
		ob2.display();
	}

}

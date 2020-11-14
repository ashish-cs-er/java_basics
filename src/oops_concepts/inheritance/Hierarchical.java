package oops_concepts.inheritance;

class Animal1{
	public void display(){
		System.out.println("this is main animal class");
	}
}
class Reptile extends Animal1{
	public void display(){
		System.out.println("Reptiles are animals that lays eggs");
	}
}
class Mammals extends Animal1{
	public void display(){
		System.out.println("Mammals are animals that give birth");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hierarchical Inheritance. One parent class extended by more than one child class");
		System.out.println("Animal parent class is extended by Reptile and Mammal Child class");
		Reptile r1 = new Reptile();
		r1.display();//this will call the child class display
		Mammals m1 = new Mammals();
		m1.display();//this will call the child class display
	}

}

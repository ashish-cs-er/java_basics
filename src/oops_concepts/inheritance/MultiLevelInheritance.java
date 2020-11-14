package oops_concepts.inheritance;

class Animal{
	public void hunt(){
		System.out.println("Animals hunting for food");
	}
}
class Mammal extends Animal{
	public void feed(){
		System.out.println("Parents feed their new born babies");
	}
}
class Dog extends Mammal{
	public void bark(){
		System.out.println("Dogs bark");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is an example of multilevel inheritance");
		System.out.println("The traits of Animal and Mammal will be available in Dog class");
		System.out.println("Lets c that in action");
		
		Dog d1 = new Dog();
		d1.hunt();
		d1.feed();
		d1.bark();
	}
}

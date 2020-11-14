package oops_concepts;

public class ClassIntro {
	//instance variables
	int height;
	int width;
	int length;
	
	//methods
	public void calVol(){
		System.out.println("Volume is: "+this.length*this.width*this.height);
	}
	
	public static void main(String[] args) {
		System.out.println("A class is instantiated using keyword class");
		System.out.println("A class contains objects which is combination of data and behaviour");
		System.out.println("instance variables are called data and class methods are called behaviour");
		ClassIntro ob1 = new ClassIntro();
		ob1.height = 10;
		ob1.width = 20;
		ob1.length = 30;
		ob1.calVol();
	}
}

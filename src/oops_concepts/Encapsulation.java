package oops_concepts;

class EncapsulationDemo{
	//instance variables
	private int var1;
	private int var2;
	
	//class methods
	public void setVar1(int a){
		var1 = a;
	}
	public void setVar2(int b){
		var2 = b;
	}
	
	public int getVar1(){
		return this.var1;
	}
	
	public int getVar2(){
		return this.var2;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Encapsulation is creating a shield around the data using access specifiers and not allowing the data to be accessed outside this shield");
		EncapsulationDemo ed1 = new EncapsulationDemo();
		ed1.setVar1(10);
		ed1.setVar2(20);
		System.out.println("Accessing value of var1: "+ed1.getVar1());
		//ed1.var1;
		System.out.println("If we access the var1 or var2 directly as instance variables, error will be thrown that the variables are not visible");
	}

}

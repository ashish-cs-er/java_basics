package control_statements;

public class IfStatement {

	public static void main(String[] args) {
		// simple if
		int i = 30;
		if(i==30){
			System.out.println("Yes i was 30");
		}
		
		//nested if
		if(i>20){
			if(i>25){
				System.out.println("I is greater than 25");
			}
		}
		
		//if-else block
		if(i>25){
			System.out.println("i greater than 25");
		}
		else{
			System.out.println("i less than 25");
		}
		
		//if-else if-else block
		if(i>=20 && i<25){
			System.out.println("i greater than 20 and 25");
		}
		else if(i>=25 && i>=30){
			System.out.println("i between 25 and 30");
		}
		else{
			System.out.println("i was greater than 30");
		}
	}

}

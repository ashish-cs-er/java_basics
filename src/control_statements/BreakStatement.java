package control_statements;

public class BreakStatement {
	public static void main(String[] args) {
		System.out.println("Break is used to terminate the for loop");
		//suppose we want to terminate the loop when i==4
		
		for (int i=0;i<10; i++){
			if(i==4){
				break;
			}
			System.out.println(i);
		}
	}
}

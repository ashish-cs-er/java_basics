package control_statements;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for initialization;condition;increment/decrement");
		
		for(int i=1; i<=10; i++){
			System.out.println(i);
		}
		
		//enhanced for loop
		int arr[] = {8,4,2,4,5,6};
		for(int num : arr){
			System.out.println(num);
		}
	}

}

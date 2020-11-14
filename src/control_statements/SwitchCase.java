package control_statements;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		switch(i){
			case 1: System.out.println("1 for Sunday"); break;
			case 2: System.out.println("2 for Monday"); break;
			case 3: System.out.println("3 for Tuesday"); break;
			case 4: System.out.println("4 for Wednesday"); break;
			case 5: System.out.println("5 for Thursday"); break;
			case 6: System.out.println("6 for Friday"); break;
			case 7: System.out.println("7 for Saturday"); break;
			default: System.out.println("Unknown week of day");
		}
	}

}

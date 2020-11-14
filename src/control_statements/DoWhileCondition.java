package control_statements;

public class DoWhileCondition {
	public static void main(String[] args) {
		//it executes at least once
		int i=10;
        do{
             System.out.println(i);
             i--;
        }while(i>0);
        
        int j=10;
        do{
        	System.out.println(j);
        	j++;
        }while(j<10);
	}
}

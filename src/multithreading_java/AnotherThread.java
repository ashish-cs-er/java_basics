package multithreading_java;

public class AnotherThread extends Thread {

	public void run() {
		for(int i=0;i<5;i++) {
			try {Thread.sleep(1000);}
			catch(Exception e) {System.out.println(e);}
			System.out.println("Value of i in thread: "+this.getName()+" is: "+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using join stops execution of all other threads till the thread being joined completes its execution");
		Thread t1 = new AnotherThread();
		Thread t2 = new AnotherThread();
		Thread t3 = new AnotherThread();
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t3.setName("Third Thread");
		
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e) {System.out.println(e);}
		t2.start();
		t3.start();
	}
}

package multithreading_java;

public class ThreadCreation extends Thread {

	public void run() {
		System.out.println("Now the thread is running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread creation is by using Thread Class or Runnable Interface");
		ThreadCreation t1 = new ThreadCreation();
		t1.start();
	}

}

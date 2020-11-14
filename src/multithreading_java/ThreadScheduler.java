package multithreading_java;

public class ThreadScheduler extends Thread {

	public void run() {
		for(int i=0; i<5;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("Value of I is: "+i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("There is no guarantee which thread will be picked by the threa scheduler fr execution");
		System.out.println("Only one thread from a process can run at a time");
		System.out.println("Thread scheduling uses preemptive scheduling or time slicing scheduling to switch between threads");
		ThreadScheduler t1 = new ThreadScheduler();
		ThreadScheduler t2 = new ThreadScheduler();
		t1.start();
		t2.start();
	}

}

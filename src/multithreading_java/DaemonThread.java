package multithreading_java;

public class DaemonThread extends Thread {

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread Running");
		}
		else {
			System.out.println("User Thread Running");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Daemon Thread is a service provider thread which stays alive till the user threads are being executed");
		System.out.println("When there is no user thread, the Daemon Thread is also terminated by JVM");
		System.out.println("Its sole purpose is to provide background support to user threads");
		
		Thread t1 = new DaemonThread();
		Thread t2 = new DaemonThread();
		Thread t3 = new DaemonThread();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}

}

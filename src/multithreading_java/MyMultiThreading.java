package multithreading_java;

public class MyMultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A Thread is the smallest part of a process than can run along with other similar parts concurrently");
		System.out.println("If an exception occurs in one thread, other threads are not affected by it");
		System.out.println("All threads of a process share same memory");
		System.out.println("The phenomenon of executing multiple threads concurrently is known as multithreading");
		System.out.println("Various possible states a thread can have are: NEW RUNNABLE BLOCKED WAITING TIMED_WAITING TERMINATED");
		System.out.println("There are two ways of creating a thread: extending Thread class, implementing Runnable interface");
		
		
		//New State: when object of thread class is created but start() is not called
		//Runnable: after the start() method is called, the thread comes to runnable state
		//Running: if the thread scheduler has selected the thread, the thread is in running state
		//Non Runnable: When thread is alive but not eligible to run
		//Terminated: When run() method exits, thread gets terminated
		
		//commonly used methods are: start(), run(), sleep(), join(), getName(), setName(), getPriority(),setPriority(), isAlive(), suspend(), resume()
		
	}

}

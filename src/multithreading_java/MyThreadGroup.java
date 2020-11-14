package multithreading_java;

public class MyThreadGroup extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadGroup runnable = new MyThreadGroup();  
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");  
          
        Thread t1 = new Thread(tg1, runnable,"one");  
        t1.start();  
        Thread t2 = new Thread(tg1, runnable,"two");  
        t2.start();  
        Thread t3 = new Thread(tg1, runnable,"three");  
        t3.start();  
             
        System.out.println("Thread Group Name: "+tg1.getName());  
        tg1.list();  
	}

}

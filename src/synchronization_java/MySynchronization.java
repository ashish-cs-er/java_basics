package synchronization_java;

class Sender { 
    public void send(String msg) { 
        System.out.println("Sending\t"  + msg ); 
        try{ 
            Thread.sleep(1000); 
        } 
        catch (Exception e) { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
} 
class ThreadedSend extends Thread{
	String msg="";
	Sender sender;
	
	ThreadedSend(String msg, Sender obj){
		this.msg = msg;
		sender = obj;
	}
	
	public void run() {
		synchronized(sender) {
			sender.send(msg);
		}
	}
}
public class MySynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Synchronization in java is to control access of multiple threads to any shared resource");
		System.out.println("There are two types of thread synchronization: 1. Mutual Exclusive 2.Cooperation");
		System.out.println("Mutual Exclusive: synchronized method,synchronized block,static synchronization");
		System.out.println("Lets check this in action");
		Sender obj = new Sender();
		ThreadedSend ts1 = new ThreadedSend("Hello", obj);
		ThreadedSend ts2 = new ThreadedSend("Bye", obj);
		ts1.start();
		ts2.start();
	}

}

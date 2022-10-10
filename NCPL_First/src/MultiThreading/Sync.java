package MultiThreading;

public class Sync {

	public static void main(String[] args) {
		B b = new B();
		Thread t1 = new Thread(b);
		Thread t2 = new Thread();
		
		t1.getName();
		t2.getName();
		
		t1.start();
		t2.start();
		
	}
}
class A{
	synchronized void	sum(int n) {
		Thread t = Thread.currentThread();
		for(int i=0;i<55;i++) { 
			System.out.println(t.getName()+"  :  "+(n+i));
		}
	}
}

class B extends Thread{
	A a = new A();
	public void run() {
		a.sum(10);
	}
}
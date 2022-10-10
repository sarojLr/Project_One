package MultiThreading;


class myThread1 implements Runnable{
	String tName;
	Thread t;
	public myThread1(String tName) {
		this.tName = tName;
		t = new Thread(this,tName);
		System.out.println("thread info : "+ t);
		t.start();
	}
	public void run() {
		try {
			for(int i =5 ;i>0;i--) {
				System.out.println(tName+" : "+i);
				t.sleep(2000);
			}
		}
		catch(Exception e) {
			System.out.println(tName+"  :  intruptted");
		}
		System.out.println(tName+"   :  exiting");
	}
}
public class Join_method {
	public static void main(String[] args) {
		
		myThread1 m1 = new myThread1("one");
		myThread1 m2 = new myThread1("two");
		myThread1 m3 = new myThread1("three");
		

		System.out.println(m1.t.isAlive());
		System.out.println(m2.t.isAlive());
		System.out.println(m3.t.isAlive());
		
		
		try {
			System.out.println("waiting to finish");
			m1.t.join();
			m1.t.join();
			m3.t.join();	
		
		}
		catch(Exception e) {
				System.out.println(e+" intrrupted");
		}
		System.out.println(m1.t.isAlive());
		System.out.println(m2.t.isAlive());
		System.out.println(m3.t.isAlive());
	}
}

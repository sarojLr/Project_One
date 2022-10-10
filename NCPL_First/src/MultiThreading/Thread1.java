package MultiThreading;

public class Thread1 {
	public static void main(String[] args)  throws InterruptedException{
		Thread t1 = new Thread("con");
		for(int i = 0;i<5;i++) {
			System.out.println(t1.getName()+" : yes");
			t1.sleep(1000);
//			System.out.println("go");
		}
		
		Thread t2 = new Thread("man");
		for(int i=0;i<5;i++) {
			System.out.println(t2.getName()+" : no");
			t2.sleep(1000);
//			System.out.println("pro");
		}
		
		t1.start();
		try {
			t1.sleep(200);
		}
		catch(InterruptedException e) {
			System.out.println("we got the  exception");
		}
		t2.start();
		System.out.println("------bye-----------");
	}
}

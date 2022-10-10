package MultiThreading;

import java.util.List;

public class Producer implements Runnable{
	private List<Integer> tasks;
	private int capacity;
	public Producer(List<Integer> tasks, int capacity) {
		super();
		this.tasks = tasks;
		this.capacity = capacity;
	}
	
	public void run() {
		int count = 0;
		while(true) {
			try {
				produce(count++);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
//				ex.printStackTrace();
			}
		}
	}
	public void produce(int i) throws InterruptedException{
		synchronized (tasks) {
			while(tasks.size()== capacity) {
				System.out.println("queue is full ::"+ Thread.currentThread().getName()+" :: is waiting  "+tasks.size()+"  is the size now");
				tasks.wait();
			}
			Thread.sleep(300);
			tasks.add(i);
			System.out.println("produced : "+i);
			tasks.notifyAll();
		}
	}
}

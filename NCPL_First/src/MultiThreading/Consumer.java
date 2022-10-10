package MultiThreading;

import java.util.List;

public class Consumer implements Runnable{
	private List<Integer> taskqueue;

	public Consumer(List<Integer> taskqueue) {
		super();
		this.taskqueue = taskqueue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				consume();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void consume() throws InterruptedException{
		synchronized (taskqueue) {
			while(taskqueue.isEmpty()) {
				System.out.println("Queue is empty  ::"+Thread.currentThread().getName()+"  size is : "+taskqueue.size());
				taskqueue.wait();
			}
			Thread.sleep(1000);
			int i = (Integer) taskqueue.remove(0);
			System.out.println("Consumed : "+i);
			taskqueue.notifyAll();
		}
	}
}

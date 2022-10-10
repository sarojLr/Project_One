package MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class ProdConsMain {

	public static void main(String[] args) {
		List<Integer> taskqueue = new ArrayList<Integer>();
		int cap = 5;
		
		Thread tProd = new Thread(new Producer(taskqueue,cap));
		Thread tConsu = new Thread(new Consumer(taskqueue));
		
		tProd.start();
		tConsu.start();
	}
}

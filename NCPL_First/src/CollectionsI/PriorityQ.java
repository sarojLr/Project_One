package CollectionsI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Set;

class Pqueue implements Comparable<Pqueue>{
	
	int rank;
	String name;
	
	public Pqueue(int rank, String name) {
		super();
		this.rank = rank;
		this.name = name;
	}

	@Override
	public int compareTo(Pqueue p) {
		if(rank<p.rank)
			return -1;
		if(rank>p.rank)
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "Pqueue [rank=" + rank + ", name=" + name + "]";
	}
	
	
	
	
}

public class PriorityQ {

	public static void main(String[] args) {
		PriorityQueue<Pqueue> pq = new PriorityQueue<>();
		
//		ArrayList<String> pq = new ArrayList<>();
//		Set<String> pq = new HashSet<>();
//		
		pq.add(new Pqueue(2,"zoro"));
		pq.add(new Pqueue(3,"acto"));
		pq.add(new Pqueue(7,"mia"));
//		pq.add("akea");
		pq.add(new Pqueue(1,"sonk"));
		pq.add(new Pqueue(5, "Shan"));
//		pq.add(3);
//		pq.add(4);
//		pq.add(5);
//		pq.add(6);
//		pq.add("aab");
//		pq.add(null);
		
//		ListIterator<String> ls = pq.listIterator();
//		pq.add("pine");	
		
		Iterator<Pqueue> ls = pq.iterator();
		
		
//		while(ls.hasNext()) {
//			System.out.println(ls.next());
//		}
//		
//		while(ls.hasPrevious()) {
//			System.out.println(ls.previous());
//		}


		
		System.out.println(pq.poll().toString());
	}
}

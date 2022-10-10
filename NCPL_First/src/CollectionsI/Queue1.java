package CollectionsI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Queue1 {
	
	public static void main(String[] args) {
//		
	        // Creating empty priority queue
	        Queue<Integer> pQueue = new PriorityQueue<>();
//		Stack<Integer> pQueue = new Stack<>();
	  
	        // Adding items to the pQueue using add()
	        pQueue.add(10);
	        pQueue.add(20);
	        pQueue.add(15);
	        pQueue.add(25);
	  
	        // Printing the top element of PriorityQueue
//	        System.out.println(pQueue.peek());
	  
	        // Printing the top element and removing it
	        // from the PriorityQueue container
//	        System.out.println(pQueue.pop());

	        System.out.println(pQueue.poll());
	  
	  
	        // Printing the top element again
//	        System.out.println(pQueue.peek());
	        
	        
	        Iterator<Integer> ii = pQueue.iterator();	   
	        
	        while(ii.hasNext()) {
	        	System.out.println(ii.next());
	        	
	        }
	
	}
}

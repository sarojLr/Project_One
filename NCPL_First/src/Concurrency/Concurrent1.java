package Concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Concurrent1 extends Thread{
	static CopyOnWriteArrayList a1 = new CopyOnWriteArrayList();
//	static ArrayList a1 = new ArrayList<>();
	
	
	public void run() {
		try {
//			System.out.println("what");
			Thread.sleep(3150);
		}
		catch(InterruptedException e) {
			System.out.println("waiting");
		}
//		System.out.println("print");
		a1.add('n');
		
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		a1.add('a');
		a1.add('b');
		a1.add('c');
		
		Concurrent1 c1 = new Concurrent1();

		
		c1.start();
		
		Iterator i1 = a1.iterator();
		
		while(i1.hasNext()) {
			char s = (char) i1.next();
			System.out.println(s);
			Thread.sleep(1000);
			a1.add('x');

//			System.out.println(a1);
		}
		System.out.println(a1);
//	static ArrayList l = new ArrayList();
//    public void run()
//    {
//        try {
//            Thread.sleep(2000);
//        }
//        catch (InterruptedException e) {
//            System.out.println("Child Thread" + 
//                      " going to add element");
//        }
//  
//        // Child thread trying to add new
//        // element in the Collection object
//        l.add("D");
//    }
//  
//    public static void main(String[] args) 
//                   throws InterruptedException
//    {
//        l.add("A");
//        l.add("B");
//        l.add("c");
//  
//        // We create a child thread that is 
//        // going to modify ArrayList l.
//        Concurrent1 t = new Concurrent1();
//        t.start();
//  
//        // Now we iterate through the ArrayList
//        // and get exception.
//        Iterator itr = l.iterator();
//        while (itr.hasNext()) {
//            String s = (String)itr.next();
//            System.out.println(s);
//            Thread.sleep(2000);
//        }
//        System.out.println(l);
    }

}

package CollectionsI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Jstacks {

	public static void main(String[] args) throws Exception{
		Stack<Integer> st = new Stack<>();
		
		
		st.add(109);
		st.push(784);
		st.push(78542);
		st.push(6);
//		st.removeAll(st);
		st.pop();		//to remove the last element ;
		st.remove(2);		// to remove the index element;
		

		ListIterator<Integer> it = st.listIterator();
//		st.push(2525);
//		ListIterator<Integer> it = st.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}

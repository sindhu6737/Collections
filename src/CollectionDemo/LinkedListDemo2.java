package CollectionDemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		LinkedList dup=new LinkedList();
		l.add(15);
		l.add(15);
		l.add(30);
		l.add(10);
		l.add(5);
	
		dup.addAll(l);
		System.out.println(dup);
		
		dup.removeAll(l);
		System.out.println(dup.isEmpty());
		
		//sorting
		Collections.sort(l);
		System.out.println(l);
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		
		Collections.shuffle(l);
		System.out.println(l);
		//Methods specific to linked list
		l.addFirst(100);
		System.out.println(l);
		
		l.addLast(2000);
		System.out.println(l);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l);
		
		
		
		
	}

}

package CollectionDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		//LinkedList <Integer> li=new LinkedList<Integer>();
		l.add(10);
		l.add(30);
		l.add(60);
		l.add("abc");
		l.add('A');
		System.out.println(l);
		System.out.println(l.size());
		
		System.out.println(l.remove(2));
		System.out.println(l);
		
		l.add(2,"IVL");
		System.out.println(l);
		//Retrival
		System.out.println(l.get(3));
		
		//update
		l.set(2, "Pune");
		System.out.println(l);
		
		System.out.println(l.contains("Pune"));
		
		System.out.println(l.isEmpty());
		
		//For loop
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		//for .. each
		for(Object elements:l) {
			System.out.println(elements);
		}
		
		//iterator
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println("Using iterator: "+it.next());
		}
		
		
		
		
		

	}
}

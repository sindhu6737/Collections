package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("abc");
		al.add('B');
		al.add(true);

		System.out.println(al);
		System.out.println("number of elements: "+al.size());
		
		//al.remove(2);
		//al.remove("abc");
 		
		System.out.println(al);
		
		al.add(1,50);
		System.out.println(al);
		
		System.out.println(al.get(1));
		al.set(1, 40); 
		System.out.println(al);
		
		System.out.println(al.contains(40));//searching
		
		System.out.println(al.isEmpty());
		
		
		
		//FOR
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			
		}
		//FOR.. EACH
		for(Object e:al) {
			System.out.println("for .. each: "+e);
			
		}
		
		//ITERATOR
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println("iterator: "+it.next());			
		}

	}

}

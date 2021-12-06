package CollectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		//No duplicates allowed in hashSet
		//insertion order not preserved
		HashSet h=new HashSet();//default capacity 16 and load factor 0.75
		HashSet <Integer> evennumber=new HashSet<Integer>();
		HashSet <Integer> numbers=new HashSet<Integer>();
		// hs=new HashSet(100);//capacity=100
		//HashSet hset=new HashSet(100,(float)0.90);
		//HashSet<Integer> hs=new HashSet<Integer>();
		evennumber.add(2);
		evennumber.add(4);
		evennumber.add(10);
		evennumber.add(8);

		System.out.println("first set :"+evennumber);
		//adding to numbers
		numbers.addAll(evennumber);
		numbers.add(20);
		System.out.println(numbers);

		//removeall
		numbers.removeAll(evennumber);
		System.out.println(numbers);


		//Adding elements
		h.add(10);
		h.add(30);
		h.add("Hello");
		h.add('X');
		System.out.println(h);



		//Remove
		h.remove(30);
		System.out.println(h);



		System.out.println( h.contains("Hello"));

		System.out.println(h.isEmpty());

		//Reading objects using for each loop
		for(Object elem:h) {
		System.out.println(elem);
		}
		//Iterator
		System.out.println("using iterator");
		Iterator it=h.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
	}

}

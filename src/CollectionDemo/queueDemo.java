package CollectionDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class queueDemo {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		
		//Adding elements
		q.add(5);
		q.add(5);
		q.add(10);
		q.add(20);
		q.offer(40);
		
		System.out.println(q);
		
		//head element
		System.out.println(q.element());//when empty shows exception
		System.out.println(q.peek());//returns null if queue is empty
		
		//return and remove
		System.out.println(q.remove());
		System.out.println(q.poll());
		System.out.println(q);
		
		Iterator it=q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Object elem:q) {
			System.out.println(elem);
		}
		//heterogenous data not allowed in priority queue so we use linked list
		
		LinkedList que=new LinkedList();
		que.add(5);
		que.add(5);
		que.add(10);
		que.add(20);
		que.offer("sindhu");
		System.out.println(que);
		System.out.println(que.peek());
		System.out.println(que.poll());
		System.out.println(que);

	}

}

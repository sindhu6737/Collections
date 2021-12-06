package CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
		String arr[]= {"a","b","c"};
		
		for(String val:arr) {
			System.out.println(val);
		}
		ArrayList arrl=new ArrayList(Arrays.asList(arr));
		System.out.println(arrl);
				
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(30);
	al.add(20);
	
	
	ArrayList array=new ArrayList();
	array.addAll(al);
	System.out.println(array.isEmpty());
	System.out.println(array);
	
	array.removeAll(al);
	System.out.println(array);
	System.out.println(array.isEmpty());
	
	Collections.sort(al);
	System.out.println(al);
	
	Collections.sort(al,Collections.reverseOrder());
	System.out.println(al);
	
	Collections.shuffle(al);
	System.out.println(al);
	
	
	
	}

}

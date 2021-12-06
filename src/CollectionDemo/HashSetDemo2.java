package CollectionDemo;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		//Union,intersection ,difference
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		System.out.println(set1);

		HashSet<Integer> set2=new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		System.out.println(set2);
		//union
		// set1.addAll(set2);
		// System.out.println(set1);
		//
		// //intersection
		// set1.retainAll(set2);
		// System.out.println(set1);

		//difference
		// set1.removeAll(set2);
		// System.out.println(set1);

		//subset
		System.out.println(set1.containsAll(set2));
		System.out.println(set1);

	}

}

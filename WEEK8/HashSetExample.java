package WEEK8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(2);
		s.add(6);
		s.add(2);
		s.add(5);
		Iterator<Integer> it = s.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		}

}

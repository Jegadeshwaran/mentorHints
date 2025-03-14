package WEEK8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> markDetails = new HashMap<>();
		markDetails.put("Arun", 463);
		markDetails.put("kishor", 450);
		markDetails.put("Addam", 400);
		markDetails.put("Raju", 493);
		
//		for(String s: markDetails.keySet()) {
//			System.out.println(s+" :" +markDetails.get(s));
//		}
		
		Iterator it = markDetails.entrySet().iterator();
		
		while(it.hasNext()) {
			
			@SuppressWarnings("unchecked")
			Map.Entry<String, Integer> map = (Entry<String, Integer>) it.next();
			System.out.println(map.getKey() + " " + map.getValue());
		}
		
	}

}

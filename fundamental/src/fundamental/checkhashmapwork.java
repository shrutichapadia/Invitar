package fundamental;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class checkhashmapwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "1 hashmap value");
		hm.put(102, "1 hashmap value");
		hm.put(103, "3 hashmap value");
		hm.put(105, "5 hashmap value");
		hm.put(107, "7 hashmap value");
		hm.put(106, "6 hashmap value");
		hm.put(109, "9 hashmap value");
		
		Iterator it = hm.entrySet().iterator();
		while (it.hasNext()) {
		 Map.Entry checkhashmapwork = (Map.Entry)it.next();
		 System.out.println("data in hashmap code is    " + checkhashmapwork.getKey() + "     Its value are:    " +checkhashmapwork.getValue() );
		it.remove();
		}
	}

}

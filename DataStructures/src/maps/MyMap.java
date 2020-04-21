package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyMap {

	//consists of key, value pairs.
	//key properties: each key has to be unique and only mapped to one value
	//key can be mapped to a duplicate value
	
	//Methods
	// basic operations:
	//  put, get, remove, containsKey, containsValue, size, and empty
	// bulk operations:
	//  putAll, clear
	// collection views
	//  keySet, entrySet, and values
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> mOne = new HashMap<>();
		// allows duplicate values but not keys duh
		// allows a single null key and multiple null values
		// does not guarantee order
		Map<Integer, Integer> mTwo = new TreeMap<>();
		// does not allow null keys but does allow null values
		// sorted according to the natural ordering of the keys.
		Map<String, String> mThree = new LinkedHashMap<>();
		// maintains insertion order
		Map<Integer, Integer> mFour = new HashMap<>();
		
		mOne.put(1,"One");
		mOne.put(2, "Two");
		mOne.put(3, "One");
		mOne.put(null, null);
		System.out.println(mOne);
		System.out.println(mOne.get(1));
		System.out.println(mOne.remove(1));
		System.out.println(mOne);
		System.out.println(mOne.containsKey(2));
		System.out.println(mOne.containsValue("Two"));
		System.out.println(mOne.size());
		System.out.println(mOne.isEmpty());
		
		mTwo.put(1, null);
		mTwo.put(2, 2);
		mTwo.put(3, 4);
		mTwo.put(-1, -1);
		System.out.println(mTwo);
		
		mThree.put("hey", "yall");
		mThree.put("apple", "apple");
		System.out.println(mThree);
		System.out.println(mThree.keySet());
		System.out.println(mThree.values());
		System.out.println(mThree.entrySet());
		
		mFour.putAll(mTwo); //OVERRIDES TYPE OF MAP BUT INPUTS NEED TO BE OF SAME TYPE
		System.out.println(mFour);
		mFour.clear();
		System.out.println(mFour);
		
		Set<Integer> myKey = mTwo.keySet(); // create set
		
		for (int i:myKey) {// iterate through set
			System.out.println(mTwo.get(i));//get values
		}
	}
	
}

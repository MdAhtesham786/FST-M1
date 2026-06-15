package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity10 {

	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(1, "Green");
		myMap.put(2, "Blue");
		myMap.put(3, "Black");
		myMap.put(4, "Red");
		myMap.put(5, "Yellow");
		
		myMap.remove(2);
		
		System.out.println(myMap.containsValue("Green"));
		System.out.println("Size of the Map: " + myMap.size());
		
		
		
		
	}

}

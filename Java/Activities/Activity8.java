package activities;

import java.util.ArrayList;

public class Activity8 {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Apple");
		myList.add("Banana");
		myList.add("Grapes");
		myList.add("Mango");
		myList.add("pineapple");
		
		for(String fruit:myList) {
			System.out.println(fruit);
		}
		
		System.out.println("**********");
		
		System.out.println(myList.get(2));
		System.out.println("**********");
		System.out.println(myList.contains("Banana"));
		System.out.println("**********");
		System.out.println(myList.size());
		System.out.println("**********");
		myList.remove("Grapes");
		System.out.println(myList.size());
	}

}

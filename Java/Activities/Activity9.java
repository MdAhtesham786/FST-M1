package activities;

import java.util.HashSet;

public class Activity9 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("India");
		hs.add("brazil");
		hs.add("united states");
		hs.add("united kingdom");
		hs.add("Australia");
		hs.add("Thailand");
		
		System.out.println("HashSetSize: " + hs.size());
		hs.remove("united states");
		
		if(hs.remove("Germany")) {
        	System.out.println("Germany removed from the Set");
        } else {
        	System.out.println("Germany is not present in the Set");
        }
		System.out.println("Check Country is present or not :- " + hs.contains("India"));
		System.out.println("Lits of countrys :- " + hs);

	}

}

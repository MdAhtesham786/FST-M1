package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
        Random indexGen = new Random();
        
       System.out.println("Enter the number of elements to be added in the list:");
       while(scan.hasNextInt()) {
		   list.add(scan.nextInt());
	   }
       
       Integer nums[] = list.toArray(new Integer[0]);
       int ind=indexGen.nextInt(nums.length);
       
       System.out.println("Index value generated: " + ind);
       System.out.println("Random number from the list: " + nums[ind]);
       scan.close();
       
        
		

	}

}

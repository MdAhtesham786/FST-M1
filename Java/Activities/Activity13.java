package activities;

import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		String age = scan.nextLine();
 
		
		registerUser(age);
	}

	public static void registerUser(String age)
	{

		try {

			int ageInt = Integer.parseInt(age);
			if(ageInt<18)
			{
				throw new IllegalArgumentException("Users must be at least 18 years old.");
			}
			else
			{
				System.out.println("User registered successfully.");
				
			}
		}


		catch(NumberFormatException e)
		{
			System.out.println("Error: Age must be a valid number.");
		}



	}

}

package activities;

public class Car {
	
	 String color;
	 String transmission;
	 int make;
	 int tyres;
	 int doors;
	 
	 public Car() {
		 tyres = 4;
		 doors = 4;
	 }
	 
	 public void displayCharacteristics() {
		 System.out.println("Color of the car: " + color);
		 System.out.println("Transmission of the car: " + transmission);
		 System.out.println("Make of the car: " + make);
		 System.out.println("Number of tyres: " + tyres);
		 System.out.println("Number of doors: " + doors);
	 }
	 
	 public void accelerate() {
		 System.out.println("Car is accelerating");
	 }
	 
	 public void brake() {
		 System.out.println("Car is braking");
	 }

}

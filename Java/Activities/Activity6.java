package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		Plane plane = new Plane(4);
		String[] passengers = {"John", "Steve", "Anna","Sanu","Mat","Ravi"};
		plane.OnBoard(passengers);
		
		System.out.println("Plane took off at: " + plane.takeOff());
		System.out.print("Passengers on board: ");
		plane.getPassengers();
		System.out.println();
		
		Thread.sleep(5000);
		
		plane.land();
		System.out.println("Plane landed at: " + plane.getLastTimeLanded());
		

	}

}

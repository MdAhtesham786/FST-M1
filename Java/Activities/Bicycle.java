package activities;

public class Bicycle implements BycleParts, BycleOperations {
	
	int gears;
	int currentSpeed;
	
public Bicycle(int gears,int currentSpeed) {
		
		this.gears=gears;
		this.currentSpeed=currentSpeed;
	}
	
	@Override
	public void applyBrake(int decrement) {
		this.currentSpeed-=decrement;
		
	}

	@Override
	public void speedUp(int increment) {
		this.currentSpeed+=increment;
		
	}
	
	public String bicycleDesc() {
		return("No of gears are "+ gears +" and the current speed of bicycle is "+ maxSpeed);
	}
	

	
}
	



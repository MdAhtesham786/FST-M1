package activities;

public class MountainBike extends Bicycle {
	
	int seatHeight;
	public MountainBike(int gears,int currentSpeed,int seatHeight) {
		super(gears,currentSpeed);
		this.seatHeight=seatHeight;
	}
	
	public void setHeight(int newValue) {
		this.seatHeight=newValue;
	}
	
	public String bicycleDesc() {
		return(super.bicycleDesc()+" and the seat height is "+ seatHeight);
	}

}

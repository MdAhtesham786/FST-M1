package Activitys;

public class MountainBike extends Bicycle{
    int seatHeight;
    public MountainBike(int gears, int currentSpeed,int seatHeight) {
        super(gears, currentSpeed);
        this.seatHeight=seatHeight;
    }

    public void seatHeight(int value)
    {
        seatHeight=value;
    }

    @Override
    public String bicycleDesc() {
        return("seatHeight "+ seatHeight);
    }
}
